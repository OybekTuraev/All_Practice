import java.util.Scanner;

public class Problem2_7 {
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

        System.out.println(minutes + " minutes is " + years + " years " + remainingDays + " days" );
    }
}
