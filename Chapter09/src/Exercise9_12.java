import java.util.Scanner;

public class Exercise9_12 {
    public static void main(String[] args) {

        // Geometry: Intersecting Point
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        double x4 = scanner.nextDouble();
        double y4 = scanner.nextDouble();

        // Liner 1 arguments
        double a = y1 - y2;
        double b = -1 * (x1 - x2);
        double e1 = ((y1 - y2) * x1) - (x1 - x2) * y1;

        // Liner 2 arguments
        double c = y3 - y4;
        double d = -1 * (x3 - x4);
        double e2 = ((y3 - y4) * x3) - (x3 - x4) * y3;

        LinearEquation equation = new LinearEquation(a, b, e1, c, d, e2);

        if (equation.isSolvable()) {
            System.out.printf("Intersecting point is (%.2f, %.2f)%n", equation.getX(), equation.getY());
        }
        else {
            System.out.println("The equation has no roots");
        }
    }
}
