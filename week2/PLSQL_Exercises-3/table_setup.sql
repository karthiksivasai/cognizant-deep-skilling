
CREATE TABLE Accounts (
    account_id NUMBER PRIMARY KEY,
    account_type VARCHAR2(20) NOT NULL,
    balance NUMBER(10,2) DEFAULT 0,
    customer_id NUMBER,
    last_modified DATE DEFAULT SYSDATE
);


CREATE TABLE Employees (
    employee_id NUMBER PRIMARY KEY,
    first_name VARCHAR2(50) NOT NULL,
    last_name VARCHAR2(50) NOT NULL,
    department_id NUMBER NOT NULL,
    salary NUMBER(10,2) NOT NULL,
    hire_date DATE DEFAULT SYSDATE,
    last_updated DATE DEFAULT SYSDATE
);


CREATE TABLE Transaction_Log (
    transaction_id NUMBER PRIMARY KEY,
    from_account NUMBER,
    to_account NUMBER,
    amount NUMBER(10,2),
    transaction_date DATE,
    transaction_type VARCHAR2(20)
);


CREATE SEQUENCE transaction_seq START WITH 1 INCREMENT BY 1;


INSERT INTO Accounts (account_id, account_type, balance, customer_id) VALUES
(1001, 'SAVINGS', 5000.00, 101);

INSERT INTO Accounts (account_id, account_type, balance, customer_id) VALUES
(1002, 'SAVINGS', 7500.00, 102);

INSERT INTO Accounts (account_id, account_type, balance, customer_id) VALUES
(1003, 'CHECKING', 2000.00, 103);

INSERT INTO Accounts (account_id, account_type, balance, customer_id) VALUES
(1004, 'SAVINGS', 12000.00, 104);

INSERT INTO Accounts (account_id, account_type, balance, customer_id) VALUES
(1005, 'SAVINGS', 3500.00, 105);

INSERT INTO Accounts (account_id, account_type, balance, customer_id) VALUES
(1006, 'CHECKING', 8000.00, 106);


INSERT INTO Employees (employee_id, first_name, last_name, department_id, salary) VALUES
(201, 'John', 'Smith', 1, 50000);

INSERT INTO Employees (employee_id, first_name, last_name, department_id, salary) VALUES
(202, 'Jane', 'Doe', 1, 55000);

INSERT INTO Employees (employee_id, first_name, last_name, department_id, salary) VALUES
(203, 'Mike', 'Johnson', 2, 48000);

INSERT INTO Employees (employee_id, first_name, last_name, department_id, salary) VALUES
(204, 'Sarah', 'Wilson', 1, 52000);

INSERT INTO Employees (employee_id, first_name, last_name, department_id, salary) VALUES
(205, 'David', 'Brown', 2, 46000);

INSERT INTO Employees (employee_id, first_name, last_name, department_id, salary) VALUES
(206, 'Lisa', 'Davis', 3, 60000);

COMMIT;


SELECT 'ACCOUNTS DATA:' AS Info FROM DUAL;
SELECT account_id, account_type, balance, customer_id 
FROM Accounts 
ORDER BY account_id;

SELECT 'EMPLOYEES DATA:' AS Info FROM DUAL;
SELECT employee_id, first_name, last_name, department_id, salary 
FROM Employees 
ORDER BY department_id, employee_id; 