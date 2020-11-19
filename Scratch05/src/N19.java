import java.util.Scanner;

public class N19 {
    public static void main(String[] args) {

        // Checking Palindromes

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        int low = 0; // first index

        int high = s.length() - 1; // subtracting -1, because in char 0 is the first character,
        // Oybek, length 5  but not 5th character, 0,1,2,3,4 that's why -1 gives the last characterif

        boolean isPalindrome = true;

        while (low < high){
            if (s.charAt(low) != s.charAt(high)){
                isPalindrome = false;
                break;
            }

            low++;
            high--;
        }

        if (isPalindrome){ // it means true after breaking,
            System.out.println(s+ " is a palindrome");
        }
        else {
            System.out.println(s+ " is not a palindrome");
        }
    }
}
