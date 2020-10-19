import java.util.Scanner;

public class Exercise3_29 {
    public static void main(String[] args){

        /**
         * Geometry: two circles
         * Hint: circle2 is inside circle1 if the distance between the two centers  <= |r1 - r2|
         * and circle2 overlaps circle1 if the distance between the two centers <= r1 + r2.
         */

        Scanner scanner  = new Scanner(System.in);

        System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double radius1 = scanner.nextDouble();
        System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double radius2 = scanner.nextDouble();

        // Distance between centers
        double center_x = Math.pow(x2 - x1, 2);
        double center_y = Math.pow(y2 - y1, 2);
        double distance = Math.sqrt(center_x + center_y);

        double dif_r = Math.abs(radius1 - radius2); // for inside
        double add_r = radius1 + radius2; // for overlap

        if (distance <= dif_r){
            System.out.println("circle2 is inside circle1");
        }
        else if (distance <= add_r){
            System.out.println("circle2 overlaps circle1");
        }
        else {
            System.out.println("circle2 does not overlap circle1");
        }
    }
}
