import java.util.Scanner;

public class Exercise3_05 {
    public static void main(String[] args){

        /**
         * Find future dates
         */

        Scanner scanner  = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int day_num = scanner.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int number = scanner.nextInt();

        int future_day = (number + day_num) % 7;

        switch (day_num){
            case 0:
                System.out.print("Today is Sunday"); break;
            case 1:
                System.out.print("Today is Monday"); break;
            case 2:
                System.out.print("Today is Tuesday"); break;
            case 3:
                System.out.print("Today is Wednesday"); break;
            case 4:
                System.out.print("Today is Thursday"); break;
            case 5:
                System.out.print("Today is Friday"); break;
            case 6:
                System.out.print("Today is Saturday");
        }

        switch (future_day){
            case 0:
                System.out.println(" and the future day is Sunday"); break;
            case 1:
                System.out.println(" and the future day is Monday"); break;
            case 2:
                System.out.println(" and the future day is Tuesday"); break;
            case 3:
                System.out.println(" and the future day is Wednesday"); break;
            case 4:
                System.out.println(" and the future day is Thursday"); break;
            case 5:
                System.out.println(" and the future day is Friday"); break;
            case 6:
                System.out.println(" and the future day is Saturday");
        }
    }
}
