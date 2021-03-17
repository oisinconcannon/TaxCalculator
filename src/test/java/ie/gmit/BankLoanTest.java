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
    void testConstructorLoanAmountMessage()
    {
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new BankLoan( 25, 0);});
        assertEquals("Invalid loan amount, Figure cannot be zero or negative.", e.getMessage());
    }

    @Test
    void testConstructorLoanTermMessage1()
    {
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new BankLoan( 4,540000);});
        assertEquals("Invalid Mortgage Term, Maximum term is 35 years - Minimum term is 5 years .", e.getMessage());
    }

    @Test
    void testConstructorLoanTermMessage2()
    {
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new BankLoan(36,  540000);});
        assertEquals("Invalid Mortgage Term, Maximum term is 35 years - Minimum term is 5 years .", e.getMessage());
    }









}


