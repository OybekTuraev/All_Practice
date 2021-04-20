package Geometric;

public class Circle extends GeometricObject{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        //this.color = color; you can use the this.color
        // if the visibility modifier of the data type is protected
        //setColor(color);
        //setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getDiameter() {
        return radius * 2;
    }

    @Override
    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() +
                " and the radius is " + radius);
    }
}
