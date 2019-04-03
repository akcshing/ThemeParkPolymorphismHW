import attractionStuff.Playground;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;

    @Before
    public void before(){
        playground = new Playground("The Playground", 5);
    }

    @Test
    public void canGetName(){
        assertEquals("The Playground", playground.getName());
    }
}
