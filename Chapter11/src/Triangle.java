import Geometric.GeometricObject;

import java.util.Scanner;

public class Triangle extends GeometricObject {
    protected double side1, side2, side3;

    Triangle() {
        side1 = side2 = side3 = 1.0;
    }

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    protected double getSide1() {
        return side1;
    }

    protected double getSide2() {
        return side2;
    }

    protected double getSide3() {
        return side3;
    }

    protected double getArea() {
        double area, pHalf;
        pHalf = (side1 + side2 + side3) / 2;
        area = Math.sqrt(pHalf * (pHalf - side1) * (pHalf - side2) * (pHalf - side3));

        return area;
    }

    protected double getPerimeter() {
        return (side1 + side2 + side3);
    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 +
                " side2 = " + side2 + " side3 = " + side3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sides of the triangle: ");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        Triangle triangle = new Triangle(side1, side2, side3);

        System.out.println(triangle.toString());

        System.out.print("Enter the color: ");
        String color = scanner.next();
        triangle.setColor(color);
        System.out.println(triangle.getColor());

        System.out.println("Is filled?: " + triangle.isFilled());
        System.out.println("Area is " + triangle.getArea());
    }
}
