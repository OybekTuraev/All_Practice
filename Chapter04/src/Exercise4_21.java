import java.util.Scanner;

public class Exercise4_21 {
    public static void main(String[] args){

        // Check SSN

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a SSN: ");
        String input = scanner.nextLine();

        int k = input.indexOf("-");
        int k1 = input.lastIndexOf("-");

        int first_part = input.substring(0, k).length();
        int second_part = input.substring(k + 1, k1).length();
        int third_part = input.substring(k1 + 1).length();

        if (first_part != 3 || second_part != 2 || third_part != 4){
            System.out.printf("%s is an invalid social security number%n", input);
        }
        else {
            System.out.printf("%s is a valid social security number%n", input);
        }
    }
}
