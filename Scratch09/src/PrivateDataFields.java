class Test {
    public static void main(String[] args) {

        PrivateDataFields object1 = new PrivateDataFields();
        System.out.println("First circle's area with the radius " + object1.getRadius() + " is " + object1.getArea());

        PrivateDataFields object = new PrivateDataFields(5);
        System.out.println("Area with the radius " + object.getRadius() + " is " + object.getArea());

        object.setRadius(object.getRadius() * 1.1);
        System.out.println("New area with the radius " + object.getRadius() + " is " + object.getArea());

        System.out.println("Number of the objects created is " + PrivateDataFields.getNumberOfObjects());
    }
}

public class PrivateDataFields {
    private double radius = 1;

    private static int numberOfObjects = 0;

    public PrivateDataFields() {
        numberOfObjects++;
    }

    public PrivateDataFields(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        radius = (newRadius >= 0) ? newRadius : 0;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
