package exercise12_01;

public class CalculatorWithException {
    public static void main(String[] args) {

        // Calculator
        if (args.length != 3){
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(1);
        }

        int operationResult = 0;

        try {
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
        }
        catch (java.lang.NumberFormatException ex) {
            System.out.println("Wrong Input: >> "
                    + ex.getMessage().substring(ex.getMessage().indexOf("\"") + 1,
                    ex.getMessage().lastIndexOf("\"")));
        }

        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + operationResult);
    }
}
