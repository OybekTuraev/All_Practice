import java.util.ArrayList;
import java.util.Collections;

public class Quiz1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Dallas");
        list.add("Dallas");
        list.add("Houston");
        list.add("Dallas");

        for (int i = 0; i < list.size(); i++) {
            list.removeAll(Collections.singleton("Dallas"));
        }

        System.out.println(list.toString());
    }
}
