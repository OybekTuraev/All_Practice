package gui;

import processing.core.PApplet;

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

    private static final int SIZE = 20;

    private static final char MINE_CELL = '*';
    private static final char EMPTY_CELL = '.';
    private static final char COVERED_CELL = '#';

    private static final int MINE_VAL = -1;
    private static final int EMPTY_VAL = 0;

    private static final int[][] SHIFTS = {
            {-1, -1, -1, 0, 0, 0, 1, 1, 1}, //for y row
            {-1, 0, 1, -1, 0, 1, -1, 0, 1}  //for x row/column
    };

    private int mines;
    private int width;
    private int height;

    private static int[][] field;
    private static boolean[][] uncoveredField;

    private PApplet applet;
    private int level = 1;

    int getLevel() {
        return level;
    }

    void setLevel(int level) {
        this.level = level;
    }

    ArrayList<Float[]> coordinates = new ArrayList<>();

    Field(PApplet applet) {
        this.applet = applet;
        createField(level);
        field = new int[height][width];
        uncoveredField = new boolean[height][width];
    }

    int getWidth() {
        return this.width;
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

    void createField(int level) {
        switch (level) {
            case 2:
                mines = MINES_FOR_INTERMEDIATE;
                width = WIDTH_FOR_INTERMEDIATE;
                height = HEIGHT_FOR_INTERMEDIATE;
                break;
            case 3:
                mines = MINES_FOR_EXPERT;
                width = WIDTH_FOR_EXPERT;
                height = HEIGHT_FOR_EXPERT;
                break;
            case 1:
            default:
                mines = MINES_FOR_BEGINNER;
                width = WIDTH_FOR_BEGINNER;
                height = HEIGHT_FOR_BEGINNER;
                break;
        }

        float fieldWidth = width * SIZE;
        float fieldHeight = height * SIZE;
        float centeringShiftX = (applet.width - fieldWidth) / 2f;
        float centeringShiftY = (applet.height - fieldHeight) / 2f;
        for (int x = 0; x < width; x++){
            for (int y = 0; y < height; y++){
                float pixelX = centeringShiftX + x * SIZE;
                float pixelY = centeringShiftY + y * SIZE;
                coordinates.add(new Float[] { pixelX, pixelY });
            }
        }
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



