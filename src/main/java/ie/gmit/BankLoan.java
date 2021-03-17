/*
* Brian Sharkey - g00301661@gmit.ie
* Program to calculate Bank loans.
* Software and Electronic Engineering 2021
*
* */

package ie.gmit;


public class BankLoan{

    public int yearsOnLoan;
    public double purchasePrice;
    public double loanAmount;
    public double interestRate = 0.029/12;

    public BankLoan() {

    }



    public BankLoan( int yearsOnLoan, double loanAmount) {

        if(yearsOnLoan > 35 || yearsOnLoan < 5 )
        {
            throw new IllegalArgumentException("Invalid Mortgage Term, Maximum term is 35 years - Minimum term is 5 years .");
        }

       else if(loanAmount < 1)
        {
            throw new IllegalArgumentException("Invalid loan amount, Figure cannot be zero or negative.");

        }

        else
        {

            this.yearsOnLoan = yearsOnLoan;
            this.loanAmount = loanAmount;

        }

    }




}
