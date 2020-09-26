import java.util.Scanner;

public class Exercise2_02 {
    public static void main(String[] args){

        /**
         *  Compute the volume of a cylinder
         *  Formula area = radius * radius * p
         *  Volume = area * length
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = scan.nextDouble();
        double length = scan.nextDouble();

        double area = radius * radius * Math.PI;
        double volume = area * length;

        System.out.println("The area is " +  area);
        System.out.println("The volume is " + volume);

        // or USE "Printf" style Rounding for shorter digits after decimal

        /**
         * System.out.printf("The area is %.4f\n", area);
         * System.out.printf("The volume is %.1f\n", volume);
         */
    }
}
