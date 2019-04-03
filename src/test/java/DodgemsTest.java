import attractionStuff.Dodgems;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {
    Dodgems dodgems;

    @Before
    public void before(){
        dodgems = new Dodgems("The DUI", 5);
    }

    @Test
    public void canGetName(){
        assertEquals("The DUI", dodgems.getName());
    }

    @Test
    public void canGetRating(){
        assertEquals(5, dodgems.getRating());
    }
}
