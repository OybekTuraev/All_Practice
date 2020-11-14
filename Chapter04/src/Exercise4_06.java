import sun.nio.cs.ext.MacArabic;

public class Exercise4_06 {
    public static  void main(String[] args){

        // Random points on a circle
        // x = r * cosa; y = r * sina;

        final double PI = Math.PI;
        final double RADIUS = 40;

        // Generate angles for points [0;2PI)

        double a1 = (Math.random() * 2 * PI);
        double a2 = (Math.random() * 2 * PI);
        double a3 = (Math.random() * 2 * PI);

        // Find points through random angles
        double x1 = RADIUS * Math.cos(a1);
        double y1 = RADIUS * Math.sin(a1);

        double x2 = RADIUS * Math.cos(a2);
        double y2 = RADIUS * Math.sin(a2);

        double x3 = RADIUS * Math.cos(a3);
        double y3 = RADIUS * Math.sin(a3);

        // Find the length of the sides to find angles in the triangle
        double d1 = Math.hypot((x1 - x2), (y1 - y2));
        double d2 = Math.hypot((x1 - x3), (y1 - y3));
        double d3 = Math.hypot((x2 - x3), (y3 - y2));

        // Cosines formula to find angles
        double angle1 = Math.toDegrees(Math.acos((d2 * d2 + d3 * d3 - d1 * d1) / (2 * d2 * d3)));
        double angle2 = Math.toDegrees(Math.acos((d1 * d1 + d3 * d3 - d2 * d2) / (2 * d1 * d3)));
        double angle3 = Math.toDegrees(Math.acos((d1 * d1 + d2 * d2 - d3 * d3) / (2 * d1 * d2)));

        System.out.printf("The three angles are %f %f and %f%n", angle1, angle2, angle3);
    }
}
