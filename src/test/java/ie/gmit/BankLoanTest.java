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
        BankLoan bankloan  = new BankLoan(20, 540000);


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

    @Test
    void testMortgageCalculator()
    {
        assertEquals(2967.87,  new BankLoan(20,540000).mortgageCalculator(600000));
    }

    @Test
    void testMortgageCalculatorPurchasePrice()
    {
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new BankLoan(25,  550000).mortgageCalculator(600000);});
        assertEquals("Invalid Loan amount, Loan cannot exceed 90% of thee purchase price.", e.getMessage());
    }









}


