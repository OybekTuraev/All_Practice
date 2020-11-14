import java.util.Scanner;

public class Exercise4_02 {
    public static void main(String[]args){

        // Geometry: great circle distance

        final double RADIUS = 6371.01;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        String points1 = scanner.nextLine();
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        String points2 = scanner.nextLine();

        int k = points1.indexOf(",");
        double x1 = Double.parseDouble(points1.substring(0, k - 1));
        double y1 = Double.parseDouble(points1.substring(k + 2));

        k = points2.indexOf(",");
        double x2 = Double.parseDouble(points2.substring(0, k - 1));
        double y2 = Double.parseDouble(points2.substring(k + 2));

        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);              // 39.55, -116.25  41.5, 87.37
        y2 = Math.toRadians(y2);

        double part1 = Math.sin(x1) * Math.sin(x2);
        double part2 = Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2);
        double distance = RADIUS * Math.acos(part1 + part2);

        System.out.printf("The distance between the two points is %f km%n", distance);
    }
}
