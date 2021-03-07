public class CircleWithException {
    private double radius;
    private static int numberOfObjects = 0;

    /** Construct a circle with radius 1 */
    public CircleWithException() {
        this(1.0);
    }

    public CircleWithException(double radius) {
        setRadius(radius);
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws IllegalArgumentException { // declare an exception
        if (radius >= 0) {
            this.radius = radius;
        }
        else {
            throw new IllegalArgumentException("Radius cannot be negative"); // throw an exception
        }
    }

    public static int getNumberOfObjects() {
        return getNumberOfObjects();
    }

    public double findArea() {
        return radius * radius * Math.PI;
    }
}
