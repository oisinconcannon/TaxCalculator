/*
Name: Oisin Concannon
Email: G00347603@gmit.ie
Project: TaxCalculator
This class will calculate personal tax for an individual
Software and Electronic Engineering 2021
 */

package ie.gmit;

public class SalaryTax
{

    private String firstName;
    private String lastName;
    private String company;
    private String department;
    private int employmentNumber;
    private int age;
    private double salary;
    private double incomeTax;
    private double upperIncomeTax;
    private double usc;
    private double prsi;
    private double grossSalary;


    public SalaryTax(String firstName, String lastName,String company,String department,
                     int employmentNumber,int age, double salary)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setCompany(company);
        setDepartment(department);
        setEmploymentNumber(employmentNumber);
        setAge(age);
        setSalary(salary);
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        if (firstName.length() > 2)
        {
            if (firstName.length() < 25)
            {
                this.firstName = firstName;
            }

            else
            {
                throw new IllegalArgumentException("First Name too long");
            }
        }
        else
        {
            throw new IllegalArgumentException("First Name too short");
        }
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() > 2)
        {
            if (lastName.length() < 25)
            {
                this.lastName = lastName;
            }

            else
            {
                throw new IllegalArgumentException("Last Name too long");
            }
        }

        else
        {
            throw new IllegalArgumentException("Last Name too short");
        }

    }

    public String getCompany()
    {
        return company;
    }

    public void setCompany(String company)
    {
        if (company.length() > 2)
        {
            if (company.length() < 15)
            {
                this.company = company;
            }

            else
            {
                throw new IllegalArgumentException("Company name too long");
            }
        }
        else
        {
            throw new IllegalArgumentException("Company name too short");
        }
    }

    public String getDepartment()
    {
        return department;
    }

    public void setDepartment(String department)
    {
        if (department.length() > 2)
        {
            if (department.length() < 10)
            {
                this.department = department;
            }

            else
            {
                throw new IllegalArgumentException("Department too long");
            }
        }
        else
        {
            throw new IllegalArgumentException("Department too short");
        }
    }

    public double getEmploymentNumber()
    {
        return employmentNumber;
    }

    public void setEmploymentNumber(int employmentNumber)
    {
        if (String.valueOf(employmentNumber).length() > 2)
        {
            if (String.valueOf(employmentNumber).length() < 10)
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

    public double getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        if (age >=18)
        {
            if (age <=65)
            {
                this.age = age;
            }
            else
            {
                throw new IllegalArgumentException("Age too high");
            }
        }

        else
        {
            throw new IllegalArgumentException("Age too low");
        }
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        if (salary >= 17000)
        {
            if(salary >35300)
            {
                this.salary = salary;
                this.incomeTax = 35300 * 0.2;
                this.upperIncomeTax = (salary-35300) *0.4;
                this.usc = (salary+35300)*0.045;
                this.prsi = (salary+35300)*0.04;
                this.grossSalary= salary+35300+3300-usc-incomeTax-prsi-upperIncomeTax;
            }
            this.salary = salary;
            this.incomeTax = salary * 0.2;
            this.usc = salary*0.045;
            this.prsi = salary*0.04;
            this.grossSalary= salary+3300-usc-incomeTax-prsi;
        }

        else
        {
            throw new IllegalArgumentException("Invalid Salary");
        }
    }

    public double getIncomeTax()
    {
        return incomeTax;
    }

    public double getUpperIncomeTax()
    {
        return upperIncomeTax;
    }

    public double getPrsi()
    {
        return prsi;
    }

    public double getUsc()
    {
        return usc;
    }

    public double getGrossSalary()
    {
        return grossSalary;
    }
}



