package ie.gmit;

public class BusinessTax {


    double operatingExpense;
    double revenue;


    public BusinessTax(double operatingExpense, double revenue)
    {
        setRevenue(revenue);
        setOperatingExpense(operatingExpense);
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
}
