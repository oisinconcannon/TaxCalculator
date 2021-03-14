/*
* Brian Sharkey - g00301661@gmit.ie
* Program to calculate Bank loans.
* Software and Electronic Engineering 2021
*
* */

package ie.gmit;


public class BankLoan extends Person{

    public int yearsOnLoan;
    public double purchasePrice;
    public double loanAmount;
    public double interestRate = 0.029/12;

    public BankLoan() {

    }

    public BankLoan(String fName, String lName, int yearsOnLoan, double purchasePrice, double loanAmount) {
        if(fName.length() < 3 || fName.length() > 25)
        {
            throw new IllegalArgumentException("Invalid First Name.");
        }
        else if(lName.length() < 3 || lName.length() > 25)
        {
            throw new IllegalArgumentException("Invalid Last Name.");
        }
        else if((purchasePrice*.9) < loanAmount)
        {
            throw new IllegalArgumentException("Invalid Loan amount, Loan cannot exceed 90% of thee purchase price.");
        }
       else if(yearsOnLoan > 35 || yearsOnLoan < 5 )
        {
            throw new IllegalArgumentException("Invalid Mortgage Term, Maximum term is 35 years - Minimum term is 5 years .");
        }

       else
        {
            this.fName = fName;
            this.lName = lName;
            this.yearsOnLoan = yearsOnLoan;
            this.purchasePrice = purchasePrice;
            this.loanAmount = loanAmount;

        }

    }

    public double mortgageCalculator()
    {
        int totalPayments = yearsOnLoan*12;
        double result;

        result = (loanAmount)*(interestRate*Math.pow((1+interestRate), totalPayments))/(Math.pow((1+interestRate), totalPayments)-1);
        result = Math.round(result * 100.0) / 100.0;

        return result;

    }
}
