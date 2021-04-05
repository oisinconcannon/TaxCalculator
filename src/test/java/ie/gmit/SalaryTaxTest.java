/*
Oisin Concannon
G00347603@gmit.ie
This feature will calculate personal tax for an individual
 Software and Electronic Engineering 2021
 */

package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SalaryTaxTest {

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

    @Test
    void nameFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new SalaryTax("o","gmit",1234,30000));
        assertEquals("Name too short", e.getMessage());
        Exception e1 = assertThrows(IllegalArgumentException.class, () -> new SalaryTax("osdfjhsdjkfgdgjsdfgjkhghsdfg","gmit",1234,30000));
        assertEquals("Name too long", e1.getMessage());

    }

    @Test
    void companyFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new SalaryTax("oisin","g",1234,30000));
        assertEquals("Company name too short", e.getMessage());
        Exception e1 = assertThrows(IllegalArgumentException.class, () -> new SalaryTax("oisin","gosdfjhsdjkfgdgjsdfgjkhghsdfg",1234,30000));
        assertEquals("Company name too long", e1.getMessage());

    }

    @Test
    void employmentIDFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new SalaryTax("oisin","gmit",1,30000));
        assertEquals("Employment ID too short", e.getMessage());
        Exception e1 = assertThrows(IllegalArgumentException.class, () -> new SalaryTax("oisin","gmit",1234567890,30000));
        assertEquals("Employment ID too long", e1.getMessage());

    }

    @Test
    void uscTest()
    {
        SalaryTax s = new SalaryTax("oisin","gmit",1234,30000);
        assertEquals(1350,s.getUsc());
    }

    @Test
    void incomeTaxTest()
    {
        SalaryTax s = new SalaryTax("oisin","gmit",1234,30000);
        assertEquals(6000,s.getIncomeTax());
    }
    @Test
    void upperIncomeTaxTest()
    {
        SalaryTax s = new SalaryTax("oisin","gmit",1234,40000);
        assertEquals(1880,s.getUpperIncomeTax());
    }

    @Test
    void prsiTest()
    {
        SalaryTax s = new SalaryTax("oisin","gmit",1234,30000);
        assertEquals(1200,s.getPrsi());
    }

    @Test
    void grossSalaryTest()
    {
        SalaryTax s = new SalaryTax("oisin","gmit",1234,30000);
        assertEquals(24750,s.getGrossSalary());
    }

}
