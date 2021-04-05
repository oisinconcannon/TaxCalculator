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
    private double incomeTax;
    private double upperIncomeTax;
    private double usc;
    private double prsi;
    private double grossSalary;


    public SalaryTax(String name, String company, int employmentNumber, double salary) {
        setName(name);
        setCompany(company);
        setEmploymentNumber(employmentNumber);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 2) {
            if (name.length() < 25) {
                this.name = name;
            } else {
                throw new IllegalArgumentException("Name too long");
            }
        } else {
            throw new IllegalArgumentException("Name too short");
        }

    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        if (company.length() > 2) {
            if (company.length() < 15) {
                this.company = company;
            } else {
                throw new IllegalArgumentException("Company name too long");
            }
        } else {
            throw new IllegalArgumentException("Company name too short");
        }

    }

    public double getEmploymentNumber() {
        return employmentNumber;
    }

    public void setEmploymentNumber(int employmentNumber) {
        if (String.valueOf(employmentNumber).length() > 2) {
            if (String.valueOf(employmentNumber).length() < 10) {
                this.employmentNumber = employmentNumber;
            } else {
                throw new IllegalArgumentException("Employment ID too long");
            }
        } else {
            throw new IllegalArgumentException("Employment ID too short");
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 17000) {
            if(salary >35300){
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

        } else {
            throw new IllegalArgumentException("Invalid Salary");
        }

    }

    public double getIncomeTax() {
        return incomeTax;
    }

    public double getUpperIncomeTax() {
        return upperIncomeTax;
    }

    public double getPrsi() {
        return prsi;
    }

    public double getUsc() {
        return usc;
    }

    public double getGrossSalary() {
        return grossSalary;
    }
}



