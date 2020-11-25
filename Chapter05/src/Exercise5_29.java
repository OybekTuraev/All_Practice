import java.util.Scanner;

public class Exercise5_29 {
    public static void main(String[] args) {

        // Display Calendars

        final int NUM_OF_MONTHS = 12;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        System.out.print("Enter the first day of the month: ");
        int day = scanner.nextInt();

        int days_in_month = 0;

        for (int month = 1; month <= NUM_OF_MONTHS; month++){

            System.out.print("          ");

            switch (month){
                case 1:
                    System.out.print("January " + year);
                    days_in_month = 31;
                    break;
                case 2:
                    System.out.print("February " + year);
                    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                        days_in_month = 29;
                    }
                    else {
                        days_in_month = 28;
                    }
                    break;
                case 3:
                    System.out.print("March " + year);
                    days_in_month = 31;
                    break;
                case 4:
                    System.out.print("April " + year);
                    days_in_month = 30;
                    break;
                case 5:
                    System.out.print("May " + year);
                    days_in_month = 31;
                    break;
                case 6:
                    System.out.print("June " + year);
                    days_in_month = 30;
                    break;
                case 7:
                    System.out.print("July " + year);
                    days_in_month = 31;
                    break;
                case 8:
                    System.out.print("August " + year);
                    days_in_month = 31;
                    break;
                case 9:
                    System.out.print("September " + year);
                    days_in_month = 30;
                    break;
                case 10:
                    System.out.print("October " + year);
                    days_in_month = 31;
                    break;
                case 11:
                    System.out.print("November " + year);
                    days_in_month = 30;
                    break;
                case 12:
                    System.out.print("December " + year);
                    days_in_month = 31;
                    break;
            }

            System.out.println("\n---------------------------------");

            System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

            for (int i = 0; i < day; i++){ // for space
                System.out.print("    ");
            }

            for (int i = 1; i <= days_in_month; i++){

                if (i < 10){
                    System.out.print("   " + i);
                }
                else {
                    System.out.print("  " + i);
                }

                if ((i + day) % 7 == 0){
                    System.out.println();
                }
            }

            System.out.println();

            day = (days_in_month + day) % 7;
        }
    }
}
