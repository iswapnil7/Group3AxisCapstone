CREATE TABLE Group3_AxisBank_customer (
  customer_id INT PRIMARY KEY,
  customerName VARCHAR(255) NOT NULL,
  credit_limit DECIMAL(10, 2) NOT NULL,
  applicable DECIMAL(10, 2) NOT NULL,
  cvv INT NOT NULL,
  expiry_date DATE NOT NULL,
  kyc_status VARCHAR(50) NOT NULL,
  balance DECIMAL(10, 2) NOT NULL);


  INSERT INTO Group3_AxisBank_customer (customer_id, customerName, credit_limit, applicable, cvv, expiry_date, kyc_status, balance)
VALUES
  (1, 'Gyaandeep Shrma', 10000.00, 5000.00, 123, '2025-12-31', 'Verified', 2000.00),
  (2, 'Swapnil Khose', 5000.00, 2000.00, 456, '2024-06-30', 'Pending', 1500.00),
  (3, 'Manav Dixit', 20000.00, 10000.00, 789, '2025-12-31', 'Verified', 5000.00),
  (4, 'Gopika', 15000.00, 7500.00, 101, '2024-09-30', 'Verified', 3000.00),
  (5, 'Poonam Sharma', 8000.00, 4000.00, 214, '2024-03-31', 'Pending', 2500.00),
  (6, 'Emily Chen', 12000.00, 6000.00, 365, '2025-06-30', 'Verified', 4000.00),
  (7, 'David Lee', 25000.00, 12500.00, 468, '2025-12-31', 'Verified', 6000.00),
  (8, 'Sophia Patel', 18000.00, 9000.00, 259, '2024-12-31', 'Pending', 4500.00),
  (9, 'Oliver Kim', 22000.00, 11000.00, 147, '2025-09-30', 'Verified', 5500.00),
  (10, 'Ava Singh', 10000.00, 5000.00, 358, '2024-06-30', 'Verified', 2000.00),
  (11, 'Liam Taylor', 28000.00, 14000.00, 634, '2025-12-31', 'Verified', 7000.00),
  (12, 'Isabella Martin', 20000.00, 10000.00, 812, '2024-09-30', 'Pending', 3500.00),
  (13, 'Noah White', 15000.00, 7500.00, 275, '2024-03-31', 'Verified', 3000.00),
  (14, 'Charlotte Hall', 12000.00, 6000.00, 935, '2025-06-30', 'Verified', 4000.00),
  (15, 'Elijah Brooks', 25000.00, 12500.00, 142, '2025-12-31', 'Pending', 5000.00),
  (16, 'Abigail Scott', 18000.00, 9000.00, 756, '2024-12-31', 'Verified', 4500.00),
  (17, 'William Cooper', 22000.00, 11000.00, 983, '2025-09-30', 'Verified', 5500.00),
  (18, 'Mia Jenkins', 10000.00, 5000.00, 219, '2024-06-30', 'Pending', 2000.00),
  (19, 'Alexander Russell', 28000.00, 14000.00, 467, '2025-12-31', 'Verified', 7000.00),
  (20, 'Sofia Garcia', 20000.00, 10000.00, 812, '2024-09-30', 'Verified', 3500.00);


  Select * From Group3_AxisBank_customer;

  #1.Write the query below: Get the all data for the customer which has KYC status verified?
  SELECT *
FROM Group3_AxisBank_customer
WHERE kyc_status = 'Verified';

#2.Calculate the balance who is not done with KYC.
Select Sum(balance) As Total_Balance_NoKYC
From Group3_AxisBank_customer
Where kyc_status = 'Pending';

#3.What is the top 5th balance customer of having the highest bank balance?

SELECT Top 5 balance
FROM Group3_AxisBank_customer
ORDER BY balance DESC;

#4.Calculate the number of customers whose credit card/debit card is going to expire within 3 months.
SELECT COUNT(*) AS expiring_soon_customers
FROM Group3_AxisBank_customer
WHERE expiry_date BETWEEN '2024-11-07' AND '2025-02-07';

#4b.Display details of employees whose credit card/debit card is going to expire within 3 months.
SELECT *
FROM Group3_AxisBank_customer
WHERE expiry_date BETWEEN '2024-11-07' AND '2025-02-07';

#5.Retrieve the name of the customer who has lowest account balance amount

SELECT TOP 1 customerName
From Group3_AxisBank_Customer
ORDER BY balance Asc;

#5b.Retrieve all the details of the customer who has lowest account balance amount
SELECT Top 1 *
From Group3_AxisBank_customer
Order by balance Asc;
