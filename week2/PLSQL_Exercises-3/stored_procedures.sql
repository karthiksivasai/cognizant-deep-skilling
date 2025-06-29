CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
    total_accounts_processed NUMBER := 0;
    
    CURSOR savings_accounts_cursor IS
        SELECT account_id, balance
        FROM Accounts
        WHERE account_type = 'SAVINGS';
        
    acc_id NUMBER;
    current_bal NUMBER;
    updated_bal NUMBER;
    
BEGIN
    DBMS_OUTPUT.PUT_LINE('Processing monthly interest for savings accounts...');
    
    OPEN savings_accounts_cursor;
    LOOP
        FETCH savings_accounts_cursor INTO acc_id, current_bal;
        EXIT WHEN savings_accounts_cursor%NOTFOUND;
        
        updated_bal := current_bal + (current_bal * 0.01);
        
        UPDATE Accounts
        SET balance = updated_bal,
            last_modified = SYSDATE
        WHERE account_id = acc_id;
        
        total_accounts_processed := total_accounts_processed + 1;
        
        DBMS_OUTPUT.PUT_LINE('Account ID: ' || acc_id || 
                           ' - Old Balance: ' || current_bal || 
                           ' - New Balance: ' || updated_bal);
    END LOOP;
    CLOSE savings_accounts_cursor;
    
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Interest processing complete. Total accounts updated: ' || 
                       total_accounts_processed);
                       
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error occurred during interest processing: ' || SQLERRM);
        RAISE;
END ProcessMonthlyInterest;
/

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    dept_id IN NUMBER,
    bonus_percent IN NUMBER
) IS
    emp_count NUMBER := 0;
    
    CURSOR dept_employees IS
        SELECT employee_id, salary, first_name, last_name
        FROM Employees
        WHERE department_id = dept_id;
        
    emp_id NUMBER;
    old_salary NUMBER;
    new_salary NUMBER;
    fname VARCHAR2(50);
    lname VARCHAR2(50);
    
BEGIN
    IF bonus_percent <= 0 THEN
        RAISE_APPLICATION_ERROR(-20001, 'Bonus percentage must be positive');
    END IF;
    
    IF dept_id <= 0 THEN
        RAISE_APPLICATION_ERROR(-20002, 'Invalid department ID');
    END IF;
    
    DBMS_OUTPUT.PUT_LINE('Applying ' || bonus_percent || '% bonus to department ' || dept_id);
    
    OPEN dept_employees;
    LOOP
        FETCH dept_employees INTO emp_id, old_salary, fname, lname;
        EXIT WHEN dept_employees%NOTFOUND;
        
        new_salary := old_salary * (1 + bonus_percent / 100);
        
        UPDATE Employees
        SET salary = new_salary,
            last_updated = SYSDATE
        WHERE employee_id = emp_id;
        
        emp_count := emp_count + 1;
        
        DBMS_OUTPUT.PUT_LINE(fname || ' ' || lname || 
                           ' - Previous: ' || old_salary || 
                           ' - Updated: ' || new_salary);
    END LOOP;
    CLOSE dept_employees;
    
    IF emp_count = 0 THEN
        DBMS_OUTPUT.PUT_LINE('No employees found in department ' || dept_id);
    ELSE
        COMMIT;
        DBMS_OUTPUT.PUT_LINE('Bonus update completed for ' || emp_count || ' employees');
    END IF;
    
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Bonus update failed: ' || SQLERRM);
        RAISE;
END UpdateEmployeeBonus;
/

CREATE OR REPLACE PROCEDURE TransferFunds(
    source_account IN NUMBER,
    target_account IN NUMBER,
    transfer_amt IN NUMBER
) IS
    source_bal NUMBER;
    target_bal NUMBER;
    new_source_bal NUMBER;
    new_target_bal NUMBER;
    
BEGIN
    IF transfer_amt <= 0 THEN
        RAISE_APPLICATION_ERROR(-20003, 'Transfer amount must be positive');
    END IF;
    
    IF source_account = target_account THEN
        RAISE_APPLICATION_ERROR(-20004, 'Cannot transfer to same account');
    END IF;
    
    DBMS_OUTPUT.PUT_LINE('Initiating transfer of ' || transfer_amt || 
                       ' from account ' || source_account || 
                       ' to account ' || target_account);
    
    SELECT balance INTO source_bal
    FROM Accounts
    WHERE account_id = source_account;
    
    IF source_bal < transfer_amt THEN
        RAISE_APPLICATION_ERROR(-20005, 'Insufficient funds. Available: ' || 
                              source_bal || ', Required: ' || transfer_amt);
    END IF;
    
    SELECT balance INTO target_bal
    FROM Accounts
    WHERE account_id = target_account;
    
    new_source_bal := source_bal - transfer_amt;
    new_target_bal := target_bal + transfer_amt;
    
    UPDATE Accounts
    SET balance = new_source_bal,
        last_modified = SYSDATE
    WHERE account_id = source_account;
    
    UPDATE Accounts
    SET balance = new_target_bal,
        last_modified = SYSDATE
    WHERE account_id = target_account;
    
    INSERT INTO Transaction_Log (from_account, to_account, amount, transaction_date, transaction_type)
    VALUES (source_account, target_account, transfer_amt, SYSDATE, 'TRANSFER');
    
    COMMIT;
    
    DBMS_OUTPUT.PUT_LINE('Transfer successful!');
    DBMS_OUTPUT.PUT_LINE('Source account ' || source_account || 
                       ' balance: ' || new_source_bal);
    DBMS_OUTPUT.PUT_LINE('Target account ' || target_account || 
                       ' balance: ' || new_target_bal);
    
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Account not found');
        RAISE_APPLICATION_ERROR(-20006, 'Invalid account number');
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Transfer failed: ' || SQLERRM);
        RAISE;
END TransferFunds;

BEGIN
    ProcessMonthlyInterest;
END;
/

BEGIN
    UpdateEmployeeBonus(1, 10);
END;
/

BEGIN
    TransferFunds(1001, 1002, 500);
END;
/