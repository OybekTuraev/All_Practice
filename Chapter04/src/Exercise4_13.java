import java.util.Scanner;

public class Exercise4_13 {
    public static void main(String[] args){

        // Vowel or consonant?

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String answer = scanner.nextLine();
        char ch = answer.charAt(0);

        if (Character.isLetter(ch)){
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' ||
                    ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U' || ch == 'y' || ch == 'Y'){
                System.out.printf("%c is a vowel%n", ch);
            }
            else {
                System.out.printf("%c is a consonant%n", ch);
            }
        }
        else {
            System.out.printf("%c is a an invalid input%n", ch);
        }
    }
}
