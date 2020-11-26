public class Exercise6_11 {
    public static void main(String[] args) {

       //   Financial Application: compute commissions

        computeCommission(10000);
    }

    public static void computeCommission(double salesAmount){

        System.out.println("Sales Amount       Commission ");
        System.out.println("--------------------------------");

        for (double i = salesAmount; i <= 100000; i += 5000){

            double commission = commission(i);
            System.out.printf("%-20.0f%.1f", i, commission);
            System.out.println();
        }


    }

    public static double commission(double amount){

        double eightPercentAmount = 5000 * 0.08;
        amount -= 5000;
        double tenPercentAmount = 5000 * 0.1;
        amount -= 5000;
        double twelvePercentAmount = amount * 0.12;

        double commission = eightPercentAmount + tenPercentAmount + twelvePercentAmount;

        return commission;
    }
}
