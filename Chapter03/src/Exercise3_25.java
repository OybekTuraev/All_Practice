import java.util.Scanner;

public class Exercise3_25 {
    public static void main(String[] args){

        /**
         *   Geometry: intersecting point
         */

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

        // Finding the values with Cramer's rule

        double a = y1 - y2;
        double b = -1 * (x1 - x2);
        double c = y3 - y4;
        double d = -1 * (x3 - x4);
        double e = ((y1 - y2) * x1) - (x1 - x2) * y1;
        double f = ((y3 - y4) * x3) - (x3 - x4) * y3;

        // Formula: finding x and y

        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);

        // checking has solutions or no
        if (a * d - b * c == 0){
            System.out.println("The two lines are parallel");
        }
        else{
            System.out.printf("The intersecting point is at (%.4f, %.4f)%n", x, y);
        }
    }
}
