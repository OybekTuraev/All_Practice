import javax.security.auth.callback.CallbackHandler;
import java.util.Scanner;

public class Exercise4_15 {
    public  static void main(String[] args){

        // Phone key pads

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String letter = scanner.nextLine();
        char ch = letter.charAt(0);

        ch = Character.toLowerCase(ch);

        // going down step by step, since the numbers are in order and evaluated by their unicode

        int key = 0;

        if (ch >= 'w'){
            key = 9;
        }
        else if (ch >= 't'){
            key = 8;
        }
        else if (ch >= 'p'){
            key = 7;
        }
        else if (ch >= 'm'){
            key = 6;
        }
        else if (ch >= 'j'){
            key = 5;
        }
        else if (ch >= 'g'){
            key = 4;
        }
        else if (ch >= 'd'){
            key = 3;
        }
        else if (ch >= 'a'){
            key = 2;
        }
        else {
            System.out.printf("%c is an invalid input%n", ch);
            System.exit(1);
        }

        System.out.printf("The corresponding number is %d%n", key);
    }
}
