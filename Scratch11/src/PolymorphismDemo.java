import Geometric.Circle;
import Geometric.GeometricObject;
import Geometric.Rectangle;

import java.util.Date;

public class PolymorphismDemo {
    public static void main(String[] args) {
        displayObject(new Circle(1, "red", false));
        displayObject(new Rectangle(1, 1, "black", true));

        Date date = new Date();
    }

    public static void displayObject(GeometricObject object) {
        System.out.println("Created on " + object.getDateCreated() +
                ". Color is " + object.getColor());
    }
}
