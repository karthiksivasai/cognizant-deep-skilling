-- Sample Data Setup for Customer Loan Management Exercise
-- Run this script first to create test data

-- Create sample customers with different ages and balances
INSERT INTO Customers (customer_id, age, balance, current_loan_rate, IsVIP) 
VALUES (101, 65, 8500, 8.5, 'FALSE');

INSERT INTO Customers (customer_id, age, balance, current_loan_rate, IsVIP) 
VALUES (102, 72, 15000, 7.0, 'FALSE');

INSERT INTO Customers (customer_id, age, balance, current_loan_rate, IsVIP) 
VALUES (103, 45, 25000, 6.5, 'FALSE');

INSERT INTO Customers (customer_id, age, balance, current_loan_rate, IsVIP) 
VALUES (104, 68, 5000, 9.0, 'FALSE');

INSERT INTO Customers (customer_id, age, balance, current_loan_rate, IsVIP) 
VALUES (105, 35, 12000, 7.5, 'FALSE');

INSERT INTO Customers (customer_id, age, balance, current_loan_rate, IsVIP) 
VALUES (106, 28, 8000, 8.0, 'FALSE');

INSERT INTO Customers (customer_id, age, balance, current_loan_rate, IsVIP) 
VALUES (107, 61, 18000, 6.8, 'FALSE');

-- Create sample loans with various due dates
INSERT INTO Loans (loan_id, customer_id, due_date) 
VALUES (1001, 101, SYSDATE + 15);

INSERT INTO Loans (loan_id, customer_id, due_date) 
VALUES (1002, 102, SYSDATE + 25);

INSERT INTO Loans (loan_id, customer_id, due_date) 
VALUES (1003, 103, SYSDATE + 45);

INSERT INTO Loans (loan_id, customer_id, due_date) 
VALUES (1004, 104, SYSDATE + 10);

INSERT INTO Loans (loan_id, customer_id, due_date) 
VALUES (1005, 105, SYSDATE + 5);

INSERT INTO Loans (loan_id, customer_id, due_date) 
VALUES (1006, 106, SYSDATE + 60);

INSERT INTO Loans (loan_id, customer_id, due_date) 
VALUES (1007, 107, SYSDATE + 20);

COMMIT;

-- Display the sample data
SELECT 'CUSTOMERS DATA:' AS Info FROM DUAL;
SELECT customer_id, age, balance, current_loan_rate, IsVIP 
FROM Customers 
ORDER BY customer_id;

SELECT 'LOANS DATA:' AS Info FROM DUAL;
SELECT loan_id, customer_id, TO_CHAR(due_date, 'DD-MON-YYYY') as due_date 
FROM Loans 
ORDER BY due_date; 