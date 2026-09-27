# Write your MySQL query statement below
SELECT MAX(salary) AS SecondHighestSalary FROM Employee WHERE Salary < (SELECT MAX(salary) From Employee);