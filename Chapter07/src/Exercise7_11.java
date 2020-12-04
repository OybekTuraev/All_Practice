import java.util.Scanner;

public class Exercise7_11 {
    public static void main(String[] args) {

        // Statistics, compute deviation

        Scanner scanner = new Scanner(System.in);

        final int LIMIT = 10;
        double[] numbers = new double[LIMIT];

        System.out.print("Enter ten numbers: ");

        for (int i = 0; i < LIMIT; i++){
            numbers[i] = scanner.nextDouble();
        }

        System.out.printf("The mean is: %.2f%n", mean(numbers));
        System.out.printf("The standard deviation is: %.5f%n", deviation(numbers));
    }

    public static double deviation(double[] numbers){

        double numerator = 0;
        double deviation = 0;

        for (double elements : numbers){
            numerator += Math.pow((elements - mean(numbers)), 2);
        }

        deviation = Math.sqrt(numerator / (numbers.length - 1));

        return deviation;
    }

    public static double mean(double[] numbers){

        double sum = 0;
        for (double elements : numbers){

            sum += elements;
        }

        return (sum / numbers.length);
    }
}
