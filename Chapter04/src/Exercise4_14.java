import java.util.Scanner;

public class Exercise4_14 {
    public static void main(String[] args) {

        // Convert letter grade to number

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        String grade = scanner.nextLine();
        char ch = grade.charAt(0);

        int grade_n = 0;

        if (Character.isLetter(ch)){
            switch (ch){
                case 'A':
                    grade_n = 4;
                    break;
                case 'B':
                    grade_n = 3;
                    break;
                case 'C':
                    grade_n = 2;
                    break;
                case 'D':
                    grade_n = 1;
                    break;
                case 'F':
                    grade_n = 0;
                    break;
                default:
                    System.out.printf("%c is an invalid grade%n", ch);
                    System.exit(1);
            }
        }
        else {
            System.out.println("Invalid");
            System.exit(1);
        }

        System.out.printf("The numeric value for %c is %d%n", ch, grade_n);
    }
}
