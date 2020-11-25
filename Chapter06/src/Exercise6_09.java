public class Exercise6_09 {
    public static void main(String[] args) {

        // Conversions between feet and meters

        showTable();
    }

    public static void showTable(){

        System.out.println("Feet     Meters   |    Meters     Feet");
        System.out.println("--------------------------------------------");

        for (double feet = 1, meter = 20; feet <= 10; feet++, meter += 5){
            System.out.printf("%-9.1f%-9.3f|", feet, footToMeter(feet));
            System.out.printf("%8.1f%13.3f", meter, MeterToFoot(meter));
            System.out.println();
        }
    }

    public static double footToMeter(double foot){
        double meter = 0;
        meter = 0.305 * foot;
        return meter;
    }

    public static double MeterToFoot(double meter){
        double foot = 0;
        foot = 3.279 * meter;
        return foot;
    }
}
