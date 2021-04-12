/*
Name: Brian Sharkey
Email: G00301661@gmit.ie
Project: TaxCalculator
This class will calculate repayments on bank loans
 */

package ie.gmit;


public class BankLoan
{
    private int yearsOnLoan;
    private double loanAmount;
    private String fName;
    private String lName;
    private double mortgageInterestRate = 0.029/12;
    private double carLoanInterestRate = 0.068/12;

    public BankLoan()
    {

    }

    public BankLoan( String fName, String lName, int yearsOnLoan, double loanAmount)
    {
        if(yearsOnLoan < 35)
        {
            if(yearsOnLoan >= 1)
            {
                if(loanAmount > 2000)
                {
                    this.fName = fName;
                    this.lName = lName;
                    this.yearsOnLoan = yearsOnLoan;
                    this.loanAmount = loanAmount;
                }

                else
                {
                    throw new IllegalArgumentException("Invalid loan amount, Figure cannot be lower than 2000");

                }
            }

            else
            {
                throw new IllegalArgumentException("Invalid Loan Term, Minimum term is 1 year.");

            }
        }

        else
        {
            throw new IllegalArgumentException("Invalid Loan Term, Loan term cannot exceed 35 years");
        }
    }

    public double mortgageCalculator(double purchasePrice)
    {
        if(yearsOnLoan >= 5)
        {
            if((purchasePrice*.9) < loanAmount)
            {
                throw new IllegalArgumentException("Invalid Loan amount, Loan cannot exceed 90% of thee purchase price.");
            }

            else
            {
                int totalPayments = yearsOnLoan*12;
                double result;

                result = (loanAmount)*(mortgageInterestRate*Math.pow((1+mortgageInterestRate), totalPayments))/(Math.pow((1+mortgageInterestRate), totalPayments)-1);
                result = Math.round(result * 100.0) / 100.0;

                return result;
            }
        }

        else
        {
            throw new IllegalArgumentException("Invalid Mortgage Term, Minimum mortgage term is 5 years");
        }

    }

    public double carLoanCalculator()
    {
        if(loanAmount <= 65000)
        {
            if(yearsOnLoan <=5)
            {
                int totalPayments = yearsOnLoan*12;
                double result;
                result = (loanAmount)*(carLoanInterestRate*Math.pow((1+carLoanInterestRate), totalPayments))/(Math.pow((1+carLoanInterestRate), totalPayments)-1);
                result = Math.round(result * 100.0) / 100.0;
                return result;
            }

            else
            {
                throw new IllegalArgumentException("Invalid Car loan term, Maximum term is 5 years.");
            }
        }

        else
        {
            throw new IllegalArgumentException("Invalid car loan figure, cannot exceed 65000");

        }
    }

    public int getYearsOnLoan()
    {
        return yearsOnLoan;
    }

    public void setYearsOnLoan(int yearsOnLoan)
    {
        if(yearsOnLoan < 1 || yearsOnLoan > 35)
        {
            throw new IllegalArgumentException("Invalid Loan Term, Maximum term is 35 years - Minimum term is 1 year.");
        }
        else
        {
            this.yearsOnLoan = yearsOnLoan;
        }
    }

    public double getLoanAmount()
    {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount)
    {
        if(loanAmount < 2000)
        {
            throw new IllegalArgumentException("Invalid loan amount, Figure cannot be lower than 2000");
        }

        else
        {
            this.loanAmount = loanAmount;
        }
    }

    public String getfName()
    {
        return fName;
    }

    public void setfName(String fName)
    {
        if(fName.length() > 2)
        {
            if(fName.length() < 25)
            {
                 this.fName = fName;
            }
            else
            {
                throw new IllegalArgumentException("First name must be less than 25 characters.");
            }
        }

        else
        {
            throw new IllegalArgumentException("First name must be greater than 2 characters.");
        }
    }

    public String getlName()
    {
        return lName;
    }

    public void setlName(String lName)
    {
        if(lName.length() > 2)
        {
            if(lName.length() < 25)
            {
                this.lName = lName;
            }

            else
            {
                throw new IllegalArgumentException("Last name must be less than 25 characters.");
            }
        }

        else
        {
            throw new IllegalArgumentException("Last name must be greater than 2 characters.");
        }
    }
}






