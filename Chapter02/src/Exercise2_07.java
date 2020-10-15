import java.util.Scanner;

public class Exercise2_07 {
    public static void main(String[] args){

        /**
         * Find the number of years
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        int minutes = scanner.nextInt();

        int days = minutes / (60 * 24);
        int years = days / 365;
        int remainingDays = days % 365;

        System.out.println(minutes + " minutes is " + years + " years and " + remainingDays + " days" );
    }
}
