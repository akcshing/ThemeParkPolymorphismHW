import attractionStuff.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {
    Park park;

    @Before
    public void before(){
        park = new Park("Jurassic Park", 5);
    }

    @Test
    public void canGetName(){
        assertEquals("Jurassic Park", park.getName());
    }

}
