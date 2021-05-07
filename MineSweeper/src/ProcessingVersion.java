import java.util.ArrayList;
import java.util.Scanner;
// main class, field > 2d array, difficulty, cell > object uncovered covered is mine or mine
class EOFException extends Exception {
    EOFException(String message) {
        super(message);
    }
}

public class ProcessingVersion {
    private static final int MINES_FOR_BEGINNER     = 10;
    private static final int MINES_FOR_INTERMEDIATE = 40;
    private static final int MINES_FOR_EXPERT       = 99;

    private static final int FIELD_WIDTH_FOR_BEGINNER      = 8;
    private static final int FIELD_HEIGHT_FOR_BEGINNER     = 8;
    private static final int FIELD_WIDTH_FOR_INTERMEDIATE  = 16;
    private static final int FIELD_HEIGHT_FOR_INTERMEDIATE = 16;
    private static final int FIELD_WIDTH_FOR_EXPERT        = 24;
    private static final int FIELD_HEIGHT_FOR_EXPERT       = 24;

    private static final char MINE_CELL    = '*'; //bomb
    private static final char EMPTY_CELL   = '.'; //circle
    private static final char COVERED_CELL = '#'; //square

    private static final int MINE_VAL = -1;
    private static final int EMPTY_VAL = 0;

    private static int[][] SHIFTS = {
            {-1, -1, -1, 0,  0, 0,  1, 1, 1}, //for y row
            {-1,  0,  1, -1, 0, 1, -1, 0, 1}  //for x row/column
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int difficulty = 1;
        try {
            difficulty = readDifficulty(scanner);
        }
        catch (EOFException ignored) {
            System.exit(0);
        }

        int mines;
        int fieldWidth, fieldHeight;
        switch (difficulty) {
            case 1:
                mines = MINES_FOR_BEGINNER;
                fieldWidth = FIELD_WIDTH_FOR_BEGINNER;
                fieldHeight = FIELD_HEIGHT_FOR_BEGINNER;
                break;
            case 2:
                mines = MINES_FOR_INTERMEDIATE;
                fieldWidth = FIELD_WIDTH_FOR_INTERMEDIATE;
                fieldHeight = FIELD_HEIGHT_FOR_INTERMEDIATE;
                break;
            case 3:
            default:
                mines = MINES_FOR_EXPERT;
                fieldWidth = FIELD_WIDTH_FOR_EXPERT;
                fieldHeight = FIELD_HEIGHT_FOR_EXPERT;
                break;
        }

        boolean[][] uncoveredField = new boolean[fieldHeight][fieldWidth];
        int[][] field = new int[fieldHeight][fieldWidth];
        present(field, uncoveredField);

        int[] selection;
        int selX = 0, selY = 0;
        try {
            selection = readCoordinates(scanner, 0, fieldWidth, 0, fieldHeight);
            selX = selection[0];
            selY = selection[1];
        }
        catch (EOFException ignored) {
            System.exit(0);
        }

        ArrayList<Integer[]> potentialMinePlaces = new ArrayList<>();
        for (int y = 0; y < fieldHeight; y++) {
           outer:
            for (int x = 0; x < fieldWidth; x++) {
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
                if (areCoordsInside(field, nx, ny) && field[ny][nx] != MINE_VAL) {
                    field[ny][nx]++;
                }
            }
        }

        floodUncover(selX, selY, field, uncoveredField);

        boolean lost = false;
        boolean won = false;
        do  {
            present(field, uncoveredField);
            try {
                selection = readCoordinates(scanner, 0, fieldWidth, 0, fieldHeight);
                selX = selection[0];
                selY = selection[1];
            }
            catch (EOFException ignored) {
                System.exit(0);
            }

            int cell = field[selY][selX];
            if (cell == MINE_VAL) {
                uncoveredField[selY][selX] = true;
                lost = true;
            }
            else if (cell == EMPTY_VAL) {
                floodUncover(selX, selY, field, uncoveredField);
            }
            else {
                uncoveredField[selY][selX] = true;
            }

            //TODO check whether we won or lost?

        } while (!lost);

        present(field, uncoveredField);

        //TODO display the message whether we won or lost?

    }

