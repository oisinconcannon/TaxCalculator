package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankLoanTest {
    private BankLoan bankloan;
    @BeforeEach
    void setup()
    {
        bankloan = new BankLoan();
    }

    @Test
    void testConstructorFirstNameMessage1()
    {
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new BankLoan("B", "Sharkey", 25, 600000, 540000);});
        assertEquals("Invalid First Name.", e.getMessage());
    }

    @Test
    void testConstructorFirstNameMessage2()
    {
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new BankLoan("briansharkeybriansharkeybr", "Sharkey", 25, 600000, 540000);});
        assertEquals("Invalid First Name.", e.getMessage());
    }

    @Test
    void testConstructorLastNameMessage1()
    {
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new BankLoan("Brian", "Sh", 25, 600000, 540000);});
        assertEquals("Invalid Last Name.", e.getMessage());
    }


    @Test
    void testConstructorLastNameMessage2()
    {
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new BankLoan("Brian", "briansharkeybriansharkeybr", 25, 600000, 540000);});
        assertEquals("Invalid Last Name.", e.getMessage());
    }

    @Test
    void testConstructorLoanAmountMessage()
    {
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new BankLoan("Brian", "Sharkey", 25, 600000, 580000);});
        assertEquals("Invalid Loan amount, Loan cannot exceed 90% of thee purchase price.", e.getMessage());
    }

    @Test
    void testConstructorLoanTermMessage1()
    {
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new BankLoan("Brian", "Sharkey", 4, 600000, 540000);});
        assertEquals("Invalid Mortgage Term, Maximum term is 35 years - Minimum term is 5 years .", e.getMessage());
    }

    @Test
    void testConstructorLoanTermMessage2()
    {
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new BankLoan("Brian", "Sharkey", 36, 600000, 540000);});
        assertEquals("Invalid Mortgage Term, Maximum term is 35 years - Minimum term is 5 years .", e.getMessage());
    }









}
