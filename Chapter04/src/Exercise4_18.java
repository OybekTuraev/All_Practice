import java.util.Scanner;

public class Exercise4_18 {
    public static void main(String[] args){

        // Student major and status

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two characters: ");
        String input = scanner.nextLine();

        char ch1 = input.charAt(0);
        char ch2 = input.charAt(1);

        String status = "";

        switch (ch1){
            case 'M':
                if (ch2 == '1'){
                    status = "Freshmen";
                }
                else if (ch2 == '2'){
                    status = "Sophomore";
                }
                else if (ch2 == '3'){
                    status = "Junior";
                }
                else if (ch2 == '4'){
                    status = "Senior";
                }
                System.out.printf("Mathematics %s%n", status);
                break;
            case 'C':
                if (ch2 == '1'){
                    status = "Freshmen";
                }
                else if (ch2 == '2'){
                    status = "Sophomore";
                }
                else if (ch2 == '3'){
                    status = "Junior";
                }
                else if (ch2 == '4'){
                    status = "Senior";
                }
                System.out.printf("Computer Science %s%n", status);
                break;
            case 'I':
                if (ch2 == '1'){
                    status = "Freshmen";
                }
                else if (ch2 == '2'){
                    status = "Sophomore";
                }
                else if (ch2 == '3'){
                    status = "Junior";
                }
                else if (ch2 == '4'){
                    status = "Senior";
                }
                System.out.printf("Information Technology %s%n", status);
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
