import attractions.Dodgems;
import attractions.Playground;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class ThemeParkTest {

    ThemePark themePark;
    ArrayList attractions;
    ArrayList stalls;

    Dodgems dodgem;
    Playground playground;

    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;

    Visitor visitor;



    @Before
    public void before(){
        dodgem = new Dodgems("Dodgem", 4);
        playground = new Playground("PG", 2);
        attractions = new ArrayList();
        attractions.add(dodgem);
        attractions.add(playground);
        iceCreamStall = new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4, 4);
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 1);
        stalls = new ArrayList();
        stalls.add(iceCreamStall);
        stalls.add(tobaccoStall);
        themePark = new ThemePark("Butlands", attractions, stalls);
        visitor = new Visitor(14, 1.2, 40.0);
    }

    @Test
    public void hasName(){
        assertEquals("Butlands", themePark.hasName());
    }

    @Test
    public void hasAttractionsList(){
        assertEquals(2, themePark.getAttractions().size());
    }

    @Test
    public void hasStallsList(){
        assertEquals(2, themePark.getStalls().size());
    }

    @Test
    public void canGetReviewedList(){
        assertEquals(4, themePark.getReviewed().size());
    }

    @Test
    public void canGetReviewedList_SpecificTest(){
        assertEquals(dodgem, themePark.getReviewed().get(0));
    }

    @Test
    public void canVisitAttraction(){
        themePark.visit(visitor, dodgem);
        assertEquals(1, visitor.getVisitedAttractions().size());
        assertEquals(1, dodgem.getVisitCount());
    }

    @Test
    public void hasReviewHashMap(){
        themePark.getReviewed();
        assertEquals(4, themePark.reviews().get("Dodgem"), 0.01);
        System.out.println(themePark.reviews());
    }

}
