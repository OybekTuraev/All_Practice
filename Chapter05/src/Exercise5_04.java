public class Exercise5_04 {
    public static void main(String[] args){

        // Conversion from miles to kilometers  1 mile = 1.609 kilometers

        final double MILE_TO_KM = 1.609;

        System.out.println("Miles        Kilometers");

        for (int m = 1; m <= 10; m++) {
            System.out.printf("%-13d%.3f\n", m, (MILE_TO_KM * m));
        }


















    }
}
