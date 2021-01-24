public class TestSimpleCircle {
    public static void main(String[] args) {

        // Create a circle with radius 1
        SimpleCircle1 circle1 = new SimpleCircle1();
        System.out.println(circle1.radius + "  " + circle1.getArea());

        // Create a circle with radius 25
        SimpleCircle1 circle2 = new SimpleCircle1(20);
        System.out.println(circle2.radius + "  " + circle2.getArea());

        // Create a circle with radius 125
        SimpleCircle1 circle3 = new SimpleCircle1(200);
        System.out.println(circle3.radius + "  " + circle3.getArea());

        // Modify circle radius
        circle2.setRadius(100);
        System.out.println(circle2.radius + "  " + circle2.getArea());
    }
}

// Define the circle class with two constructor
class SimpleCircle1 {
    double radius;

    // radius for the 1st circle
    SimpleCircle1() {
        radius = 1;
    }

    // radius for the specified circle
    SimpleCircle1(double newRadius) {
        radius = newRadius;
    }

    // Methods to return the value
    double getArea() {
        return radius * radius * Math.PI;
    }

    void setRadius(double newRadius) {
        radius = newRadius;
    }
}

