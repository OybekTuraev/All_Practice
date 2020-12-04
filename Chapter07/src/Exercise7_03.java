import java.util.Scanner;

public class Exercise7_03 {
    public static void main(String[] args) {

       // Count occurrence of numbers

        int[] counts = new int[100];

        System.out.print("Enter the integers between 1 and 100: ");

        doCounts(counts);

        for (int i = 0; i < counts.length; i++){

            if (counts[i] > 0){

                // i+1, order from 1 to 100
                System.out.println((i + 1) + " occurs " + counts[i] + ((counts[i] > 1) ? " times" : " time"));
            }
        }
    }

    public static void doCounts(int[] counts){

        Scanner scanner = new Scanner(System.in);

        int number;

        do {
            number = scanner.nextInt();
            if (number >= 1 && number <= 100){
                counts[number - 1]++;
            }
        } while (number != 0);
    }
}
