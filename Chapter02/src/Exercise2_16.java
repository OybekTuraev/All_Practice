import java.util.Scanner;

public class Exercise2_16 {
    public static void main(String[] args){

        /**
         * Geometry: area of a hexagon
         * Formula   Area = (3 * Math.pow(3, 0.5) * s * s) / 2;
         */

        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter the side: ");
        double s = scanner.nextDouble();

        double area = (3 * Math.pow(3, 0.5) * s * s) / 2.0;

        System.out.printf("The area of the hexagon is %.4f\n", area);
    }
}
