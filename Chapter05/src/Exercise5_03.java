public class Exercise5_03 {
    public static void main(String[] args){

        // Conversion from kilograms to pounds      1kg = 2.2 pounds

        final double KI_TO_POUND = 2.2;

        System.out.println("Kilograms    Pounds");

        for (int k = 1; k < 200; k++){

            if (k % 2 != 0) {
                System.out.printf("%-13d%.1f\n", k, (KI_TO_POUND * k));
            }
        }
    }
}
