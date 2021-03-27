/*
Oisin Concannon
G00347603@gmit.ie
This feature will calculate personal tax for an individual
 Software and Electronic Engineering 2021
 */
package ie.gmit;

<<<<<<< HEAD
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
=======
import org.junit.Test;
>>>>>>> master

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SalaryTaxTest {
<<<<<<< HEAD
    private SalaryTax salaryTest;
    @BeforeEach
    void setup()
    {
        salaryTest = new SalaryTax("oisin","gmit",1234,30000);
    }

    @Test
    void salaryTest()
    {
       SalaryTax s = new SalaryTax("oisin","gmit",1234,30000);
       assertEquals(30000,s.getSalary());
    }
    @Test
    void salaryFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new SalaryTax("oisin","gmit",1234,10000));
        assertEquals("Invalid Salary", e.getMessage());

    }

=======


    @Test
    void salaryTest(){
        SalaryTax s = new SalaryTax(30000.00);
        assertEquals(30000.00,s.getSalary());
    }

    /*@Test
    void incomeTaxTest(){
        SalaryTax s = new SalaryTax(30000);
        assertEquals(2700,s.IncomeTax());
    }
    @Test
    void incomeTaxTestFail(){
        SalaryTax s = new SalaryTax(15000);
        assertThrows(IllegalArgumentException.class,() -> s.IncomeTax());
    }*/
>>>>>>> master

}
