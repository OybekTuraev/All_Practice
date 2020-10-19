import java.util.Scanner;

public class Exercise3_27 {
    public static void main(String[] args){

        /**
         *  Geometry: points in triangle?
         */

        final double SIDE1 = 200;
        final double SIDE2 = 100;
        // first, find the hypotenuse line, coz it is the border
        //  hypotenuse linear equation = "y = -x/2 + 100" or "x + 2 * y = 200"
        // to be inside triangle, x + 2y < 200 , should be below 200

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a point's x- and y-coordinates: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        // x and y both should be positive values

        if ((x + 2 * y < 200) && (x > 0) && (y > 0)){
            System.out.println("The point is in the triangle");
        }
        else {
            System.out.println("The point is not in the triangle");
        }
    }
}
