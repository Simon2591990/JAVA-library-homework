import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower borrower;

    @Before
    public void before(){
        borrower = new Borrower("Simon");
    }
    @Test
    public void hasName(){
        assertEquals("Simon", borrower.getName());
    }

}
