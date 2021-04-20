package Geometric;

import java.util.Date;

public abstract class GeometricObject {
    protected String color = "white";
    protected boolean filled;
    protected Date dateCreated;

    public GeometricObject() {
        dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    protected boolean isFilled() {
        return filled;
    }

    protected void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " +
                color + " and filled: " + filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
