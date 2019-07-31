package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements IReviewed, ITicketed {

    public Dodgems(String name, int rating, double price) {

        super(name, rating);
    }

    public double defaultPrice(Visitor visitor) {
        if (visitor.getAge() <= 12) {
            return 4.50 / 2;
        }
        else {
            return 4.50;
        }
    }

    public double priceForVisitor(Visitor visitor) {
        return 4.50;
    }

}
