package stallStuff;

import attractionStuff.IReviewed;

public abstract class Stall implements IReviewed {

    private String name;
    private String ownerName;
    private int parkingSpot;
    private int rating;

    public Stall(String name, String ownerName, int parkingSpot, int rating){
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.rating = rating;
    }

    public int getRating(){
        return this.rating;
    }

    public String getName(){
        return this.name;
    }
}
