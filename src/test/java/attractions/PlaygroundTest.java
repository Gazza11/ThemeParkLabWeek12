package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitorYoung;
    Visitor visitorOld;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitorYoung = new Visitor(11, 1.4, 3.15);
        visitorOld = new Visitor(22, 1.88, 12.00);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void canCheckAge_Allowed(){
        assertEquals(true, playground.isAllowedTo(visitorYoung));
    }

    @Test
    public void canCheckAge_NotAllowed(){
        assertEquals(false, playground.isAllowedTo(visitorOld));
    }

}
