package exercise12_01;

public class CalculatorWithoutException {
    public static void main(String[] args) {

        // Calculator
        if (args.length != 3){
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }

        if (!(check(args[0]) || check(args[2]))) {
            System.out.println("Wrong input :(");
            System.exit(0);
        }

        int operationResult = 0;

        switch (args[1].charAt(0)) {
            case '+':
                operationResult = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                break;
            case '-':
                operationResult = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                break;
            case '.':
                operationResult = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                break;
            case '/':
                operationResult = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
                break;
        }

        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + operationResult);
    }

    public static boolean check(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!Character.isDigit(ch)) {
                return false;
            }
        }

        return true;
    }
}
