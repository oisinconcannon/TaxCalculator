/*
 * Brian Sharkey - g00301661@gmit.ie
 * Program to calculate Bank loans.
 * Software and Electronic Engineering 2021
 *
 * */

package ie.gmit;

public class Person {

    private String fName;
    private String lName;
    private int age;
    private double salary;

    public Person() {
    }

    public Person(String fName,String lName,int age,double salary)
    {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.salary = salary;


    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
