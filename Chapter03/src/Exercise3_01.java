import java.util.Scanner;

public class Exercise3_01 {
    public static void main(String[] args){

        /**
         * (Algebra: solve quadratic equations
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double root_inside = b * b - 4 * a * c;

        if (root_inside > 0){
            double r1 = (-b + Math.sqrt(root_inside)) / (2 * a);
            double r2 = (-b - Math.sqrt(root_inside)) / (2 * a);
            System.out.printf("The equation has two roots %.6f and %.6f%n", r1, r2);
        }
        else if (root_inside == 0){
            double r = -b / (2 * a);
            System.out.println("The equation has one root " + r);
        }
        else {
            System.out.println("The equation has no real roots");
        }
    }
}
