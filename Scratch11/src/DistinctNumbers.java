import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the integer(input ends with 0): ");
        int value;

        do {
            value = scanner.nextInt();
            if (!(list.contains(value)) && value != 0) {
                list.add(value);
            }
        } while (value != 0);


        for (Integer e : list) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
}
