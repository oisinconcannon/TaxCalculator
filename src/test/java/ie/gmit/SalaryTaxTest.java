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


}
