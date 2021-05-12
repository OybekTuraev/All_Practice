import java.util.Scanner;

class EOFException extends Exception {
    EOFException(String message) {
        super(message);
    }
}

public class Minesweeper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        showMessage();
        Field field = readDifficulty(args);
        field.present();

        int[] selection;
        int selX = 0, selY = 0;
        boolean isFirstTime = true;
        boolean useOnce = true;
        boolean firstShowPressed = false;

        while (true) {
            System.out.print("cmd: ");
            String commands = scanner.next();

            switch (commands) {
                case "quit":
                    System.out.println("\nThe field will be mined after the first left click");
                    System.out.println("Oww, Good Bye!");
                    System.exit(1);
                    break;
                case "help":
                    showMessage();
                    break;
                case "left":
                    try {
                        selection = readCoordinates(scanner, field);
                        selY = selection[0]; // row
                        selX = selection[1]; // col
                    } catch (EOFException ignored) {
                        System.exit(0);
                    }

                    if (useOnce) {
                        field.setMinesAtRandom(selX, selY);
                        field.floodUncover(selX, selY);
                        field.present();
                    }

                    if (!isFirstTime) {
                        continueGame(field, selX, selY);
                    }
                    break;
                case "right":
                    try {
                        selection = readCoordinates(scanner, field);
                        selY = selection[0]; // row
                        selX = selection[1]; // col
                        selX = (field.getWidth() - 1) - selX; // convert to left based
                    } catch (EOFException ignored) {
                        System.exit(0);
                    }

                    if (useOnce) {
                        field.setMinesAtRandom(selX, selY);
                        field.floodUncover(selX, selY);
                        field.present();
                    }

                    if (!isFirstTime) {
                        continueGame(field, selX, selY);
                    }
                    break;
                case "show":
                    if (isFirstTime) {
                        System.out.println("\nThe field will be mined after the first left click");
                    }
                    System.out.println();
                    firstShowPressed = true;
                    field.presentMines();
                    break;
                default:
                    System.out.println("Incorrect command. Try Again");
                    scanner.nextLine();
            }

            if (!firstShowPressed) {
                isFirstTime = false;
                useOnce = false;
            }
            else {
                firstShowPressed = false;
            }
        }
    }

    private static void showMessage() {
        System.out.println("Help:\n" +
                "left <row> <col>\n\t- left click with coordinates (row, col)\n" +
                "right <row> <col>\n\t- right click with coordinates (row, col)\n" +
                "show\n\t- show all mines (cheating)\n" +
                "quit\n\t- quit the game (EOF work too)\n" +
                "help\n\t- this text\n" );
    }

    private static Field readDifficulty(String[] args) {
        do {
            String  difficulty;
            int input = 1;

            try {
                if (args.length == 0) {
                    return new Field(input);
                }
                else if (args.length == 1 && args[0].matches("beginner|intermediate|expert")) {
                    difficulty = args[0];

                    switch (difficulty) {
                        case "beginner":
                            input = 1;
                            break;
                        case "intermediate":
                            input = 2;
                            break;
                        case "expert":
                            input = 3;
                            break;
                        default:
                            System.out.println("Unknown mode: " + difficulty);
                            showUsageMessage();
                    }

                    return new Field(input);
                }
                else if (args.length == 3) {
                    int width = Integer.parseInt(args[0]);
                    int height = Integer.parseInt(args[1]);
                    int mines = Integer.parseInt(args[2]);

                    if (mines >= width * height) {
                        System.err.println("Incorrect mode: mines >= width * height");
                        showUsageMessage();
                    }

                    return new Field(width, height, mines);
                }
                else if (args.length > 3) {
                    System.out.println("Incorrect app args: " + arrayElements(args));
                    showUsageMessage();
                }
                else {
                    System.out.println("Unknown mode: " + arrayElements(args));
                    showUsageMessage();
                }

            }
            catch (NumberFormatException ignored) {
                System.err.println("Invalid difficulty level. Try Again (Ctrl + D to exit).");
            }
        } while (true);
    }

    private static int[] readCoordinates(Scanner scanner, Field field) throws EOFException {
        if (!scanner.hasNextLine()) {
            throw new EOFException("End of input");
        }

        int x = 0;
        int y = 0;
        try {
            x = Integer.parseInt(scanner.next());
            --x;   // allow to give 1 and make it 0 or less one here
            if (x < 0 || x > field.getWidth()) {
                throw new NumberFormatException();
            }

            y = Integer.parseInt(scanner.next());
            --y;
            if (y < 0 || y > field.getHeight()) {
                throw new NumberFormatException();
            }
        }
        catch (NumberFormatException ignored) {
            System.err.println("Invalid coordinates. Try Again (Ctrl + D to exit).");
        }

        return new int[] {x, y};
    }

    private static void continueGame(Field field, int selX, int selY) {
        boolean lost = false;
        boolean won = false;

        int cell = field.getField(selX, selY);
        if (cell == field.getMINE_VAL()) {
            field.setUncoveredFieldToTrue(selX, selY);
            lost = true;
        } else if (cell == field.getEMPTY_VAL()) {
            field.floodUncover(selX, selY);
        } else {
            field.setUncoveredFieldToTrue(selX, selY);
        }

        if (field.countUncoveredFields()) {
            won = true;
        }

        field.present();

        if (lost) {
            System.out.println("You lost the game");
            System.exit(0);
        } else if (won){
            System.out.println("Congratulations! You won the game");
            System.exit(0);
        }
    }

    private static void showUsageMessage() {
        System.out.println("Usage:\n"                                            +
                "java -jar Minesweeper.jar beginner\n\t- "                       +
                "game in the beginner mode: width=8, height=8, mines=10\n"       +
                "java -jar Minesweeper.jar intermediate\n\t- "                   +
                "game in the intermediate mode: width=16, height=16, mines=40\n" +
                "java -jar Minesweeper.jar expert\n\t- "                         +
                "game in the expert mode: width=30, height=16, mines=99\n"       +
                "java -jar Minesweeper.jar\n\t- "                                +
                "equivalent to \"java -jar Minesweeper.jar beginner\"\n"         +
                "java -jar Minesweeper.jar <width> <height> <mines>\n\t- "       +
                "game with the specified width, height, and number of mines\"\n"
        );
        System.exit(1);
    }

    private static String arrayElements (String[] args) {
        StringBuilder s = new StringBuilder();
        for (String e : args) {
            s.append(e).append(" ");
        }

        return s.toString();
    }
}
