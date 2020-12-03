import java.util.Arrays;

public class N18 {
    public static void main(String[] args) {

        // Calculator

        if (args.length != 3){
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }

        // args[0]-- first operand
        // args[1]-- operation
        // args[2]-- second operand

        int operationResult = 0;

        switch (args[1].charAt(0)){
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
}
