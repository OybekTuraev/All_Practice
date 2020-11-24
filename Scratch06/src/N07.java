import java.util.Scanner;

public class N07 {
    public static void main(String[] args) {

        // Hex to Decimal

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a hex number: ");
        String hex = scanner.nextLine();

        System.out.println("The decimal value for the hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
    }

    public static int hexToDecimal(String hex){

        int decimalValue = 0;

        for (int i = 0; i < hex.length(); i++){
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }

        return decimalValue;
    }

    public static int hexCharToDecimal(char ch){

        if (ch >= 'A' && ch <= 'F'){
            return (10 + ch - 'A');
        }
        else { // ch for 0 and 9
            return ch - '0';
        }
    }
}
