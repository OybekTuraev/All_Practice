import java.util.ArrayList;
import java.util.Scanner;

public class SubArraylist extends ArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter the numbers: to end enter 0: ");
        int number;
        while ((number = scanner.nextInt()) != 0) {
            list.add(number);
        }

        System.out.println("The largest number is " + max(list));
    }

    public static Integer max(ArrayList<Integer> list) {
        Integer max = list.get(0);

        if (list.size() == 0) {
            return null;
        }
        else {
            for (int i = 0; i < list.size(); i++) {
                if (max < list.get(i)) {
                    max = (list.get(i));
                }
            }
        }

        return max;
    }
}
