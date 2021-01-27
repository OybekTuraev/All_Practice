import java.util.Date;

public class Exercise9_03 {
    public static void main(String[] args) {

        // Use the Date Class
        Date object = new Date();

        // e11 = 10^11, scientific notation
        for (long i = 10000; i <= 1e11; i *= 10) {
            object.setTime(i);
            System.out.println("\nElapsed time and Current Date " + i + ">>>" + object.toString());
        }
    }
}