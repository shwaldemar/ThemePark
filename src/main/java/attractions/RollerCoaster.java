package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements IReviewed, ITicketed {

    public RollerCoaster(String name, int rating, double price) {

        super(name, rating);
    }

    //over 145cm tall and over 12 years of age
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getHeight() >= 145 && visitor.getAge() >= 12) {
            return true;
        }
        else {
            return false;
        }
    }

    public double defaultPrice(Visitor visitor) {
        if (visitor.getHeight() >= 200) {
            return 8.40 * 2;
        }
        else {
            return 8.40;
        }
    }

    public double priceForVisitor(Visitor visitor) {
        return 8.40;
    }
}
