import java.util.Scanner;

public class N07 {
    public static void main(String[] args) {

            //   Analyzing Numbers

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int n = scanner.nextInt();

        double sum = 0;
        int count = 0;

        double[] numbers = new double[n];

        System.out.print("Enter the numbers: ");

        for (int i = 0; i < n; i++){
            numbers[i] = scanner.nextDouble();
            sum += numbers[i];
        }

        double average = sum / n;

        for (int i = 0; i < n; i++){
            if (numbers[i] > average){
                count++;
            }
        }

        System.out.printf("The average is %.1f%n The count of elements above average is %d%n", average, count);
    }
}
