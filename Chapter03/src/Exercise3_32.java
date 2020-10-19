import java.util.Scanner;

public class Exercise3_32 {
    public static void main(String[] args) {

        /**
         *  Geometry: point position
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = scanner.nextDouble();
        double y0 = scanner.nextDouble();
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double formula = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

        if (formula > 0){
            System.out.printf("(%.1f, %.1f) is on the left side of the line from (%.1f, %.1f) to (%.1f, %.1f)%n", +
                    x2, y2, x0, y0, x1, y1);
        }
        else if (formula == 0){
            System.out.printf("(%.1f, %.1f) is on the line from (%.1f, %.1f) to (%.1f, %.1f)%n", +
                    x2, y2, x0, y0, x1, y1);
        }
        else{
            System.out.printf("(%.1f, %.1f) is on the right side of the line from (%.1f, %.1f) to (%.1f, %.1f)%n", +
                    x2, y2, x0, y0, x1, y1);
        }
    }
}
