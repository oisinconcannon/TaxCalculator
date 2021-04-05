/*
* Brian Sharkey - g00301661@gmit.ie
* Program to calculate Bank loans.
* Software and Electronic Engineering 2021
*
* */

package ie.gmit;


public class BankLoan{

    public int yearsOnLoan;
    //public double purchasePrice;
    public double loanAmount;
    public double mortgageInterestRate = 0.029/12;
    public double carLoanInterestRate = 0.068/12;

    public BankLoan() {

    }



    public BankLoan( int yearsOnLoan, double loanAmount) {

        if(yearsOnLoan > 35 || yearsOnLoan < 1 )
        {
            throw new IllegalArgumentException("Invalid Loan Term, Maximum term is 35 years - Minimum term is 1 year.");
        }

       else if(loanAmount < 2000)
        {
            throw new IllegalArgumentException("Invalid loan amount, Figure cannot be lower than 2000");

        }

        else
        {

            this.yearsOnLoan = yearsOnLoan;
            this.loanAmount = loanAmount;

        }

    }


    public double mortgageCalculator(double purchasePrice)
    {
        if(yearsOnLoan > 35 || yearsOnLoan < 5 )
        {
            throw new IllegalArgumentException("Invalid Mortgage Term, Maximum term is 35 years - Minimum term is 5 years.");
        } //need to test

        if((purchasePrice*.9) < loanAmount)
        {
            throw new IllegalArgumentException("Invalid Loan amount, Loan cannot exceed 90% of thee purchase price.");
        }

        int totalPayments = yearsOnLoan*12;
        double result;

        result = (loanAmount)*(mortgageInterestRate*Math.pow((1+mortgageInterestRate), totalPayments))/(Math.pow((1+mortgageInterestRate), totalPayments)-1);
        result = Math.round(result * 100.0) / 100.0;

        return result;

    }

    public double carLoanCalculator()
    {
        if(loanAmount > 65000 || loanAmount < 2000)
        {
            throw new IllegalArgumentException("Invalid loan amount, Minimum loan amount is 2000 and maximum is 65000");
        }

        if(yearsOnLoan > 5 || yearsOnLoan < 1 )
        {
            throw new IllegalArgumentException("Invalid Car loan term, Maximum term is 5 years - Minimum term is 1 year.");
        } //need to test

        int totalPayments = yearsOnLoan*12;
        double result;

        result = (loanAmount)*(carLoanInterestRate*Math.pow((1+carLoanInterestRate), totalPayments))/(Math.pow((1+carLoanInterestRate), totalPayments)-1);
        result = Math.round(result * 100.0) / 100.0;

        return result;

    }

    public int getYearsOnLoan() {
        return yearsOnLoan;
    }

    public void setYearsOnLoan(int yearsOnLoan) {
        if(yearsOnLoan < 2 || yearsOnLoan > 35)
        {
            throw new IllegalArgumentException("Invalid Loan Term, Maximum term is 35 years - Minimum term is 1 year.");
        }
        else
        {
            this.yearsOnLoan = yearsOnLoan;
        }

    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {

        if(loanAmount < 2000)
        {
            throw new IllegalArgumentException("Invalid loan amount, Figure cannot be lower than 2000");

        }
        else
        {
            this.loanAmount = loanAmount;
        }

    }
}






