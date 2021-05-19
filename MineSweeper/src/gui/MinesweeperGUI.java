package gui;

import processing.core.PApplet;

import java.util.ArrayList;

public class MinesweeperGUI extends PApplet {
    private static final int SIZE = 20;
    private float x, y;
    private int level;
    private Field field;
    private Clock time;
    private CommandButtons beginnerB;
    private CommandButtons intermediateB;
    private CommandButtons expertB;
    private CommandButtons iconB;
    private FieldButtons button;
    private boolean once = true;
    private boolean isFirstClick = false;

    enum Difficulty {
        Beginner, Intermediate, Expert
    }

    Difficulty currentDifficulty = Difficulty.Beginner;
    ArrayList<FieldButtons> buttons = new ArrayList<>();

    public void settings() {
        fullScreen();
    }

    public void setup() {
        background(255);
        x = width * 0.4f;
        y = height * 0.4f;
        level = 1;
        field = new Field(this);
        float buttonX;
        float buttonY;

        float iconX;
        float iconY;

        if (currentDifficulty == Difficulty.Intermediate) {
            buttonX = x + 8 * 20 + intermediateB.getWidth();
            buttonY = y * 1.08f;
            iconX = buttonX - field.getWidth() * SIZE * 1.3f;
            iconY = buttonY - field.getHeight() * SIZE + 20;
            level = 2;
        }
        else if (currentDifficulty == Difficulty.Expert) {
            buttonX = x + 32 * 20 - expertB.getWidth();
            buttonY = y * 1.08f;
            iconX = buttonX - field.getWidth() * SIZE * 2.3f;
            iconY = buttonY - field.getHeight() * SIZE + 20;
            level = 3;
        }
        else {
            buttonX = x + 8 * 20 + 80;
            buttonY = y * 1.08f;
            iconX = buttonX - 120;
            iconY = buttonY - 60;
        }

        if (once) {
            time = new Clock(this, buttonX, buttonY);
        }

        time.setXAndY(buttonX, buttonY);

        iconB = new CommandButtons(this, iconX, iconY, "", 25, 30);
        iconB.setIconNormal(loadImage("smileStart.png"));
        iconB.setIconHover(loadImage("smileRestart.png"));

        beginnerB = new CommandButtons(this,  buttonX, buttonY, "beginner", 160, 30);
        beginnerB.setActive(true);
        intermediateB = new CommandButtons(this, buttonX, buttonY + 40, "intermediate", 160, 30);
        intermediateB.setActive(true);
        expertB = new CommandButtons(this, buttonX, buttonY + 80, "expert",160, 30);
        expertB.setActive(true);
        once = false;

        field.createField(level);

        for (int i = 0; i < field.coordinates.size(); i++) {
            Float[] location = field.coordinates.get(i);
            float fx = location[0];
            float fy = location[1];
            button = new FieldButtons(this, "", fx, fy, SIZE, SIZE);
            buttons.add(button);
        }


    }

    public void draw() {
        background(255);
        if (currentDifficulty == Difficulty.Beginner) {
            level = 1;
        }
        else if (currentDifficulty == Difficulty.Intermediate) {
            level = 2;
        }
        else if (currentDifficulty == Difficulty.Expert) {
            level = 3;
        }

        time.startTime(level);

        field.createField(level);

        beginnerB.draw();
        intermediateB.draw();
        expertB.draw();
        iconB.setLevel(level);
        iconB.draw();

        for (FieldButtons button : buttons) {
            button.draw();
        }


        if (isFirstClick) {
            field.present();

        }
    }

    public void mousePressed() {
        if (mouseButton == LEFT) {
            if (beginnerB.containCoordinates(mouseX, mouseY)) {
                currentDifficulty = Difficulty.Beginner;
                buttons.clear();
                setup();
                beginnerB.mousePressed();
            }
            else if (intermediateB.containCoordinates(mouseX, mouseY)) {
                currentDifficulty = Difficulty.Intermediate;
                buttons.clear();
                setup();
                intermediateB.mousePressed();
            }
            else if (expertB.containCoordinates(mouseX, mouseY)) {
                currentDifficulty = Difficulty.Expert;
                buttons.clear();
                setup();
                expertB.mousePressed();
            }
            else if (iconB.containCoordinates(mouseX, mouseY)) {
                once = true;
                buttons.clear();
                setup();
                iconB.mousePressed();
            }
            else {
                for (FieldButtons button : buttons) {
                    if (button.containCoordinates(mouseX, mouseY)) {
                        button.mousePressed();
                        if (!isFirstClick) {
                            field.setMinesAtRandom(button.getX(), button.getY());
                            System.out.println(button.getX() + " " + button.getY());
                            field.floodUncover(button.getX(), button.getY());
                        }
                        isFirstClick = true;
                    }
                }
            }

        }
        else if (mouseButton == RIGHT) {
                for (FieldButtons button : buttons) {
                    if (button.containCoordinates(mouseX, mouseY)) {
                        button.mousePressed();
                    }
                }

            System.out.println("right is pressed");
        }
    }

    public void mouseReleased() {
        /*for (FieldButtons button : buttons) {
            if (button.containCoordinates(mouseX, mouseY)) {
                button.mouseReleased();
            }
        }*/
    }

    public void mouseClicked() {

    }

    public void mouseMoved() {
       /* for (FieldButtons button : buttons) {
            if (button.containCoordinates(mouseX, mouseY)) {
                button.mouseMoved();
            }
        }*/
    }

    void continuePlay(int selX, int selY) {
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

    public static void main(String[] args) {
        PApplet.main("gui.MinesweeperGUI");
    }
}
