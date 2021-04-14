import Geometric.Circle;
import Geometric.Rectangle;

import java.util.ArrayList;
import java.util.Date;

public class Exercise11_6 {
    public static void main(String[] args) {
        ArrayList<Object> obj = new ArrayList<>();
        obj.add(new Date());
        obj.add(new Rectangle());
        obj.add(new String("String class"));
        obj.add(new Circle());

        for (int i = 0; i < obj.size(); i++) {
            System.out.println(obj.get(i).toString());
        }
    }
}
