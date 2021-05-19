package Part01;

public class Player {
    private int x, y;
    private GameField field;
    private Box box;

    Player(int x, int y, GameField field) {
        this.field = field;
        this.x = x;
        this.y = y;
    }

    // Setting coordinates
    void setCoordinates(int x, int y) {
        field.setSpecificElementPosition(x, y, this);
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    void moveLeft() {
        int nextX = x - 1;
        if (!(field.getSpecificElementPosition(nextX, y) instanceof Brick) &&
                !(field.getSpecificElementPosition(nextX, y) instanceof Box)) {
            x = nextX;
        }

        if (field.getSpecificElementPosition(nextX, y) instanceof Box &&
                !(field.getSpecificElementPosition(nextX - 1, y) instanceof Brick)) {

            field.setPreviousBoxCoordinatesToFree(x, y, box);

            if (field.getSpecificElementPosition(nextX - 1, y) instanceof RedPoint) {
                field.setGotoNextLevel(true);
            }
            box = new Box(nextX - 1, y, field);
        }
    }

    void moveRight() {
        int nextX = x + 1;
        if (!(field.getSpecificElementPosition(nextX, y) instanceof Brick)) {
            x = nextX;
        }

        if (field.getSpecificElementPosition(nextX, y) instanceof Box &&
                !(field.getSpecificElementPosition(nextX + 1, y) instanceof Brick)) {

            field.setPreviousBoxCoordinatesToFree(x, y, box);

            if (field.getSpecificElementPosition(nextX + 1, y) instanceof RedPoint) {
                field.setGotoNextLevel(true);
            }
            box = new Box(nextX + 1, y, field);
        }
    }

    void moveUp() {
        int nextY = y - 1;
        if (!(field.getSpecificElementPosition(x, nextY) instanceof Brick)) {
            y = nextY;
        }

        if (field.getSpecificElementPosition(x, nextY) instanceof Box &&
                !(field.getSpecificElementPosition(x, nextY - 1) instanceof Brick)) {

            field.setPreviousBoxCoordinatesToFree(x, y, box);

            if (field.getSpecificElementPosition(x, nextY - 1) instanceof RedPoint) {
                field.setGotoNextLevel(true);
            }

            box = new Box(x, nextY - 1, field);
        }
    }

    void moveDown() {
        int nextY = y + 1;
        if (!(field.getSpecificElementPosition(x, nextY) instanceof Brick)) {
            y = nextY;
        }

        if (field.getSpecificElementPosition(x, nextY) instanceof Box &&
                !(field.getSpecificElementPosition(x, nextY + 1) instanceof Brick)) {

            field.setPreviousBoxCoordinatesToFree(x, y, box);

            if (field.getSpecificElementPosition(x, nextY + 1) instanceof RedPoint) {
                field.setGotoNextLevel(true);
            }

            box = new Box(x, nextY + 1, field);
        }
    }
}
