package stalls;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecurity, IReviewed {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot, int review) {

        super(name, ownerName, parkingSpot, review);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 18) {
            return true;
        }
        else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public int getRating() {

        return rating;
    }
}
