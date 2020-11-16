import java.util.Scanner;

public class Exercise4_07 {
    public static void main(String[] args) {

        // Corner point coordinates

        final double FULL_CIRCLE = 360;
        final double RIGHT_ANGLE = 90;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the bounding circle: ");
        double radius = scanner.nextDouble();

        double p1_angle = Math.toRadians(RIGHT_ANGLE - (FULL_CIRCLE / 5));
        double p2_angle = Math.toRadians(RIGHT_ANGLE);
        double p3_angle = Math.toRadians(RIGHT_ANGLE + FULL_CIRCLE / 5);
        double p4_angle = Math.toRadians(RIGHT_ANGLE + 2 * (FULL_CIRCLE / 5));
        double p5_angle = Math.toRadians(RIGHT_ANGLE + 3 * (FULL_CIRCLE / 5));

        double x1 = radius * Math.cos(p1_angle);
        double y1 = radius * Math.sin(p1_angle);

        double x2 = radius * Math.cos(p2_angle);
        double y2 = radius * Math.sin(p2_angle);

        double x3 = radius * Math.cos(p3_angle);
        double y3 = radius * Math.sin(p3_angle);

        double x4 = radius * Math.cos(p4_angle);
        double y4 = radius * Math.sin(p4_angle);

        double x5 = radius * Math.cos(p5_angle);
        double y5 = radius * Math.sin(p5_angle);

        System.out.printf("The coordinates of five points on the pentagon are " +
                "\n(%.4f %.4f)" +
                "\n(%.4f %.4f)" +
                "\n(%.4f %.4f)" +
                "\n(%.4f %.4f)" +
                "\n(%.4f %.4f)\n", x1, y1, x2, y2, x3, y3, x4, y4, x5, y5);
    }
}
