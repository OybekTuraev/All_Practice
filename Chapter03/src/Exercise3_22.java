import java.util.Scanner;

public class Exercise3_22 {
    public static void main(String[] args){

        /**
         *  Geometry: point in a circle?
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        double distance = Math.hypot(x, y);

        if (distance <= 10){
            System.out.printf("Point (%.1f, %.1f) is in the circle%n", x, y);
        }
        else {
            System.out.printf("Point (%.1f, %.1f) is not in the circle%n", x, y);
        }
    }
}
