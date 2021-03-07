import javafx.scene.shape.Circle;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {

        ArrayList<String> cityList = new ArrayList<>();
        cityList.add("London");
        cityList.add("Denver");
        cityList.add("Miami");
        cityList.add("Paris");
        cityList.add("Seoul");
        cityList.add("Tokyo");

        System.out.println("List Size? " + cityList.size());
        System.out.println("Is Miami on the list? " + cityList.contains("Miami"));
        System.out.println("The location of Denver in the list? " + cityList.indexOf("Denver"));
        System.out.println("Is the list empty? " + cityList.isEmpty());

        cityList.add(2, "Tashkent");
        cityList.remove("Paris");
        cityList.remove(1);
        System.out.println(cityList.toString());

        for (int i = cityList.size() - 1; i >= 0; i--) {
            System.out.print(cityList.get(i) + " ");
        }
        System.out.println();

        ArrayList<Circle> list = new ArrayList<>();
        list.add(new Circle(2));
        list.add(new Circle(5));

        System.out.println("The are of the circle? " + list.get(0).getId());
    }
}
