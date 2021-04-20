import java.math.BigInteger;
import java.util.Arrays;

public class SortComparableObjects {
    public static void main(String[] args) {
        String[] cities = {"London", "Manhattan", "Long Island", "Paris", "Morocco"};
        Arrays.sort(cities);

        for (String city : cities) {
            System.out.print(city + " ");
        }
        System.out.println();

        BigInteger[] hugeNumbers = {new BigInteger("25284358451548"),
                                    new BigInteger("25284358451548"),
                                    new BigInteger("25284358451548")};

        Arrays.sort(hugeNumbers);
        for (BigInteger bigInteger : hugeNumbers) {
            System.out.print(bigInteger + " ");
        }
        System.out.println();
    }
}
