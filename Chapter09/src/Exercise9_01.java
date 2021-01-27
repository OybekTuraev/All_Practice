public class Exercise9_01 {
    public static void main(String[] args) {

        // Test program for Rectangle
        Rectangle rec1 = new Rectangle(4, 40);
        System.out.println("Area of the Rec1 with width " + rec1.width +
                " and height " + rec1.height + " is " + rec1.getArea() + "\n Perimeter is " + rec1.getPerimeter());

        Rectangle rec2 = new Rectangle(3.5, 35.9);
        System.out.println("Area of the Rec2 with width " + rec2.width +
                " and height " + rec2.height + " is " + rec2.getArea() + "\n Perimeter is " + rec2.getPerimeter());
    }
}

    // Rectangle Class
class Rectangle {
    double width;
    double height;

    // No-arg Constructor
    Rectangle() {
        width = 1;
        height = 1;
    }

    // Constructor with the specified values
    Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    // Method to get the area
    public double getArea() {
        return this.width * this.height;
    }

    // Method to get the perimeter
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }
}
