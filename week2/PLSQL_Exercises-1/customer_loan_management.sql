DECLARE
    v_customer_id NUMBER;
    v_customer_age NUMBER;
    v_customer_balance NUMBER;
    v_current_rate NUMBER;
    
    v_loan_id NUMBER;
    v_loan_customer_id NUMBER;
    v_due_date DATE;
    
    CURSOR c_senior_customers IS
        SELECT customer_id, age, current_loan_rate
        FROM Customers
        WHERE age > 60;
    
    CURSOR c_high_balance_customers IS
        SELECT customer_id, balance
        FROM Customers
        WHERE balance > 10000;
    
    CURSOR c_upcoming_loans IS
        SELECT loan_id, customer_id, due_date
        FROM Loans
        WHERE due_date BETWEEN SYSDATE AND SYSDATE + 30;

BEGIN
    DBMS_OUTPUT.PUT_LINE('Processing senior customers for interest rate reduction...');
    
    OPEN c_senior_customers;
    LOOP
        FETCH c_senior_customers INTO v_customer_id, v_customer_age, v_current_rate;
        EXIT WHEN c_senior_customers%NOTFOUND;
        
        v_current_rate := v_current_rate - 1;
        
        UPDATE Customers
        SET current_loan_rate = v_current_rate
        WHERE customer_id = v_customer_id;
        
        DBMS_OUTPUT.PUT_LINE('Customer ID: ' || v_customer_id || 
                           ' - Age: ' || v_customer_age || 
                           ' - New Rate: ' || v_current_rate || '%');
    END LOOP;
    CLOSE c_senior_customers;
    
    DBMS_OUTPUT.PUT_LINE('Processing customers for VIP status update...');
    
    OPEN c_high_balance_customers;
    LOOP
        FETCH c_high_balance_customers INTO v_customer_id, v_customer_balance;
        EXIT WHEN c_high_balance_customers%NOTFOUND;
        
        UPDATE Customers
        SET IsVIP = 'TRUE'
        WHERE customer_id = v_customer_id;
        
        DBMS_OUTPUT.PUT_LINE('Customer ID: ' || v_customer_id || 
                           ' - Balance: ' || v_customer_balance || 
                           ' - VIP Status Updated');
    END LOOP;
    CLOSE c_high_balance_customers;
    
    DBMS_OUTPUT.PUT_LINE('Processing loan reminders for next 30 days...');
    
    OPEN c_upcoming_loans;
    LOOP
        FETCH c_upcoming_loans INTO v_loan_id, v_loan_customer_id, v_due_date;
        EXIT WHEN c_upcoming_loans%NOTFOUND;
        
        DBMS_OUTPUT.PUT_LINE('REMINDER: Customer ID ' || v_loan_customer_id || 
                           ' has Loan ID ' || v_loan_id || 
                           ' due on ' || TO_CHAR(v_due_date, 'DD-MON-YYYY'));
    END LOOP;
    CLOSE c_upcoming_loans;
    
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('All updates completed successfully.');
    
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error occurred: ' || SQLERRM);
END;
