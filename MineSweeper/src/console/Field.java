package console;

import java.util.ArrayList;

public class Field {
    private static final int MINES_FOR_BEGINNER = 10;
    private static final int MINES_FOR_INTERMEDIATE = 40;
    private static final int MINES_FOR_EXPERT = 99;

    private static final int WIDTH_FOR_BEGINNER = 8;
    private static final int HEIGHT_FOR_BEGINNER = 8;
    private static final int WIDTH_FOR_INTERMEDIATE = 16;
    private static final int HEIGHT_FOR_INTERMEDIATE = 16;
    private static final int WIDTH_FOR_EXPERT = 32;
    private static final int HEIGHT_FOR_EXPERT = 16;

    private static final char MINE_CELL = '*';
    private static final char EMPTY_CELL = '.';
    private static final char COVERED_CELL = '#';

    private static final int MINE_VAL = -1;
    private static final int EMPTY_VAL = 0;

    private static final int[][] SHIFTS = {
            {-1, -1, -1, 0, 0, 0, 1, 1, 1}, //for y row
            {-1, 0, 1, -1, 0, 1, -1, 0, 1}  //for x row/column
    };

    private final int mines;
    private final int width;
    private final int height;

    private static int[][] field;
    private static boolean[][] uncoveredField;
    private final String headerMessage;

    Field(int difficulty) {
        switch (difficulty) {
            case 1:
                headerMessage = "Game(BEGINNER, width = 8, height = 8, mines = 10, flags = 0)";
                mines = MINES_FOR_BEGINNER;
                width = WIDTH_FOR_BEGINNER;
                height = HEIGHT_FOR_BEGINNER;
                break;
            case 2:
                headerMessage = "Game(INTERMEDIATE, width = 16, height = 16, mines = 40, flags = 0)";
                mines = MINES_FOR_INTERMEDIATE;
                width = WIDTH_FOR_INTERMEDIATE;
                height = HEIGHT_FOR_INTERMEDIATE;
                break;
            case 3:
            default:
                headerMessage = "Game(EXPERT, width = 32, height = 16, mines = 99, flags = 0)";
                mines = MINES_FOR_EXPERT;
                width = WIDTH_FOR_EXPERT;
                height = HEIGHT_FOR_EXPERT;
                break;
        }

        field = new int[height][width];
        uncoveredField = new boolean[height][width];
    }

    Field(int width, int height, int mines) {
        headerMessage = String.format("Game(CUSTOM, width = %d, height = %d, mines = %d, flags = 0)",
                width, height, mines);
        this.mines = mines;
        this.width = width;
        this.height = height;

        field = new int[height][width];
        uncoveredField = new boolean[height][width];
    }

    int getMINE_VAL() {
        return MINE_VAL;
    }

    int getEMPTY_VAL() {
        return EMPTY_VAL;
    }

    int getWidth() {
        return width;
    }

    int getHeight() {
        return height;
    }

    int getField(int selX, int selY) {
        return field[selY][selX];
    }

    void setUncoveredFieldToTrue(int selX, int selY) {
        uncoveredField[selY][selX] = true;
    }

    void setMinesAtRandom(int selX, int selY) {
        ArrayList<Integer[]> potentialMinePlaces = new ArrayList<>();
        for (int y = 0; y < height; y++) {
            outer:
            for (int x = 0; x < width; x++) {
                for (int i = 0; i < SHIFTS[0].length; i++) {
                    int ny = selY + SHIFTS[0][i];
                    int nx = selX + SHIFTS[1][i];
                    if (x == nx && y == ny) {
                        break outer;
                    }
                }
                potentialMinePlaces.add(new Integer[] { y, x });
            }
        }

        for (int i = 0; i < mines; i++) {
            int randomIndex = (int) (Math.random() * potentialMinePlaces.size());
            Integer[] mine = potentialMinePlaces.get(randomIndex);
            potentialMinePlaces.remove(randomIndex);

            int y = mine[0];
            int x = mine[1];
            field[y][x] = MINE_VAL;
            for (int j = 0; j < SHIFTS[0].length; j++) {
                int ny = y + SHIFTS[0][j];
                int nx = x + SHIFTS[1][j];
                if (containCoordinates(nx, ny) && field[ny][nx] != MINE_VAL) {
                    field[ny][nx]++;
                }
            }
        }
    }

    boolean containCoordinates(int x, int y) {
        return x >= 0 && x < width && y >= 0 && y < height;
    }

    void floodUncover(int selX, int selY) {
        for (int i = 0; i < SHIFTS[0].length; i++) {
            int ny = selY + SHIFTS[0][i];
            int nx = selX + SHIFTS[1][i];
            if (containCoordinates(nx, ny) && !uncoveredField[ny][nx]) {
                uncoveredField[ny][nx] = true;
                if (field[ny][nx] == EMPTY_VAL) {
                    floodUncover(nx, ny);
                }
            }
        }
    }

    void present() {
        System.out.println("\n" + headerMessage);
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (uncoveredField[y][x]) {
                    int cell = field[y][x];
                    if (cell == MINE_VAL) {
                        System.out.print(MINE_CELL);
                    } else if (cell == EMPTY_VAL) {
                        System.out.print(EMPTY_CELL);
                    } else {
                        System.out.print(cell);
                    }
                } else {
                    System.out.print(COVERED_CELL);
                }
            }
            System.out.println();
        }
    }

    void presentMines() {
        System.out.println(headerMessage);
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int cell = field[y][x];
                if (cell == MINE_VAL) {
                    System.out.print(MINE_CELL);
                }
                else if (cell == EMPTY_VAL) {
                    System.out.print(EMPTY_CELL);
                }
                else {
                    System.out.print(COVERED_CELL);
                }
            }
            System.out.println();
        }
    }

    boolean countUncoveredFields() {
        int countFalse = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (!uncoveredField[i][j]) {
                    countFalse++;
                }
            }
        }
       return countFalse == mines;
    }
}



