import java.math.BigDecimal;
import java.math.BigInteger;

public class LargeFactorial {
    public static void main(String[] args) {
        System.out.println("50! is \n" + factorial(50));

        // Experiment for divide(divisor, scale, roundingMode) method, BigDecimal
        BigDecimal a = new BigDecimal("456168413465488");
        BigDecimal b = new BigDecimal("2");
        BigDecimal c = a.divide(b, 20, BigDecimal.ROUND_UP);
        System.out.println(c);
    }

    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(new BigInteger(i + ""));
        }

        return result;
    }
}
