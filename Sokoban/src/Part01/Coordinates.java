package Part01;

import java.util.ArrayList;
import java.util.Arrays;

abstract public class Coordinates {
    private final ArrayList<Integer[]> coordinates = new ArrayList<>();

    protected Coordinates() {super();}

    protected void storeCoordinates (int x, int y) {
        coordinates.add(new Integer[] { x, y });
    }

    protected boolean containCoordinates(int x , int y) {
        boolean isContain = false;
        for (Integer[] e : coordinates) {
            if (Arrays.equals(e, new Integer[]{ x, y })) {
                isContain = true;
            }
        }

        return isContain;
    }

    protected Integer[] getCoordinates(int index) {
        return coordinates.get(index);
    }
}

class Box extends Coordinates {
    private final int x;
    private final int y;

    Box (int x, int y, GameField field) {
        this.x = x;
        this.y = y;
        field.setSpecificElementPosition(x, y, this);
    }
}

class Brick extends Coordinates {
    Brick(int x, int y) {
        super.storeCoordinates(x, y);
    }
}

class RedPoint extends Coordinates{
    RedPoint(int x, int y) {
        super.storeCoordinates(x, y);
    }
}

class FreeZone extends Coordinates{
    FreeZone(int x, int y) {
        super.storeCoordinates(x, y);
    }
}

