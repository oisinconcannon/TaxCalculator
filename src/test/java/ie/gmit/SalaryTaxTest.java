/*
Oisin Concannon
G00347603@gmit.ie
This feature will calculate personal tax for an individual
 Software and Electronic Engineering 2021
 */
package ie.gmit;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SalaryTaxTest {


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

}
