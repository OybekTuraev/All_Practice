import java.util.Scanner;

public class N05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December"};

        System.out.print("Enter the month (1; 12): ");
        int monthNumber = scanner.nextInt();

        System.out.println("The month name is " + months[monthNumber - 1]);
    }
}
