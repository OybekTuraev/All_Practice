import java.util.Scanner;

public class Exercise7_05 {
    public static void main(String[] args) {

        // Print distinct Numbers

        Scanner scanner = new Scanner(System.in);

        int[] distinctNumbers = new int[10];
        int number;
        int count = 0;

        System.out.print("Enter ten numbers: ");

        for (int i = 0; i < 10; i++){
            number = scanner.nextInt();

            if (checkDistinct(number, distinctNumbers)){
                distinctNumbers[count] = number;
                count++;
            }
        }

        System.out.println("The number of distinct numbers is " + count);
        System.out.print("The distinct numbers are: ");

        for (int numbers : distinctNumbers){
            if (numbers > 0){

                System.out.print("" + numbers + " ");
            }
        }
        System.out.println();
    }

    public static boolean checkDistinct(int number, int[] distinctNumbers){

        for (int i = 0; i < distinctNumbers.length; i++){

            if (number == distinctNumbers[i]){
                return false;
            }
        }

        return true;
    }
}
