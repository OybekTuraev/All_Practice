package Part01;

public class GameField {
    private static final char PLAYER_CHAR = '@';
    private static final char BRICK_CHAR = '#';
    private static final char BOX_CHAR = '$';
    private static final char RED_POINT_CHAR = '.';
    private static final char FREE_ZONE_CHAR = ' ';
    private boolean gotoNextLevel;

    private int width, height;
    private int currentLevel;
    private Object[][] coordinates;

    private final String[] puzzleLevel = {
            "  #####\n"  +
            "###   #\n"  +
            "# $ # ##\n" +
            "# #  . #\n" +
            "#    # #\n" +
            "## #   #\n" +
            " #@  ###\n" +
            " #####\n",

            "  #####\n"  +
            "###   #\n"  +
            "# $ # ##\n" +
            "# #  . #\n" +
            "#    # #\n" +
            "##$#.  #\n" +
            " #@  ###\n" +
            " #####\n",

            "  #####\n"  +
            "###   #\n"  +
            "# $ # ##\n" +
            "# #  . #\n" +
            "# .  # #\n" +
            "##$#.$ #\n" +
            " #@  ###\n" +
            " #####\n"
    };

    GameField() {
        this.currentLevel = 0;
        startPuzzle(puzzleLevel[currentLevel]);
    }

    void startPuzzle(String level) {
        String[] temp = level.split("\n");
        int maxWidth = getMax(temp);
        this.height = temp.length;
        this.width = maxWidth;

        coordinates = new Object[height][width];
        for (int y = 0; y < height; y++) {

            int x = 0; // Remove the first whitespace
            char firstChar = temp[y].charAt(x);
            while (firstChar == ' ' && x < temp[y].length()) {
                x++;
                firstChar = temp[y].charAt(x);
            }

            for (; x < temp[y].length(); x++) {
                char tempChar = temp[y].charAt(x);
                if (tempChar == PLAYER_CHAR) {
                    coordinates[y][x] = new Player(x, y, this);
                }
                else if (tempChar == BRICK_CHAR) {
                    coordinates[y][x] = new Brick(x, y);
                }
                else if (tempChar == BOX_CHAR) {
                    coordinates[y][x] = new Box(x, y, this);
                }
                else if (tempChar == RED_POINT_CHAR) {
                    coordinates[y][x] = new RedPoint(x, y);
                }
                else if (tempChar == FREE_ZONE_CHAR) {
                    coordinates[y][x] = new FreeZone(x, y);
                }
            }
        }
    }

    boolean isGotoNextLevel() {
        return gotoNextLevel;
    }

    void setGotoNextLevel(boolean bool) {
        gotoNextLevel = bool;
    }

    int getWidth() {
        return width;
    }

    int getHeight() {
        return height;
    }

    int getCurrentLevel() {
        return currentLevel + 1;
    }

    Object getSpecificElementPosition(int x, int y) {
        return coordinates[y][x];
    }

    void setSpecificElementPosition(int x, int y, Object subclass) {
        coordinates[y][x] = subclass;
    }

    String[] getPuzzleLevel(int level) {
        return puzzleLevel[level].split("\n");
    }

    int getMax(String[] array) {
        int max = array[0].length();
        for (String e : array) {
            if (max < e.length()) {
                max = e.length();
            }
        }
        return max;
    }

    Player startPlayer() {
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (coordinates[y][x] instanceof Player) {
                    return (Player) coordinates[y][x];
                }
            }
        }

        return null;
    }

    void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    void setPreviousBoxCoordinatesToFree(int x, int y, Box box) {
        coordinates[y][x] = new FreeZone(x, y);
    }

    void nextLevel() {
        currentLevel++;
        if (currentLevel == 2) {
            currentLevel = 0;
        }
        System.out.println(currentLevel);
        setGotoNextLevel(false);
        startPuzzle(puzzleLevel[currentLevel]);
    }

    void prevLevel() {
        currentLevel--;
        if (currentLevel == -1) {
            currentLevel = 2;
        }
        setGotoNextLevel(false);
        startPuzzle(puzzleLevel[currentLevel]);
    }

    void restart() {
        //setGotoNextLevel(false);
        startPuzzle(puzzleLevel[currentLevel]);
    }
}
