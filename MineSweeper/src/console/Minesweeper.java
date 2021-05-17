package console;

import java.util.Scanner;

class EOFException extends Exception {
    EOFException(String message) {
        super(message);
    }
}

public class Minesweeper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Play.showMessage();
        Field field = Play.getDifficulty(args);
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
                    Play.showMessage();
                    break;
                case "left":
                    try {
                        selection = Play.getCoordinates(scanner, field);
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
                        Play.continuePlay(field, selX, selY);
                    }
                    break;
                case "right":
                    try {
                        selection = Play.getCoordinates(scanner, field);
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
                        Play.continuePlay(field, selX, selY);
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
}
