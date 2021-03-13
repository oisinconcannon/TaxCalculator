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
    public double interest = 0.029/12;

    public BankLoan() {
    }

    public BankLoan(double salary) {


    }

    public double mortgageCalculator()
    {
        int totalPayments = yearsOnLoan*12;
        double result;
        double interestRate = interest/12;

        if((purchasePrice*.9) < loanAmount)
        {
            throw new IllegalArgumentException("Invalid Salary,therefore cannot calculate income tax");
        }
        if(yearsOnLoan > 35)
        {
            throw new IllegalArgumentException("Invalid Mortgage Term, Maximum is 35 years.");
        }

        result = (loanAmount)*(interestRate*Math.pow((1+interestRate), totalPayments))/(Math.pow((1+interestRate), totalPayments)-1);
        result = Math.round(result * 100.0) / 100.0;

        return result;

    }
}
