/*
Name: Latif Yahia
Email: G00348688@gmit.ie
Project: TaxCalculator
This test class will run tests to validate the data being entered into BusinessTax class.
Both failure and pass are being tested for.
 */

package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BusinessTaxTest
{
    private BusinessTax t1;

    @BeforeEach
    void init() {t1 = new BusinessTax(35000,110000,20000,3000,4000,1500,800,
                                    450,1000,70000,40000);}

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

    @Test
    void salariesPaidFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new BusinessTax(0,0,-1000,0,
                0,0,0,0,0,0,0));
        assertEquals("Salaries Paid cannot be negative", e.getMessage());
    }

    @Test
    void salariesPaidPass()
    {
        BusinessTax e = new BusinessTax(0,0,30000,0,0,0,0
                ,0,0,0,0);
        assertEquals(30000, e.getSalariesPaid());
    }

    @Test
    void rentPaidFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new BusinessTax(0,0,0,-1600,
                0,0,0,0,0,0,0));
        assertEquals("Rent Paid cannot be negative", e.getMessage());
    }

    @Test
    void rentPaidPass()
    {
        BusinessTax e = new BusinessTax(0,0,0,1600,0,0,0
                ,0,0,0,0);
        assertEquals(1600, e.getRentPaid());
    }

    @Test
    void costOfSalesFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new BusinessTax(0,0,0,0,
                -5000,0,0,0,0,0,0));
        assertEquals("Cost of sales cannot be negative", e.getMessage());
    }

    @Test
    void costOfSalesPass()
    {
        BusinessTax e = new BusinessTax(0,0,0,0,5000,0,0
                ,0,0,0,0);
        assertEquals(5000, e.getCostOfSales());
    }

    @Test
    void marketingExpenseFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new BusinessTax(0,0,0,0,
                0,-5000,0,0,0,0,0));
        assertEquals("Marketing expense cannot be negative", e.getMessage());
    }

    @Test
    void marketingExpensePass()
    {
        BusinessTax e = new BusinessTax(0,0,0,0,0,5000,0
                ,0,0,0,0);
        assertEquals(5000, e.getMarketingExpense());
    }

    @Test
    void utilitiesPaidFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new BusinessTax(0,0,0,0,
                0,0,-5000,0,0,0,0));
        assertEquals("Utilities paid cannot be negative", e.getMessage());
    }

    @Test
    void utilitiesPaidPass()
    {
        BusinessTax e = new BusinessTax(0,0,0,0,0,0,5000
                ,0,0,0,0);
        assertEquals(5000, e.getUtilitiesPaid());
    }

    @Test
    void generalExpenseFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new BusinessTax(0,0,0,0,
                0,0,0,-5000,0,0,0));
        assertEquals("General expense cannot be negative", e.getMessage());
    }

    @Test
    void generalExpensePass()
    {
        BusinessTax e = new BusinessTax(0,0,0,0,0,0,0
                ,5000,0,0,0);
        assertEquals(5000, e.getGeneralExpense());
    }

    @Test
    void accountingLegalFeesFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new BusinessTax(0,0,0,0,
                0,0,0,0,-5000,0,0));
        assertEquals("Accounting & Legal fess cannot be negative", e.getMessage());
    }

    @Test
    void accountingLegalFeesPass()
    {
        BusinessTax e = new BusinessTax(0,0,0,0,0,0,0
                ,0,5000,0,0);
        assertEquals(5000, e.getAccountingLegalFees());
    }

    @Test
    void grossSalesFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new BusinessTax(0,0,0,0,
                0,0,0,0,0,-5000,0));
        assertEquals("Gross sales cannot be negative", e.getMessage());
    }

    @Test
    void grossSalesPass()
    {
        BusinessTax e = new BusinessTax(0,0,0,0,0,0,0
                ,0,0,5000,0);
        assertEquals(5000, e.getGrossSales());
    }

    @Test
    void grossServicesFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new BusinessTax(0,0,0,0,
                0,0,0,0,0,0,-5000));
        assertEquals("Gross services cannot be negative", e.getMessage());
    }

    @Test
    void grossServicesPass()
    {
        BusinessTax e = new BusinessTax(0,0,0,0,0,0,0
                ,0,0,0,5000);
        assertEquals(5000, e.getGrossServices());
    }

    @Test
    void revenuePass()
    {
        BusinessTax e = new BusinessTax(0,5000,0,0,0,0,0
                ,0,0,0,0);
        assertEquals(5000, e.getRevenue());
    }
}
