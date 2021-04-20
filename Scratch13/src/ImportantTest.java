import java.util.ArrayList;

public class ImportantTest {
    public static void main(String[] args) {
        ArrayList<Double> list1 = new ArrayList<>();
        list1.add(1.5);
        list1.add(2.5);
        list1.add(3.5);

        ArrayList<Double> list2 = list1;
        ArrayList<Double> list3 = (ArrayList<Double>) list1.clone();
        list3.add(5.9);
        list2.remove(1.5);
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println("list3: " + list3);
    }
}
