package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1, visitor2;

    @Before
    public void setUp() {

        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(12, 145, 20.00);
        visitor2 = new Visitor(11, 124, 20.00);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }


    //over 145cm tall and over 12 years of age
    @Test
    public void willAllowValidVisitor() {
        assertEquals(true, rollerCoaster.isAllowedTo(visitor1));

    }

    @Test
    public void willDenyInValidVisitor() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitor2));
    }

}
