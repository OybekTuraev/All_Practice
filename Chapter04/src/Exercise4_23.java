import java.util.Scanner;

public class Exercise4_23 {
    public static void main(String[] args){

        // Financial application: payroll

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        double num_hours = scanner.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double pay_hours = scanner.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double f_withholding = scanner.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double s_withholding = scanner.nextDouble();

        double gross_pay = num_hours * pay_hours;
        double f_rate = gross_pay * f_withholding;
        double s_rate = gross_pay * s_withholding;
        double total_ded = f_rate + s_rate;
        double net_pay = gross_pay - total_ded;

        double percent_rate1 = f_withholding * 100;
        double percent_rate2 = s_withholding * 100;

        System.out.printf("%nEmployee Name: %s%n", name);
        System.out.printf("Hours Worked: %.2f%n", num_hours);
        System.out.printf("Pay Rate: $%.2f%n", pay_hours);
        System.out.printf("Gross Pay: $%.2f%n", gross_pay);
        System.out.printf("Deductions:%n" +
                "          Federal Withholding(%.1f%%): $%.2f%n" +
                "          State Withholding(%.1f%%): $%.2f%n" +
                "          Total Deduction: $%.2f%n", percent_rate1, f_rate, percent_rate2, s_rate, total_ded);
        System.out.printf("Net Pay: $%.2f%n", net_pay);
    }
}