    private static int readDifficulty(Scanner scanner) throws EOFException {
        do {
            System.out.println(
                    "Select the difficulty level:\n" +
                    "\t1. Beginner\n" +
                    "\t2. Intermediate\n" +
                    "\t3. Expert");

            if (!scanner.hasNextLine()) {
                throw new EOFException("End of input");
            }

            try {
                String rawInput = scanner.nextLine();
                int input = Integer.parseInt(rawInput);
                if (input < 1 || input > 3) {
                    throw new NumberFormatException();
                }
                return input;
            }
            catch (NumberFormatException ignored) {
                System.err.println("Invalid difficulty level. Try Again (Ctrl + D to exit).");
            }
        } while (true);
    }

    private static int[] readCoordinates(Scanner scanner, int minX, int maxX, int minY, int maxY) throws EOFException {
        do {
            System.out.println("Select a cell (x, y): ");

            if (!scanner.hasNextLine()) {
                throw new EOFException("End of input");
            }

            try {
                String[] parts = scanner.nextLine().split(" ");
                if (parts.length != 2) {
                    throw new NumberFormatException();
                }

                int x = Integer.parseInt(parts[0]);
                --x;   // allow to give 1 and make it 0 or less one here
                if (x < minX || x > maxX) {
                    throw new NumberFormatException();
                }

                int y = Integer.parseInt(parts[1]);
                --y;
                if (y < minY || y > maxY) {
                    throw new NumberFormatException();
                }

                return new int[] {x, y};
            }
            catch (NumberFormatException ignored) {
                System.err.println("Invalid coordinates. Try Again (Ctrl + D to exit).");
            }
        } while (true);
    }

    private static boolean areCoordsInside(int[][] field, int x, int y) {
        int fieldWidth = field[0].length;
        int fieldHeight = field.length;

        return x >= 0 && x < fieldWidth && y >= 0 && y < fieldHeight;
    }

    private static void present(int[][] field, boolean[][] uncoveredField) {
        int fieldWidth = field[0].length;
        int fieldHeight = field.length;

        for (int y = 0; y < fieldHeight; y++) {
            for (int x = 0; x < fieldWidth; x++) {
                 if (uncoveredField[y][x]) {
                     int cell = field[y][x];
                     if (cell == MINE_VAL) {
                         System.out.print(MINE_CELL);
                     }
                     else if (cell == EMPTY_VAL) {
                         System.out.print(EMPTY_CELL);
                     }
                     else {
                         System.out.print(cell);
                     }
                 }
                 else {
                     System.out.print(COVERED_CELL);
                 }
            }
            System.out.println();
        }
    }

    private static void present(int[][] field) {
        int fieldWidth = field[0].length;
        int fieldHeight = field.length;

        for (int y = 0; y < fieldHeight; y++) {
            for (int x = 0; x < fieldWidth; x++) {
                 int cell = field[y][x];
                 if (cell == MINE_VAL) {
                     System.out.print(MINE_CELL);
                 }
                 else if (cell == EMPTY_VAL) {
                     System.out.print(EMPTY_CELL);
                 }
                 else {
                     System.out.print(cell);
                 }
            }
            System.out.println();
        }
    }

    private static void floodUncover(int selX, int selY, int[][] field, boolean[][] uncoveredField) {
        for (int i = 0; i < SHIFTS[0].length; i++) {
            int ny = selY + SHIFTS[0][i];
            int nx = selX + SHIFTS[1][i];
            if (areCoordsInside(field, nx, ny) && !uncoveredField[ny][nx]) {
                uncoveredField[ny][nx] = true;
                if (field[ny][nx] == EMPTY_VAL) {
                    floodUncover(nx, ny, field, uncoveredField);
                }
            }
        }
    }
}
