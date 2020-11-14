import java.util.Scanner;

public class Exercise4_11 {
    public  static void main(String[] args){

        // Decimal to hex

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal value (O to 15): ");
        int value = scanner.nextInt();

        // convert to char, Hint: A = 65; starting point for Uppercase Letters is to add 55 (65 - 10)

        if (value >= 10 && value <= 15){
            char ch = (char)(value + 55);
            System.out.println("The hex value is " + ch);
        }
        else if (value >= 0 && value < 10){
            System.out.println("The hex value is " + value);
        }
        else {
            System.out.println(value + " is an invalid input");
        }
    }
}
