package Geometric;

public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricObject obj1 = new Circle(5);
        GeometricObject obj2 = new Rectangle(5, 4);

        System.out.println("The same Area? " + equalArea(obj1, obj2));

        display(obj1);
        display(obj2);
    }

    public static boolean equalArea(GeometricObject obj1, GeometricObject obj2) {
        return obj1.getArea() == obj2.getArea();
    }

    public static void display(GeometricObject object) {
        System.out.println();
        System.out.println("The Area is " + object.getArea());
        System.out.println("The Perimeter is " + object.getPerimeter());
    }
}
