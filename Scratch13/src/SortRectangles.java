import Geometric.Rectangle;

import java.util.Arrays;

public class SortRectangles {
    public static void main(String[] args) {
        ComparableRectangle[] rectangles = {
                new ComparableRectangle(3.4, 5.2),
                new ComparableRectangle(3.4, 1.2),
                new ComparableRectangle(9.4, 5.2),
                new ComparableRectangle(3.8, 7.2)
        };

        Arrays.sort(rectangles);
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle + " ");
        }
    }
}
