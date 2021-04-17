public class CalculateWithoutException {
    public static void main(String[] args) {

        // Calculator
        if (args.length != 3){
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }

        check(args[0]);
        check(args[2]);

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

    public static void check(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!Character.isDigit(ch)) {
                System.out.println("Wrong input: " + s);
                System.exit(0);
            }
        }
    }
}
