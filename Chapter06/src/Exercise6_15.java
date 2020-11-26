import java.util.Scanner;

public class Exercise6_15 {
    public static void main(String[] args) {

        // Financial Application: print a tax table

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number between 0 and 4: ");
        int status = scanner.nextInt();
        System.out.print("Enter your income: ");
        double startingIncome = scanner.nextDouble();

        System.out.println("\n");
        System.out.println("Taxable     Single    Married Joint     Married       Head of");
        System.out.println("Income                Or Qualifying     Separate      a House");
        System.out.println("                      Widow(er)");
        System.out.println("-------------------------------------------------------------------");

        computeTax(status, startingIncome);
    }

    public static void computeTax(int status, double taxableIncome){

        final int LAST_VALUE = 60000;

        for (double i = taxableIncome; i <= LAST_VALUE; i += 50){
            System.out.printf("%-13.0f%-13.0f%-15.0f%-13.0f%.0f",
              i, single(i), marriedJoint(i), marriedSeparate(i), headOfHouse(i));
            System.out.println();
        }
    }

    public static double single(double income){

        double tax = 0;

        if (income >= 0 && income <= 8350){
            tax = income * 0.1;
        }
        else if (income > 8350 && income <= 33950){
            tax = 8350 * 0.1 + (income - 8350) * 0.15;
        }
        else if (income > 33950 && income <= 82250){
            tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
        }
        else if (income > 82250 && income <= 171550){
            tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
        }
        else if (income > 171550 && income <= 372950){
            tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 +
                    (171550 - 82250) * 0.28 + (income - 171550) * 0.33;
        }
        else {
            tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 +
                    (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
        }

        return tax;
    }

    public static double marriedJoint(double income){

        double tax = 0;

        if (income >= 0 && income <= 16700){
            tax = income * 0.1;
        }
        else if (income > 16700 && income <= 67900){
            tax = 16700 * 0.1 + (income - 16700) * 0.15;
        }
        else if (income > 67900 && income <= 137050){
            tax = 16700 * 0.1 + (67900 - 16700) * 0.15 + (income - 67900) * 0.25;
        }
        else if (income > 137050 && income <= 208850){
            tax = 16700 * 0.1 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (income - 137050) * 0.28;
        }
        else if (income > 208850 && income <= 372950){
            tax = 16700 * 0.1 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 +
                    (208850 - 137050) * 0.28 + (income - 208850) * 0.33;
        }
        else {
            tax = 16700 * 0.1 + (67900 - 167000) * 0.15 + (137050 - 67900) * 0.25 +
                    (208850 - 137050) * 0.28 + (372950 - 208850) * 0.33 + (income - 372950) * 0.35;
        }

        return tax;
    }

    public static double marriedSeparate(double income){

        double tax = 0;

        if (income >= 0 && income <= 8350){
            tax = income * 0.1;
        }
        else if (income > 8350 && income <= 33950){
            tax = 8350 * 0.1 + (income - 8350) * 0.15;
        }
        else if (income > 33950 && income <= 68525){
            tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
        }
        else if (income > 68525 && income <= 104425){
            tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (income - 68525) * 0.28;
        }
        else if (income > 104425 && income <= 186475){
            tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 +
                    (104425 - 68525) * 0.28 + (income - 104425) * 0.33;
        }
        else {
            tax = 8350 * 0.1 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 +
                    (104425 - 68525) * 0.28 + (186475 - 104425) * 0.33 + (income - 186475) * 0.35;
        }

        return tax;
    }

    public static double headOfHouse(double income){

        double tax = 0;

        if (income >= 0 && income <= 11950){
            tax = income * 0.1;
        }
        else if (income > 11950 && income <= 45500){
            tax = 11950 * 0.1 + (income - 11950) * 0.15;
        }
        else if (income > 45500 && income <= 117450){
            tax = 11950 * 0.1 + (45500 - 11950) * 0.15 + (income - 45500) * 0.25;
        }
        else if (income > 117450 && income <= 190200){
            tax = 11950 * 0.1 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (income - 117450) * 0.28;
        }
        else if (income > 190200 && income <= 372950){
            tax = 11950 * 0.1 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 +
                    (190200 - 117450) * 0.28 + (income - 190200) * 0.33;
        }
        else {
            tax = 11950 * 0.1 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 +
                    (190200 - 117450) * 0.28 + (372950 - 190200) * 0.33 + (income - 372950) * 0.35;
        }

        return tax;
    }
}
