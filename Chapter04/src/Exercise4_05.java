import java.util.Scanner;

public class Exercise4_05 {
    public static void main(String[] args){

        // Geometry: area of a regular polygon

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of the sides: ");
        int sides = scanner.nextInt();
        System.out.print("Enter the side: ");
        double length = scanner.nextDouble();

        double area = sides * length * length / (4 * Math.tan(Math.PI / sides));

        System.out.printf("The area of the polygon is %f%n", area);
    }
}
