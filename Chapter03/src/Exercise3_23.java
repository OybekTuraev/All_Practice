import java.util.Scanner;

public class Exercise3_23 {
    public static void main(String[] args){

        /**
         *  Geometry: point in a rectangle?
         */

        final double WIDTH = 10;
        final double HEIGHT = 5;

        Scanner scanner  = new Scanner (System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        // for negative values also, their length should be in range
        double x_check = Math.sqrt(Math.pow(x, 2));
        double y_check = Math.sqrt(Math.pow(y, 2));

        if (x_check <= (WIDTH / 2) && y_check <= (HEIGHT / 2)){
            System.out.printf("Point (%.1f, %.1f) is in rectangle", x, y);
        }
        else{
            System.out.printf("Point (%.1f, %.1f) is not in rectangle", x, y);
        }
    }
}
