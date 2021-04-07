package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankLoanTest {

    @BeforeEach
    void setup()
    {
        BankLoan bankloan  = new BankLoan("Brian", "Sharkey",20, 540000);


    }

    @Test
    void testConstructorLoanAmountMessage()
    {
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new BankLoan( "Brian", "Sharkey",25, 0);});
        assertEquals("Invalid loan amount, Figure cannot be lower than 2000", e.getMessage());
    }

    @Test
    void testConstructorLoanTermMessage1()
    {
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new BankLoan( "Brian", "Sharkey",0,540000);});
        assertEquals("Invalid Loan Term, Minimum term is 1 year.", e.getMessage());
    }

    @Test
    void testConstructorLoanTermMessage2()
    {
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new BankLoan("Brian", "Sharkey",36,  540000);});
        assertEquals("Invalid Loan Term, Loan term cannot exceed 35 years", e.getMessage());
    }

    @Test
    void testMortgageCalculator()
    {
        assertEquals(2967.87,  new BankLoan("Brian", "Sharkey",20,540000).mortgageCalculator(600000));
    }

    @Test
    void testMortgageCalculatorTerm()
    {
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new BankLoan("Brian", "Sharkey",4,  500000).mortgageCalculator(600000);});
        assertEquals("Invalid Mortgage Term, Minimum mortgage term is 5 years", e.getMessage());
    }


    @Test
    void testMortgageCalculatorPurchasePrice()
    {
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new BankLoan("Brian", "Sharkey",25,  550000).mortgageCalculator(600000);});
        assertEquals("Invalid Loan amount, Loan cannot exceed 90% of thee purchase price.", e.getMessage());
    }

    @Test
    void testCarLoanTerm()
    {
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new BankLoan("Brian", "Sharkey",6,  55000).carLoanCalculator();});
        assertEquals("Invalid Car loan term, Maximum term is 5 years.", e.getMessage());
    }



    @Test
    void testCarLoanCalculator()
    {
        assertEquals(886.81,  new BankLoan("Brian", "Sharkey",5,45000).carLoanCalculator());
    }

    @Test
    void testCarLoanCalculatorAmountHigh()
    {
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new BankLoan("Brian", "Sharkey",5,  65001).carLoanCalculator();});
        assertEquals("Invalid car loan figure, cannot exceed 65000", e.getMessage());
    }



    @Test
    void testYearsOnLoanGetter()
    {
        assertEquals(5,  new BankLoan("Brian", "Sharkey",5,45000).getYearsOnLoan());
    }
@Test
   void testYearsOnLoanSetter1()
    {
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new BankLoan().setYearsOnLoan(36);});
        assertEquals("Invalid Loan Term, Maximum term is 35 years - Minimum term is 1 year.", e.getMessage());
    }
 @Test
    void testYearsOnLoanSetter2()
    {
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new BankLoan().setYearsOnLoan(0);});
        assertEquals("Invalid Loan Term, Maximum term is 35 years - Minimum term is 1 year.", e.getMessage());
    }

    @Test
    void testYearsOnLoanSetter3()
    {
        BankLoan bankloan = new BankLoan();
        bankloan.setYearsOnLoan(5);
        assertEquals(5,  bankloan.getYearsOnLoan());
    }


    @Test
    void testLoanAmountSetter1()
    {
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new BankLoan().setLoanAmount(1999);});
        assertEquals("Invalid loan amount, Figure cannot be lower than 2000", e.getMessage());
    }
    @Test
    void testLoanAmountSetter2()
    {
        BankLoan bankloan = new BankLoan();
        bankloan.setLoanAmount(100000);
        assertEquals(100000,  bankloan.getLoanAmount());
    }

    @Test
    void testFirstNameSetter()
    {
        BankLoan bankloan = new BankLoan();
        bankloan.setfName("Brian");
        assertEquals("Brian",  bankloan.getfName());
    }

    @Test
    void testFirstNameSetter2()
    {
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new BankLoan().setfName("b");});
        assertEquals("First name must be greater than 2 characters.", e.getMessage());
    }

    @Test
    void testFirstNameSetter3()
    {
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new BankLoan().setfName("briansharkeybriansharkeyb");});
        assertEquals("First name must be less than 25 characters.", e.getMessage());
    }

    @Test
    void testLastNameSetter()
    {
        BankLoan bankloan = new BankLoan();
        bankloan.setlName("Sharkey");
        assertEquals("Sharkey",  bankloan.getlName());
    }

    @Test
    void testLastNameSetter2()
    {
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new BankLoan().setlName("s");});
        assertEquals("Last name must be greater than 2 characters.", e.getMessage());
    }

    @Test
    void testLastNameSetter3()
    {
        Exception e = assertThrows(IllegalArgumentException.class, ()->{new BankLoan().setlName("briansharkeybriansharkeybrian");});
        assertEquals("Last name must be less than 25 characters.", e.getMessage());
    }

    @Test
    void testLoanAmountGetter()
    {
        assertEquals(45000,  new BankLoan("Brian", "Sharkey",5,45000).getLoanAmount());
    }

    @Test
    void testfNameGetter()
    {
        assertEquals("Brian",  new BankLoan("Brian", "Sharkey",5,45000).getfName());
    }

    @Test
    void testlNameGetter()
    {
        assertEquals("Sharkey",  new BankLoan("Brian", "Sharkey",5,45000).getlName());
    }












}


