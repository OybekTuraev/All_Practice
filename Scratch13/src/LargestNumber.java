import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class LargestNumber {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(52);
        list.add(254.32);
        list.add(new BigInteger("72568486435683843464"));
        list.add(new BigDecimal("7.2568486435683843464"));

        System.out.println("The largest number is " + getLargestNumber(list));
    }

    public static Number getLargestNumber(ArrayList<Number> list) {
        if (list == null || list.size() == 0) {
            return null;
        }

        Number number = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (number.doubleValue() < list.get(i).doubleValue()) {
                number = list.get(i);
            }
        }

        return number;
    }
}
