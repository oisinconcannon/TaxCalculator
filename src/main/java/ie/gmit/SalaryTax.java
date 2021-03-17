/*
Oisin Concannon
G00347603@gmit.ie
This feature will calculate personal tax for an individual
 Software and Electronic Engineering 2021
 */
package ie.gmit;

public class SalaryTax {
    private double hourlyRate;
    private double weeklyHours;
    private double salary;
    private double incomeTax;
    private double upperIncomeTax;
    private double prsi;
    private double usc;

    public SalaryTax(double salary) {
        setSalary(salary);


    }
    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        if(salary >= 17000)
        {
            this.salary = salary;
        }
        else
        {
            throw new IllegalArgumentException("You have entered an ineligible value for salary(minimum 17,000)");
        }

    }

    public double IncomeTax()
    {
        salary = getSalary();
        if(salary >=17000) {
            if (salary > 35300) {
                upperIncomeTax = (salary - 35300) * .40;
                incomeTax = (salary * .2) - 3300 + upperIncomeTax;
            } else {
                incomeTax = (salary * .2) + 3300;
            }
            return incomeTax;
        }
        else{
            throw new IllegalArgumentException("You have entered an ineligible value for salary(minimum 17,000),therefore cannot calculate income Tax");
        }
    }



}   