import java.util.Scanner;

public class Exercise2_12 {
    public static void main(String[] args){

        /**
         * Physics: finding runway length
         * length = (v^2 / 2 * a)
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter speed and acceleration: ");
        double speed = scanner.nextDouble();
        double accel = scanner.nextDouble();

        double length = speed * speed / (2 * accel);

        System.out.printf("The minimum runway length for this airplane is %.3f\n", length);
    }
}
