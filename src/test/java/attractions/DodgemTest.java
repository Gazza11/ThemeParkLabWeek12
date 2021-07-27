package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitorYoung;
    Visitor visitorOld;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitorOld = new Visitor(18, 1.9, 11.9);
        visitorYoung = new Visitor(11, 1.2, 34.0);
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
    public void hasDefaultPrice(){
        assertEquals(4.5, dodgems.defaultPrice(), 0.01);
    }

    @Test
    public void hasVisitorPrice_Old(){
        assertEquals(4.5, dodgems.priceFor(visitorOld), 0.01);
    }

    @Test
    public void hasVisitorPrice_Young(){
        assertEquals(2.25, dodgems.priceFor(visitorYoung), 0.01);
    }

}
