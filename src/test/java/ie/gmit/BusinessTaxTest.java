package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BusinessTaxTest
{
    private BusinessTax t1;

    @BeforeEach
    void init() {t1 = new BusinessTax(56155.46,213049.25,0,0,0,0,0,
                                    0,00,0,0);}

    @Test
    void operatingExpenseFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new BusinessTax(-6262.14,2626242,0,0,
                                                                                    0,0,0,0,0,0,0));
        assertEquals("Operating Expense cannot be negative", e.getMessage());
    }

    @Test
    void operatingExpensePass()
    {
        BusinessTax e = new BusinessTax(20000,30000,0,0,0,0,0
                                    ,0,0,0,0);
        assertEquals(20000, e.getOperatingExpense());
    }
}
