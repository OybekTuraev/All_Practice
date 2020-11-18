import java.util.Scanner;

public class Exercise5_01 {
    public  static void main(String[] args){

        // Count positive and negative numbers and compute the average of number

        int positive_count = 0;
        int negative_count = 0;
        double count = 0;
        double sum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer, the input ends if it is 0: ");
        int num = scanner.nextInt();

        while (num != 0){

            if (num > 0){
                positive_count++;
            }
            else {
                negative_count++;
            }

            sum += num;

            num = scanner.nextInt();

            count++;
        }

        if (num != 0) {
            System.out.println("The number of positives is " + positive_count);
            System.out.println("The number of negatives is " + negative_count);
            System.out.println("The total is " + sum);
            System.out.println("The average is " + (sum / count));
        }
        else {
            System.out.println("No numbers are entered except 0");
        }
    }
}
