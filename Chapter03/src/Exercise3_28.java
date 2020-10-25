import java.util.Scanner;

public class Exercise3_28 {
    public static void main(String[] args) {

        /**
         *  Geometry: two rectangles
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double width1 = scanner.nextDouble();
        double height1 = scanner.nextDouble();

        System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double width2 = scanner.nextDouble();
        double height2 = scanner.nextDouble();

        double corner1x = x2 - width2 / 2;
        double corner1y = y2 + height2 / 2;
        double corner2x = x2 + width2 / 2;
        double corner2y = y2 + height2 / 2;
        double corner3x = x2 + width2 / 2;
        double corner3y = y2 - height2 / 2;
        double corner4x = x2 - width2 / 2;
        double corner4y = y2 - height2 / 2;

        int counter = 0;

        if (corner1x >= x1 - width1 / 2 && corner1x <= x1 + width1 / 2 &&
                corner1y >= y1 - height1 / 2 && corner1y <= y1 + height1 / 2) {
            counter++;
        }

        if (corner2x >= x1 - width1 / 2 && corner2x <= x1 + width1 / 2 &&
                corner2y >= y1 - height1 / 2 && corner2y <= y1 + height1 / 2) {
            counter++;
        }

        if (corner3x >= x1 - width1 / 2 && corner3x <= x1 + width1 / 2 &&
                corner3y >= y1 - height1 / 2 && corner3y <= y1 + height1 / 2) {
            counter++;
        }

        if (corner4x >= x1 - width1 / 2 && corner4x <= x1 + width1 / 2 &&
                corner4y >= y1 - height1 / 2 && corner4y <= y1 + height1 / 2) {
            counter++;
        }

        switch (counter) {
            case 4:
                System.out.println("r2 is inside r1");
                break;
            case 0:
                System.out.println("r2 does not overlap r1");
                break;
            default:
                System.out.println("r2 overlaps r1");
        }
    }
}

