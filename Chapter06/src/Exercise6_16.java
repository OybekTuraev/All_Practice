public class Exercise6_16 {
    public static void main(String[] args) {

        // Number of days in a year

        final int startingYear = 2000;

        numberOfDaysInAYear(startingYear);
    }

    public static void numberOfDaysInAYear(int startingYear){

        final int LAST_YEAR = 2020;
        final int DAYS_IN_REGULAR_YEAR = 365;
        final int DAYS_IN_LEAP_YEAR = 366;

        int totalDays = 0;

        for (int i = startingYear; i <= LAST_YEAR; i++){

            if (isLeapYear(i)){ // If true, by default it does true returning from the method
                totalDays += DAYS_IN_LEAP_YEAR;
            }
            else {
                totalDays += DAYS_IN_REGULAR_YEAR;
            }
        }

        System.out.println("Total days from " + startingYear + " to " + LAST_YEAR + ": " + totalDays);
    }

    public static boolean isLeapYear(int year){

        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0; // no need (?)
    }
}
