public class CircleWithExceptionChecked {
    private double radius;
    private static int numberOfObjects = 0;

    /** Construct a circle with radius 1 */
    public CircleWithExceptionChecked() throws InvalidRadiusException {
        this(1.0);
    }

    public CircleWithExceptionChecked(double radius) throws InvalidRadiusException {
        setRadius(radius);
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) throws InvalidRadiusException { // declare an exception
        if (newRadius >= 0) {
            radius = newRadius;
        }
        else {
            throw new InvalidRadiusException(newRadius); // throw an exception
        }
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public double findArea() {
        return radius * radius * Math.PI;
    }
}
