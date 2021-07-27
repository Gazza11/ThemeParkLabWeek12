package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitorOld;
    Visitor visitorYoung;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 1);
        visitorOld = new Visitor(45, 1.83, 45.00);
        visitorYoung = new Visitor(13, 1.34, 3.00);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void canAgeCheckOld(){
        assertEquals(true, tobaccoStall.isAllowedTo(visitorOld));
    }

    @Test
    public void canAgeCheckYoung(){
        assertEquals(false, tobaccoStall.isAllowedTo(visitorYoung));
    }
}
