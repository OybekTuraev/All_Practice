public class Exercise5_06 {
    public static void main(String[] args) {

       //Conversion from miles to kilometer

        final double MILE_TO_KM = 1.609;

        System.out.println("Miles     Kilometers   |   Kilometers     Miles");

        int k = 20;

        for (int m = 1; m <= 10; m++) {
            System.out.printf("%-9d %-12.3f | %4d %18.3f\n",m, (m * MILE_TO_KM), k, (k / MILE_TO_KM));

            k += 5;
        }
    }
}
