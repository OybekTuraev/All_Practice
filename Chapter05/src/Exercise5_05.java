public class Exercise5_05 {
    public static void main(String[] args){

        // Conversion from kilograms to pounds and pounds to kilograms

        final double POUND_TO_KI = 2.2;

        System.out.println("Kilograms     Pounds |  Pounds     Kilograms");

        int pound = 20;

        for (int k = 1; k < 200; k += 2) {
            System.out.printf("%-15d %4.1f | %3d %13.2f\n", k, (k * POUND_TO_KI), pound, (pound / POUND_TO_KI));

            pound += 5;
        }
    }
}
