import java.util.Scanner;

public class Exercise3_21 {
    public static void main(String[] args){

        /**
         *  Comprehensive: Science: day of the week
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year (e.g 2012): ");
        int year = scanner.nextInt();
        System.out.print("Enter month: 1-12: ");
        int m_month = scanner.nextInt();

        if (m_month == 1){
            m_month = 13;
            year -= 1;
        }
        else if (m_month == 2){
            m_month = 14;
            year -= 1;
        }

        System.out.print("Enter the day of the month: 1-31: ");
        int q_day = scanner.nextInt();

        int j_cen = year / 100;
        int k_ye_cen = year % 100;

        int part1 = (q_day + (26 * (m_month + 1) / 10) + k_ye_cen + k_ye_cen / 4 + j_cen / 4 + 5 * j_cen);

        int h_day_week = part1 % 7;

        switch (h_day_week){
            case 0:
                System.out.println("Day of the week is Saturday");
                break;
            case 1:
                System.out.println("Day of the week is Sunday");
                break;
            case 2:
                System.out.println("Day of the week is Monday");
                break;
            case 3:
                System.out.println("Day of the week is Tuesday");
                break;
            case 4:
                System.out.println("Day of the week is Wednesday");
                break;
            case 5:
                System.out.println("Day of the week is Thursday");
                break;
            case 6:
                System.out.println("Day of the week is Friday");
        }
    }
}
