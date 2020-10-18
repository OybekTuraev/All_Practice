import java.util.Scanner;

public class Exercise3_19 {
    public static void main(String[] args){

        /**
         * Compute the perimeter of a triangle
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three edges of triangle: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double perimeter = a + b + c;

        if (a + b > c && b + c > a && a + c > b){
            System.out.printf("The perimeter of the triangle is %.2f%n", perimeter);
        }
        else {
            System.out.println("The input is invalid");
        }
    }
}
