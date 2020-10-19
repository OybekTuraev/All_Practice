import java.util.Scanner;

public class Exercise3_30 {
    public static void main(String[] args){

        /**
         * Current time
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");
        int offset = scanner.nextInt();


        long total_milli_seconds = System.currentTimeMillis();

        long total_seconds = total_milli_seconds / 1000;
        long current_seconds = total_seconds % 60;
        long total_minutes = total_seconds / 60;
        long current_minutes = total_minutes % 60;
        long total_hours = total_minutes / 60;
        long current_hours = (total_hours + offset) % 24;
        long temp = current_hours;

        if (current_hours > 12){
            current_hours -= 12;
            System.out.println("The current time is " + current_hours + ":" +
                    current_minutes + ":" + current_seconds + " PM" );
        }
        else {
            System.out.println("The current time is " + temp + ":" +
                    current_minutes + ":" + current_seconds + " AM" );
        }
    }
}
