import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UsefulMethods {
    public static void main(String[] args) {
        Integer[] numbers = {1, 3, 6, 3, 4, 4, 9};
        System.out.print("Array: ");
        for (Integer e : numbers) {
            System.out.print(e + " ");
        }
        System.out.println();

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(numbers));
        System.out.println("From Array to ArrayList: " + list);

        Collections.sort(list);
        System.out.println("After Sorting: " + list);

        Integer[] newArray = new Integer[list.size()];
        list.toArray(newArray);
        System.out.print("From ArrayList to Array: ");
        for (Integer e : newArray) {
            System.out.print(e + " ");
        }
        System.out.println();

        System.out.println("Maximum of the list: " + Collections.max(list));
        System.out.println("Minimum of the list: " + Collections.min(list));


        Collections.shuffle(list);
        System.out.println("After Shuffling: " + list);
    }
}
