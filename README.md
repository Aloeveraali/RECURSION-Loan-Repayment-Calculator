# RECURSION-Loan-Repayment-Calculator

# Overview
This Java program is designed to calculate the number of months required to repay a loan fully. It uses a recursive approach to determine how long it will take to pay off a loan based on the initial loan amount, the annual interest rate, and the monthly repayment amount. This project serves as an educational tool to understand recursion in Java.

# Getting Started
To run this program, you will need a Java Development Kit (JDK) installed on your computer.

# Program Functionality
The program starts by defining the initial loan amount, the annual interest rate, and the monthly repayment amount.
It then calls a recursive method calculateMonthsToRepay to calculate the total number of months required to repay the loan.
The recursion continues by calculating the interest for the current month, adjusting the loan amount accordingly, and incrementing the month count until the loan is fully repaid.
The base case for the recursion is when the loan amount is less than or equal to zero, indicating the loan has been fully repaid.
Finally, the program outputs the total number of months needed to repay the loan.

# Example
yaml
Copy code
Initial Loan Amount: €250,000
Annual Interest Rate: 3%
Monthly Repayment: €1,600

Output: It will take X months to repay the loan.
Replace X with the actual number of months calculated by the program.
