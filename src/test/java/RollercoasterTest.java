import attractionStuff.Rollercoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("The Whirley Dirley", 4);
    }

    @Test
    public void canGetName(){
        assertEquals("The Whirley Dirley", rollercoaster.getName());
    }
}
