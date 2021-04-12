package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TaxManTest {

    private TaxMan taxMan;
    @BeforeEach
    void setup() { taxMan = new TaxMan(1);}

    @Test
    void SelectionTestFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new TaxMan(0));
        assertEquals("Invalid Selection, please select a value between 1 - 3", e.getMessage());
    }

    @Test
    void SelectionPass1()
    {
        TaxMan e = new TaxMan(1);
        assertEquals(1, e.getSelection());
    }
    @Test
    void SelectionPass2()
    {
        TaxMan e = new TaxMan(2);
        assertEquals(2, e.getSelection());
    }
    @Test
    void SelectionPass3()
    {
        TaxMan e = new TaxMan(3);
        assertEquals(3, e.getSelection());
    }
}
