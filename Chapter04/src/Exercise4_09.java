import java.util.Scanner;

public class Exercise4_09 {
    public static void main(String[] args) {

        // Find the Unicode of a character

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        String ch = scanner.next();
        char s = ch.charAt(0);
        System.out.println(s);

        System.out.printf("The Unicode for the character %s is %d", s, (int)s);
    }
}
