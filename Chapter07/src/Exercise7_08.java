import java.util.Scanner;

public class Exercise7_08 {
    public static void main(String[] args) {

        // Average an array

        int numLimits = 10;
        double[] inputs = new double[numLimits];

        System.out.println("Average is " + average(inputs));
    }

    public static double average(double[] array){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ten numbers: ");

        double sum = 0;

        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextDouble();
            sum += array[i];
        }

        return (sum / array.length);
    }
}
