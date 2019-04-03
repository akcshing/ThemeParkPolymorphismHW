package themeparkStuff;

import attractionStuff.Attraction;
import attractionStuff.IReviewed;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> allReviewed;

    public ThemePark(){
        this.allReviewed = new ArrayList<>();
    }

    public ArrayList<IReviewed> getAllReviewed(){
        return this.allReviewed;
    }

    public void addThemeParkThing(IReviewed themeParkThing){
        this.allReviewed.add(themeParkThing);
    }

    public void visit(Visitor visitor, Attraction attraction){

    }


}
