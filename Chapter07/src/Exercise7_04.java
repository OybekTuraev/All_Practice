import java.util.Scanner;

public class Exercise7_04 {
    public static void main(String[] args) {

        // Analyze Scores

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numbers: ");

        final int MAX_VALUE = 100;
        int[] scores = new int[100];
        double average = 0;
        double sum = 0;
        int count = 0;
        int number;

        for (int i = 0; i < MAX_VALUE; i++){

            number = scanner.nextInt();

            if (number < 0){
                break;
            }

            scores[i] = number;
            sum += number;
            count++;
        }

        average = sum / count;

        int aboveEqual = 0;
        int belowAverage = 0;

        for (int i = 0; i < count; i++){
            if (scores[i] >= average){
                aboveEqual++;
            }
            else {
                belowAverage++;
            }
        }

        System.out.println("Average score is " + average);
        System.out.println("Number of scores above or equal to average score: " + aboveEqual);
        System.out.println("Number of scores below average score: " + belowAverage);
    }
}
