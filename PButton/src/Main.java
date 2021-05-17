import processing.core.PApplet;

import java.util.ArrayList;

public class Main extends PApplet {
    ArrayList<Button> buttons = new ArrayList<>();

    public void settings() {
        size(600, 400);
    }

    public void setup() {
        background(255);

        float cx = width / 2f;
        float cy = height / 2f;

        float buttonWidth = 100;
        float buttonHeight = 100;
        float button1X = cx - buttonWidth / 2;
        float button1Y = cy - buttonHeight / 2;
        Button button1 = new Button(this, "1", button1X, button1Y, buttonWidth, buttonHeight);
        button1.setBackgroundImage(loadImage("rectangle.png"));
        button1.setBackgroundImageHover(loadImage("rectangle.png"));
        button1.setBackgroundImageActive(loadImage("rectangle.png"));
        button1.setClickListener(() -> System.out.println("Button 1 was clicked"));

        buttons.add(button1);
    }

    public void draw() {
        for (Button button : buttons) {
            button.draw();
        }
    }

    public void mousePressed() {
        for (Button button : buttons) {
            button.mousePressed();
        }
    }

    public void mouseReleased() {
        for (Button button : buttons) {
            button.mouseReleased();
        }
    }

    public void mouseClicked() {
        for (Button button : buttons) {
            button.mouseClicked();
        }
    }

    public void mouseMoved() {
        for (Button button : buttons) {
            button.mouseMoved();
        }
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}
