import java.util.Scanner;

public class PalindromeNew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Prompt the user
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        //Display the result
        System.out.println("ignoring nonalphanumeric characters, \nis " + s + " a palindrome? " +
                isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        // Create a new String by eliminating nonalphanumeric chars
        String s1 = filter(s);

        //Create a new String that is the reversal of s1
        String s2 = reverse(s1);

        //Check if the reversal is matching with the original one
        return s2.equals(s1);
    }

    public static String filter(String s) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                stringBuilder.append(s.charAt(i));
            }
        }

        return stringBuilder.toString();
    }

    public static String reverse(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
