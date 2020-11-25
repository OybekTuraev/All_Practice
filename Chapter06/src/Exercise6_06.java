import java.util.Scanner;

public class Exercise6_06 {
    public static void main(String[] args) {

        // Display patterns

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lines of the pattern: ");
        int num_lines = scanner.nextInt();

        displayPattern(num_lines);
    }

    public static void displayPattern(int num_lines){

        for (int i = 1; i <= num_lines; i++){

            for (int space = i; space < num_lines; space++){
                System.out.print("  ");
            }

            for (int j = i; j >= 1; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
