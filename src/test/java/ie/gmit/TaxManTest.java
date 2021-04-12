/*
Name: Latif Yahia
Email: G00348688@gmit.ie
Project: TaxCalculator
This test class will run tests to validate the data being entered into TaxMan class.
Both failure and pass are being tested for.
 */

package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TaxManTest {

    private TaxMan taxMan;
    @BeforeEach
    void setup() { taxMan = new TaxMan(1, "no",1);}

    @Test
    void selectionTestFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new TaxMan(0,"no",1));
        assertEquals("Invalid Selection, please select a value between 1 - 3", e.getMessage());
    }

    @Test
    void selectionPass1()
    {
        TaxMan e = new TaxMan(1,"no",1);
        assertEquals(1, e.getSelection());
    }
    @Test
    void selectionPass2()
    {
        TaxMan e = new TaxMan(2,"no",1);
        assertEquals(2, e.getSelection());
    }
    @Test
    void selectionPass3()
    {
        TaxMan e = new TaxMan(3,"no",1);
        assertEquals(3, e.getSelection());
    }

    @Test
    void endAnswerFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new TaxMan(1,"ooo",1));
        assertEquals("Invalid Answer, Please Type Yes / No", e.getMessage());
    }

    @Test
    void endAnswerPass1()
    {
        TaxMan e = new TaxMan(1,"no",1);
        assertEquals("no", e.getEndAnswer());
    }

    @Test
    void endAnswerPass2()
    {
        TaxMan e = new TaxMan(1,"yes",1);
        assertEquals("yes", e.getEndAnswer());
    }

    @Test
    void bankLoanSelectionTestFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new TaxMan(1,"no",0));
        assertEquals("Invalid Selection, please select a value between 1 and 2", e.getMessage());
    }

    @Test
    void bankLoanSelectionPass1()
    {
        TaxMan e = new TaxMan(1,"no",1);
        assertEquals(1, e.getSelection());
    }
    @Test
    void bankLoanSelectionPass2()
    {
        TaxMan e = new TaxMan(1,"no",2);
        assertEquals(2, e.getSelection());
    }

}
