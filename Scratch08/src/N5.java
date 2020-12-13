import java.util.Scanner;

public class N5 {
    public static void main(String[] args){

                                    //  Find the Nearest Point

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of points: ");
        int numberOfPoints = scanner.nextInt();

        double[][] points = new double[numberOfPoints][2];

        System.out.print("Enter " + points.length + " points: ");

        // reading from the user the points
        for (int i = 0; i < points.length; i++){
            points[i][0] = scanner.nextDouble();
            points[i][1] = scanner.nextDouble();
        }
        
        // Creating and initializing the shortest distance
        int p1 = 0;
        int p2 = 1;
        
        double shortestDistance = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]);

        // Compute the distance for every two points, i and j are row indices for every two points
        for (int i = 0; i < points.length; i++){
            for (int j = i + 1; j < points.length; j++){

                double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);

                if (shortestDistance > distance){
                    p1 = i;
                    p2 = j;
                    shortestDistance = distance;
                }
            }
        }

        System.out.println("The two closest points are " + "(" + points[p1][0] + "," +  points[p1][1] + ") and " +
                 "(" + points[p2][0] + "," + points[p2][1] + ")");
    }

    public static double distance(double x1, double y1, double x2, double y2){

        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
