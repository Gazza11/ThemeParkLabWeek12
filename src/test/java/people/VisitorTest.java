package people;

import attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;
    Dodgems dodgem;

    @Before
    public void before(){
        visitor = new Visitor(14, 1.2, 40.0);
        dodgem = new Dodgems("DD", 3);
    }

    @Test
    public void hasAge() {
        assertEquals(14, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(1.2, visitor.getHeight(), 0.1);
    }

    @Test
    public void hasMoney() {
        assertEquals(40.0, visitor.getMoney(), 0.1);
    }

    @Test
    public void hasVisitedAttractions(){
        assertEquals(0, visitor.getVisitedAttractions().size());
    }

    @Test
    public void canAddVisitedAttractions() {
        visitor.addVisitedAttraction(dodgem);
        assertEquals(1, visitor.getVisitedAttractions().size());
    }
}
