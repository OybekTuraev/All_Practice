import java.util.Arrays;
import java.util.Scanner;

public class Exercise7_15 {
    public static void main(String[] args) {

        // Eliminate Duplicates

        final int LIMIT = 10;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ten numbers: ");
        int[] numbers = new int[LIMIT];

        for (int i = 0; i < LIMIT; i++){
            numbers[i] = scanner.nextInt();
        }

        int[] newList = eliminateDuplicates(numbers);

        System.out.println(Arrays.toString(newList));
    }

    public static int[] eliminateDuplicates(int[] numbers){

        int[] newList = new int[numbers.length];
        int index = 0;

        for (int element: numbers){

            if (checkDuplicateInNewList(newList, element) == -1){
                newList[index] = element;
                index++;
            }
        }

        return newList;
    }

    public static int checkDuplicateInNewList(int[] numbers, int key){

        // it returns index if finds otherwise -1
        for (int i = 0; i < numbers.length; i++){

            if (key == numbers[i]){
                return i;
            }
        }

        return -1;
    }
}
