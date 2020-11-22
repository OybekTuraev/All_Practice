import java.util.Scanner;

public class Exercise5_28 {
    public static void main(String[] args) {

        // Display the first days of each month

        final int NUM_OF_MONTHS = 12;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        System.out.print("Enter the day number for the first day of the year: ");
        int day = scanner.nextInt();

        for (int month = 1; month <= NUM_OF_MONTHS; month++){

            switch (month){
                case 1:
                    System.out.print("January");
                    break;
                case 2:
                    System.out.print("February");
                    break;
                case 3:
                    System.out.print("March");
                    break;
                case 4:
                    System.out.print("April");
                    break;
                case 5:
                    System.out.print("May");
                    break;
                case 6:
                    System.out.print("June");
                    break;
                case 7:
                    System.out.print("July");
                    break;
                case 8:
                    System.out.print("August");
                    break;
                case 9:
                    System.out.print("September");
                    break;
                case 10:
                    System.out.print("October");
                    break;
                case 11:
                    System.out.print("November");
                    break;
                case 12:
                    System.out.print("December");
                    break;
            }

            System.out.print(" 1, " + year + " is ");

            day %= 7;

            switch (day){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 0:
                    System.out.println("Sunday");
                    break;
            }

            switch (month){ // We need to add the days to find the future day
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    day += 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    day += 30;
                    break;
                case 2:
                    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                        day += 29;
                    }
                    else {
                        day += 28;
                    }
                    break;
            }
        }
    }
}
