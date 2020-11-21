import java.util.Scanner;

public class Exercise5_17 {
    public static void main(String[] args) {

        // Display Pyramid

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int num_of_lines = scanner.nextInt();

        int count = 1;
        int num = 1;

        while (count <= num_of_lines){

            // one space left because we need it for the 1

            for (int space = num_of_lines - count; space >= 1; space--){
                System.out.print("  ");
            }

            for (int left = count; left >= 2; left--){
                System.out.print(left + " ");
            }

            for (int right = 1; right <= count; right++){
                System.out.print(right + " ");
            }

            System.out.println();

            count++;
        }
    }
}
