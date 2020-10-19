import java.util.Scanner;

public class Exercise3_34 {
    public static void main(String[] args){

        /**
         *  Geometry: point on line segment
         */

        Scanner scanner = new Scanner(System.in);

        //  x0 : y0 --- P0
        //  x1 : y1 --- P1
        //  x2 : y2 --- P2 -- testing point

        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = scanner.nextDouble();
        double y0 = scanner.nextDouble();
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        if (((x2 > x0) && (x2 < x1)) && ((y2 > y0) && (y2 < y1)) ){
            System.out.printf("(%.1f, %.1f) is on the line segment from (%.1f, %.1f) to (%.1f, %.1f)%n", +
                    x2, y2, x0, y0, x1, y1);
        }
        else{
            System.out.printf("(%.1f, %.1f) is not on the line segment from (%.1f, %.1f) to (%.1f, %.1f)%n", +
                    x2, y2, x0, y0, x1, y1);
        }
    }
}
