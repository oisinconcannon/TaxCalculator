package ie.gmit;

public class BusinessTax {

    double operatingExpense;
    double revenue;
    double salariesPaid;
    double rentPaid;
    double costOfSales;
    double marketingExpense;
    double utilitiesPaid;
    double generalExpense;
    double accountingLegalFees;

    double grossSales;
    double grossServices;


    public BusinessTax(double operatingExpense, double revenue,double salariesPaid,double rentPaid,double costOfSales,
                       double marketingExpense,double utilitiesPaid,double generalExpense,double accountingLegalFees,
                       double grossSales,double grossServices)
    {
        setRevenue(revenue);
        setOperatingExpense(operatingExpense);
        setSalariesPaid(salariesPaid);
        setRentPaid(rentPaid);
        setCostOfSales(costOfSales);
        setMarketingExpense(marketingExpense);
        setUtilitiesPaid(utilitiesPaid);
        setGeneralExpense(generalExpense);
        setAccountingLegalFees(accountingLegalFees);
        setGrossSales(grossSales);
        setGrossServices(grossServices);
    }

    public double getOperatingExpense()
    {
        return operatingExpense;
    }

    public void setOperatingExpense(double operatingExpense)
    {
        if(operatingExpense >= 0)
        {
            this.operatingExpense = operatingExpense;
        }
        else
        {
            throw new IllegalArgumentException("Operating Expense cannot be negative");
        }

    }

    public double getRevenue()
    {
        return revenue;
    }

    public void setRevenue(double revenue)
    {
        this.revenue = revenue;
    }


    public double getSalariesPaid() {
        return salariesPaid;
    }

    public void setSalariesPaid(double salariesPaid) {

        if(salariesPaid >= 0)
        {
            this.salariesPaid = salariesPaid;
        }
        else
        {
            throw new IllegalArgumentException("Salaries Paid cannot be negative");
        }

    }

    public double getRentPaid() {
        return rentPaid;
    }

    public void setRentPaid(double rentPaid)
    {
        if(rentPaid >= 0)
        {
            this.rentPaid = rentPaid;
        }
        else
        {
            throw new IllegalArgumentException("Rent Paid cannot be negative");
        }
    }

    public double getCostOfSales()
    {
        return costOfSales;
    }

    public void setCostOfSales(double costOfSales)
    {
        if(costOfSales >= 0)
        {
            this.costOfSales = costOfSales;
        }
        else
        {
            throw new IllegalArgumentException("Cost of sales cannot be negative");
        }
    }

    public double getMarketingExpense() {
        return marketingExpense;
    }

    public void setMarketingExpense(double marketingExpense)
    {
        if(marketingExpense >= 0)
        {
            this.marketingExpense = marketingExpense;
        }
        else
        {
            throw new IllegalArgumentException("Marketing expense cannot be negative");
        }
    }

    public double getUtilitiesPaid()
    {
        return utilitiesPaid;
    }

    public void setUtilitiesPaid(double utilitiesPaid)
    {
        if(utilitiesPaid >= 0)
        {
            this.utilitiesPaid = utilitiesPaid;
        }
        else
        {
            throw new IllegalArgumentException("Utilities paid cannot be negative");
        }
    }

    public double getGeneralExpense()
    {
        return generalExpense;
    }

    public void setGeneralExpense(double generalExpense)
    {
        if(generalExpense >= 0)
        {
            this.generalExpense = generalExpense;
        }
        else
        {
            throw new IllegalArgumentException("General expense cannot be negative");
        }
    }

    public double getAccountingLegalFees()
    {
        return accountingLegalFees;
    }

    public void setAccountingLegalFees(double accountingLegalFees)
    {
        if(accountingLegalFees >= 0)
        {
            this.accountingLegalFees = accountingLegalFees;
        }
        else
        {
            throw new IllegalArgumentException("Accounting & Legal fess cannot be negative");
        }
    }

    public double getGrossSales()
    {
        return grossSales;
    }

    public void setGrossSales(double grossSales)
    {
        if(grossSales >= 0)
        {
            this.grossSales = grossSales;
        }
        else
        {
            throw new IllegalArgumentException("Gross sales cannot be negative");
        }
    }

    public double getGrossServices()
    {
        return grossServices;
    }

    public void setGrossServices(double grossServices)
    {
        if(grossServices >= 0)
        {
            this.grossServices = grossServices;
        }
        else
        {
            throw new IllegalArgumentException("Gross services cannot be negative");
        }
    }

}
