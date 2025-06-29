-- SQLite version to demonstrate the PL/SQL logic
-- This shows the same business logic but adapted for SQLite

-- Create the tables
CREATE TABLE IF NOT EXISTS Customers (
    customer_id INTEGER PRIMARY KEY,
    age INTEGER,
    balance REAL,
    current_loan_rate REAL,
    IsVIP TEXT DEFAULT 'FALSE'
);

CREATE TABLE IF NOT EXISTS Loans (
    loan_id INTEGER PRIMARY KEY,
    customer_id INTEGER,
    due_date DATE,
    FOREIGN KEY (customer_id) REFERENCES Customers(customer_id)
);

-- Insert sample data
INSERT OR REPLACE INTO Customers (customer_id, age, balance, current_loan_rate, IsVIP) VALUES
(101, 65, 8500, 8.5, 'FALSE'),
(102, 72, 15000, 7.0, 'FALSE'),
(103, 45, 25000, 6.5, 'FALSE'),
(104, 68, 5000, 9.0, 'FALSE'),
(105, 35, 12000, 7.5, 'FALSE'),
(106, 28, 8000, 8.0, 'FALSE'),
(107, 61, 18000, 6.8, 'FALSE');

INSERT OR REPLACE INTO Loans (loan_id, customer_id, due_date) VALUES
(1001, 101, date('now', '+15 days')),
(1002, 102, date('now', '+25 days')),
(1003, 103, date('now', '+45 days')),
(1004, 104, date('now', '+10 days')),
(1005, 105, date('now', '+5 days')),
(1006, 106, date('now', '+60 days')),
(1007, 107, date('now', '+20 days'));

-- Show initial data
.print "=== INITIAL DATA ==="
.print "Customers:"
SELECT customer_id, age, balance, current_loan_rate, IsVIP FROM Customers ORDER BY customer_id;

.print ""
.print "Loans:"
SELECT loan_id, customer_id, due_date FROM Loans ORDER BY due_date;

-- Simulate PL/SQL logic with regular SQL

-- 1. Update interest rates for customers over 60
.print ""
.print "=== UPDATING INTEREST RATES FOR SENIOR CUSTOMERS ==="
UPDATE Customers 
SET current_loan_rate = current_loan_rate - 1 
WHERE age > 60;

SELECT 'Updated Customer ID: ' || customer_id || ' - Age: ' || age || ' - New Rate: ' || current_loan_rate || '%' as message
FROM Customers 
WHERE age > 60;

-- 2. Update VIP status for high balance customers
.print ""
.print "=== UPDATING VIP STATUS FOR HIGH BALANCE CUSTOMERS ==="
UPDATE Customers 
SET IsVIP = 'TRUE' 
WHERE balance > 10000;

SELECT 'Customer ID: ' || customer_id || ' - Balance: ' || balance || ' - VIP Status Updated' as message
FROM Customers 
WHERE balance > 10000;

-- 3. Show loan reminders for next 30 days
.print ""
.print "=== LOAN REMINDERS FOR NEXT 30 DAYS ==="
SELECT 'REMINDER: Customer ID ' || customer_id || ' has Loan ID ' || loan_id || ' due on ' || due_date as reminder
FROM Loans 
WHERE due_date BETWEEN date('now') AND date('now', '+30 days')
ORDER BY due_date;

-- Show final data
.print ""
.print "=== FINAL DATA AFTER UPDATES ==="
.print "Customers:"
SELECT customer_id, age, balance, current_loan_rate, IsVIP FROM Customers ORDER BY customer_id;

.print ""
.print "All updates completed successfully!" 