import java.util.Scanner;

public class N18 {
    public static void main(String[] args){

        // Converting Decimals to Hexadecimals

       Scanner scanner = new Scanner(System.in);

       System.out.print("Enter a decimal: ");
       int decimal = scanner.nextInt();

       String hex = ""; // because hex digit will be in this form


       int count = 0;

       while (decimal != 0){
           int hex_value = decimal % 16;

           char hex_digit = (hex_value >= 0 && hex_value <= 9) ?
                   (char)(hex_value + '0') : (char)(hex_value - 10 + 'A');
           // -10, exactly gives what we want to get the letters after A = 65,

           hex = hex_digit + hex; // Now concatenating char with string

           decimal = decimal / 16; // remove the hex digit from the number
           count++;
       }

        System.out.println("The hex number is " + hex + " times: " + count);
    }
}
