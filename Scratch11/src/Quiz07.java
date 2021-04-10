import Geometric.Circle;

public class Quiz07 {
    public static void main(String[] args) {
        Circle1 circle1 = new Circle1();
        Circle1 circle2 = new Circle1();
        System.out.println(circle1.equals(circle2));
    }
}

class Circle1 {
    double radius;

    public boolean equals(Circle1 circle) {
        if (circle instanceof Circle1) {
            return radius == ((Circle1) circle).radius;
        }
        else {
            return this == circle;
        }
    }
}
