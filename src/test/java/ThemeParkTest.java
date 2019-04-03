import attractionStuff.Dodgems;
import attractionStuff.Rollercoaster;
import org.junit.Before;
import org.junit.Test;
import stallStuff.CandyFlossStall;
import stallStuff.IceCreamStall;
import themeparkStuff.ThemePark;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    Rollercoaster rollercoaster;
    Dodgems dodgems;
    CandyFlossStall candyFlossStall;
    IceCreamStall iceCreamStall;
    ThemePark themePark;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("The Rollercoaster", 9);
        dodgems = new Dodgems("The Dodgems", 6);
        candyFlossStall = new CandyFlossStall("Candy Stall", "Nick Cage", 5, 8);
        iceCreamStall = new IceCreamStall("Ice Cream Stall", "Hank Marve", 3, 8);
        themePark = new ThemePark();
    }

    @Test
    public void themeParkStartsEmpty(){
        assertEquals(0, themePark.getAllReviewed().size());
    }

    @Test
    public void canAddThemeParkThing(){
        themePark.addThemeParkThing(rollercoaster);
        themePark.addThemeParkThing(dodgems);
        themePark.addThemeParkThing(candyFlossStall);
        themePark.addThemeParkThing(iceCreamStall);
        assertEquals(4, themePark.getAllReviewed().size());
    }
}
