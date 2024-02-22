package LAB2;

public class Loan
{
    public static void main (String[]args)
    {
        double loanAmount=250000;
        double annualInterestRate=3;
        double monthlyRepayment=1600;

        //starting the recusrsive method 
        int monthsToRepay=calculateMonthsToRepay(loanAmount,annualInterestRate,monthlyRepayment,0);
        System.out.println("It will take " + monthsToRepay + " months to repay the loan.");
    }
    /**
    * Recursive method to calculate the number of months needed to repay a loan.
    * 
    * @param loanAmount The current outstanding loan amount.
    * @param annualInterestRate The annual interest rate of the loan.
    * @param monthlyRepayment The amount paid towards the loan each month.
    * @param months The current count of months that have passed.
    * @return The total number of months needed to repay the loan.
    */

    public static int calculateMonthsToRepay(double loanAmount, double annualInterestRate, double monthlyRepayment, int months)

    {
        /*. If the loan amount is less than or equal to 0,
         the loan is  repaid, and the method returns the number
          of months counted so far*/
          //base case
        if (loanAmount <= 0) {
            return months; // Loan is repaid, return the total months counted so far
        } else {
            // Calculate the interest for this month
            //dividing the annual interest rate by 12 and then by 100 (to convert from a percentage to a decimal)
            double monthlyInterestRate = annualInterestRate / 12 / 100;

            /*Calculates the new loan amount by adding the interest for
             the month to the current loan amount and then subtracting 
             the monthly repayment*/
            double interestForTheMonth = loanAmount * monthlyInterestRate;
            // Calculate the new loan amount after this month's repayment
            double newLoanAmount = loanAmount + interestForTheMonth - monthlyRepayment;
            
            // Recursive call: Calculate the months for the new loan amount with an incremented month coun
            /*Recursively calls calculateMonthsToRepay with the new loan amount and an incremented month count.
             This continues until the loan amount
             is repaid, at which point the base case returns the total months required to repay the loan */
            return calculateMonthsToRepay(newLoanAmount, annualInterestRate, monthlyRepayment, months + 1);
        }
    }
}
    