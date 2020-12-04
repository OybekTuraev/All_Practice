import java.util.Scanner;

public class Exercise7_09 {
    public static void main(String[] args) {

        // Find the smallest element

        Scanner scanner = new Scanner(System.in);

        final int LIMIT = 10;
        double[] inputs = new double[LIMIT];

        System.out.print("Enter ten numbers: ");

        for (int i = 0; i < LIMIT; i++){
            inputs[i] = scanner.nextDouble();
        }

        System.out.printf("The minimum number is: %.1f%n", min(inputs));
    }

    public static double min(double[] array){

        double minNumber = array[0];

        for (int i = 0; i < array.length; i++){
            if (array[i] < minNumber){
                minNumber = array[i];
            }
        }

        return minNumber;
    }
}
