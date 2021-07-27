package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitorYes;
    Visitor visitorNo;
    Visitor visitorTallYoung;
    Visitor visitorNotTooTall;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitorYes = new Visitor(19, 2.12, 12.10);
        visitorNo = new Visitor(11, 1.22, 9.00);
        visitorTallYoung = new Visitor(11, 1.90, 11.00);
        visitorNotTooTall = new Visitor(17, 1.78, 12.00);
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

    @Test
    public void canCheckHeight_TallEnough(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitorYes));
    }

    @Test
    public void canCheckHeight_NotTallEnough(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitorNo));
    }

    @Test
    public void canCheckAllowed_Tall_Young(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitorTallYoung));
    }

    @Test
    public void canCheckDefaulPrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.01);
    }

    @Test
    public void canCheckVisitorPrice_Short(){
        assertEquals(8.40, rollerCoaster.priceFor(visitorNotTooTall), 0.01);
    }

    @Test
    public void canCheckVisitorPrice_Tall(){
        assertEquals(16.80, rollerCoaster.priceFor(visitorYes), 0.01);
    }
}
