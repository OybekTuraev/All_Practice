import sun.nio.cs.ext.MacArabic;

import java.util.Scanner;

public class Exercise4_04 {
    public static void main(String[]args){

        // Geometry: area of a hexagon

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double side = scanner.nextDouble();

        double area = 6 * side * side / (4 * Math.tan(Math.PI / 6));

        System.out.printf("The area of the hexagon is %.2f%n", area);
    }
}
