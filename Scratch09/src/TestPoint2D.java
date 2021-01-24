import java.awt.geom.Point2D;
import java.util.Scanner;

public class TestPoint2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2 and y2: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        javafx.geometry.Point2D p1 = new javafx.geometry.Point2D(x1, y1);
        javafx.geometry.Point2D p2 = new javafx.geometry.Point2D(x2, y2);

        System.out.println("p1 is " + p1.toString());
        System.out.println("p2 is " + p2.toString());
        System.out.println("The distance between p1 and p2 is " + p1.distance(p2));
    }
}
