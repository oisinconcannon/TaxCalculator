/*
Name: Oisin Concannon
Email: G00347603@gmit.ie
This test class will run tests to validate the data being entered into SalaryTax class.
Both failure and pass are being tested for.
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
        salaryTest = new SalaryTax("oisin","con","gmit","QA team",1234,22,30000);
    }

    @Test
    void salaryTest()
    {
       SalaryTax s = new SalaryTax("oisin","con","gmit","QA team",1234,22,30000);
       assertEquals(30000,s.getSalary());
    }

    @Test
    void salaryFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new SalaryTax("oisin","con","gmit","QA team",1234,22,10000));
        assertEquals("Invalid Salary", e.getMessage());

    }

    @Test
    void firstNameTest()
    {
        SalaryTax s = new SalaryTax("oisin","con","gmit","QA team",1234,22,30000);
        assertEquals("oisin",s.getFirstName());

    }

    @Test
    void firstNameFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new SalaryTax("o","con","gmit","QA team",1234,22,30000));
        assertEquals("First Name too short", e.getMessage());
        Exception e1 = assertThrows(IllegalArgumentException.class, () -> new SalaryTax("osdfjhsdjkfgdgjsdfgjkhghsdfg","con","gmit","QA team",1234,22,30000));
        assertEquals("First Name too long", e1.getMessage());

    }
    @Test
    void lastNameTest()
    {
        SalaryTax s = new SalaryTax("oisin","con","gmit","QA team",1234,22,30000);
        assertEquals("con",s.getLastName());

    }

    @Test
    void lastNameFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new SalaryTax("oisin","c","gmit","QA team",1234,22,30000));
        assertEquals("Last Name too short", e.getMessage());
        Exception e1 = assertThrows(IllegalArgumentException.class, () -> new SalaryTax("oisin","codsgfsdfgfdgfghghfdghgdhgfhghjn","gmit","QA team",1234,22,30000));
        assertEquals("Last Name too long", e1.getMessage());

    }

    @Test
    void companyTest()
    {
        SalaryTax s = new SalaryTax("oisin","con","gmit","QA team",1234,22,30000);
        assertEquals("gmit",s.getCompany());

    }

    @Test
    void companyFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new SalaryTax("oisin","con","g","QA team",1234,22,30000));
        assertEquals("Company name too short", e.getMessage());
        Exception e1 = assertThrows(IllegalArgumentException.class, () -> new SalaryTax("oisin","con","gosdfjhsdjkfgdgjsdfgjkhghsdfg","QA team",1234,22,30000));
        assertEquals("Company name too long", e1.getMessage());

    }
    @Test
    void departmentTest()
    {
        SalaryTax s = new SalaryTax("oisin","con","gmit","QA team",1234,22,30000);
        assertEquals("QA team",s.getDepartment());

    }

    @Test
    void departmentFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new SalaryTax("oisin","con","gmit","Q",1234,22,30000));
        assertEquals("Department too short", e.getMessage());
        Exception e1 = assertThrows(IllegalArgumentException.class, () -> new SalaryTax("oisin","con","gmit","QAsdfjhfhskdfghdfgf",1234,22,30000));
        assertEquals("Department too long", e1.getMessage());

    }

    @Test
    void employmentIDTest()
    {
        SalaryTax s = new SalaryTax("oisin","con","gmit","QA team",1234,22,30000);
        assertEquals(1234,s.getEmploymentNumber());

    }

    @Test
    void employmentIDFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new SalaryTax("oisin","con","gmit","QA team",1,22,30000));
        assertEquals("Employment ID too short", e.getMessage());
        Exception e1 = assertThrows(IllegalArgumentException.class, () -> new SalaryTax("oisin","con","gmit","QA team",1234454364,22,30000));
        assertEquals("Employment ID too long", e1.getMessage());

    }
    @Test
    void ageTest()
    {
        SalaryTax s = new SalaryTax("oisin","con","gmit","QA team",1234,22,30000);
        assertEquals(22,s.getAge());

    }

    @Test
    void ageFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new SalaryTax("oisin","con","gmit","QA team",1123,17,30000));
        assertEquals("Age too low", e.getMessage());
        Exception e1 = assertThrows(IllegalArgumentException.class, () -> new SalaryTax("oisin","con","gmit","QA team",1234,70,30000));
        assertEquals("Age too high", e1.getMessage());

    }

    @Test
    void uscTest()
    {
        SalaryTax s = new SalaryTax("oisin","con","gmit","QA team",1234,22,30000);
        assertEquals(1350,s.getUsc());
    }

    @Test
    void incomeTaxTest()
    {
        SalaryTax s = new SalaryTax("oisin","con","gmit","QA team",1234,22,30000);
        assertEquals(6000,s.getIncomeTax());
    }
    @Test
    void upperIncomeTaxTest()
    {
        SalaryTax s = new SalaryTax("oisin","con","gmit","QA team",1234,22,40000);
        assertEquals(1880,s.getUpperIncomeTax());
    }

    @Test
    void prsiTest()
    {
        SalaryTax s = new SalaryTax("oisin","con","gmit","QA team",1234,22,30000);
        assertEquals(1200,s.getPrsi());
    }

    @Test
    void grossSalaryTest()
    {
        SalaryTax s = new SalaryTax("oisin","con","gmit","QA team",1234,22,30000);
        assertEquals(24750,s.getGrossSalary());
    }

}
