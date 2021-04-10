import Geometric.Circle;
import Geometric.Rectangle;

public class CastingDemo {
    public static void main(String[] args) {
        Object object1 = new Circle(1);
        Object object2 = new Rectangle(1, 1);

        //Display
        display(object1);
        display(object2);
    }

    public static void display(Object object) {
        if (object instanceof Circle) {
            System.out.println("The circle area is " + ((Circle) object).getArea());
            System.out.println("The circle diameter is " + ((Circle) object).getDiameter());
        }
        else if (object instanceof Rectangle) {
            System.out.println("The rectangle area is " + ((Rectangle)object).getArea());
        }
    }
}
