package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor1, visitor2;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5, 4.50);
        visitor1 = new Visitor(14, 210, 20.00);
        visitor2 = new Visitor(11, 124, 20.00);


    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void canChargeFullPriceForAge12Plus() {
        assertEquals(4.50, dodgems.defaultPrice(visitor1), 0.01);
    }

    @Test
    public void canChargeNormalForAgeLessThan12() {
        assertEquals(2.25, dodgems.defaultPrice(visitor2), 0.01);
    }
}
