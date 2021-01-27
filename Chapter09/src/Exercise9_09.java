public class Exercise9_09 {
    public static void main(String[] args) {

        // Test RegularPolygon with three objects

        RegularPolygon polygon1 = new RegularPolygon();
        System.out.printf("Polygon1's area is %.2f and perimeter is %.2f%n",
                polygon1.getArea(), polygon1.getPerimeter());

        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        System.out.printf("Polygon2's area is %.2f and perimeter is %.2f%n",
                polygon2.getArea(), polygon2.getPerimeter());

        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.printf("Polygon3's area is %.2f and perimeter is %.2f%n",
                polygon3.getArea(), polygon3.getPerimeter());
    }
}

class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    RegularPolygon() {
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }

    RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        x = y = 0;
    }

    RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    /** Accessors */
    public int getN() {
        return n;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    /** Mutators */
    public void setN(int n) {
        this.n = n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter() {
        return n * side;
    }

    public double getArea() {
        return  (n * side * side) / (4 * Math.tan(Math.PI / 4));
    }
}
