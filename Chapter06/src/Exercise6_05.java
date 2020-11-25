import java.util.Scanner;

public class Exercise6_05 {
    public static void main(String[] args) {

        // Sort three numbers

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter 3rd number: ");
        int num3 = scanner.nextInt();

        displaySortedNumbers(num1, num2, num3);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3){

        double max1 = max(max(num1, num2), num3);
        double max2 = 0;
        double max3 = 0;

        if (max1 == num1){
            max2 = max(num2, num3);
            max3 = min(num2, num3);
        }
        else if (max1 == num2){
            max2 = max(num1, num3);
            max3 = min(num1, num3);

        }
        else {
            max1 = num3;
            max2 = max(num1, num2);
            max3 = min(num1, num2);
        }

        System.out.printf("The increasing order: %-4.0f%-4.0f%.0f%n", max3, max2, max1);
    }

    public static double max(double num1, double num2){
        if (num1 > num2){
            return num1;
        }
        else {
            return num2;
        }
    }

    public static double min(double num1, double num2){
        if (num1 < num2){
            return num1;
        }
        else {
            return num2;
        }
    }
}
