import java.util.Scanner;

public class Exercise4_01 {
    public static void main(String[] args){


        // Geometry: area of a pentagon

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length from the center to a vertex: ");
        String radius = scanner.nextLine();

        double radius_converted = Double.parseDouble(radius);

        double side = 2 * radius_converted * Math.sin(Math.PI / 5);

        double area = 5 * side * side / (4 * Math.tan(Math.PI / 5));

        System.out.printf("The are of the pentagon is %.2f%n", area);
    }
}
