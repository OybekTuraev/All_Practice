import java.util.Scanner;

public class Exercise4_20 {
    public static void main(String[] args){

        // Process a string

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String input = scanner.nextLine();

        System.out.println(input.length() + " is length and first character is " + input.charAt(0));
    }
}
