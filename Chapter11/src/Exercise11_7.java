import java.util.ArrayList;
import java.util.Collections;

public class Exercise11_7 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list.toString());
        shuffle(list);
        System.out.println(list.toString());
    }

    public static void shuffle(ArrayList<Integer> list) {
        Collections.shuffle(list);
    }
}
