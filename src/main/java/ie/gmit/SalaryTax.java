/*
Oisin Concannon
G00347603@gmit.ie
This feature will calculate personal tax for an individual
 Software and Electronic Engineering 2021
 */
package ie.gmit;

public class SalaryTax {

    private String name;
    private String company;
    private int employmentNumber;
    private double salary;
<<<<<<< HEAD



    public SalaryTax(String name, String company, int employmentNumber,double salary ) {
        setName(name);
        setCompany(company);
        setEmploymentNumber(employmentNumber);
        setSalary(salary);
    }
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        if(name.length() > 2)
        {
            if(name.length() < 25)
            {
                this.name = name;
            }
            else {
                throw new IllegalArgumentException("Name too long");
            }
        }
        else
        {
            throw new IllegalArgumentException("Name too short");
        }

    }
    public String getCompany()
    {
        return company;
    }

    public void setCompany(String company)
    {
        if(company.length() > 2)
        {
            if(company.length() < 15)
            {
                this.company = company;
            }
            else {
                throw new IllegalArgumentException("Company name too long");
            }
        }
        else
        {
            throw new IllegalArgumentException("Company name too short");
        }

    }
    public double getEmploymentNumber()
    {
        return employmentNumber;
    }

    public void setEmploymentNumber(int employmentNumber)
    {
        if(String.valueOf(employmentNumber).length() >2)
        {
            if(String.valueOf(employmentNumber).length() <11)
            {
                this.employmentNumber = employmentNumber;
            }
            else
            {
                throw new IllegalArgumentException("Employment ID too long");
            }
        }
        else
        {
            throw new IllegalArgumentException("Employment ID too short");
        }

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
            throw new IllegalArgumentException("Invalid Salary");
        }

    }


=======
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
        if(salary >= 17000.00)
        {
            this.salary = salary;
        }
        else
        {
            throw new IllegalArgumentException("You have entered an ineligible value for salary(minimum 17,000)");
        }

    }

  /*  public double IncomeTax()
    {
        salary = getSalary();
        if(salary >=17000) {
            if (salary > 35300) {
                upperIncomeTax = (salary - 35300) * .40;
                incomeTax = (salary * .2) - 3300 + upperIncomeTax;
            } else {
                incomeTax = (salary * .2) - 3300;
            }
            return incomeTax;
        }
        else{
            throw new IllegalArgumentException("You have entered an ineligible value for salary(minimum 17,000),therefore cannot calculate income Tax");
        }
    }*/
>>>>>>> master



}   