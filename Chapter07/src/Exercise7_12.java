import java.util.Arrays;
import java.util.Scanner;

public class Exercise7_12 {
    public static void main(String[] args) {

        // Reverse an arrays

        Scanner scanner = new Scanner(System.in);

        final int LIMIT = 10;
        double[] list = new double[LIMIT];

        System.out.print("Enter ten numbers: ");

        for (int i = 0; i < LIMIT; i++){
            list[i] = scanner.nextDouble();
        }

        reverse(list);

        System.out.println("The reverse form: " + Arrays.toString(list));
    }

    public static void reverse(double[] list){

        for (int i = 0, j = list.length - 1; i < j; i++, j--){

            double temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }
    }
}
