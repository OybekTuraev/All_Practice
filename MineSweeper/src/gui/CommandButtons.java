package gui;

import processing.core.PApplet;
import processing.core.PImage;
public class CommandButtons {
    private float x;
    private float y;
    private String name;
    private PApplet applet;

    private float width;
    private float height;
    private int level;

    private final int backgroundColor = 0xfffaabb;
    private final int backgroundColorHover = 0xff5e5e5e;

    private PImage iconHover = null;
    private PImage iconNormal = null;

    private boolean active = false;

    enum State {
        Normal, Hover
    }
    State currentState = State.Normal;

    CommandButtons(PApplet applet, float x, float y, String name, float width, float height) {
        this.applet = applet;
        this.x = x;
        this.y = y;
        this.name = name;
        this.width = width;
        this.height = height;
    }

    float getWidth() {
        return width;
    }

    float getHEIGHT() {
        return height;
    }

    float getX() {
        return x;
    }

    void setX(float x) {
        this.x = x;
    }

    float getY() {
        return y;
    }

    void setY(float y) {
        this.y = y;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getBackgroundColor() {
        return backgroundColor;
    }

    int getBackgroundColorHover() {
        return backgroundColorHover;
    }

    PImage getIconHover() {
        return iconHover;
    }

    void setIconHover(PImage iconHover) {
        this.iconHover = iconHover;
    }

    PImage getIconNormal() {
        return iconNormal;
    }

    void setIconNormal(PImage iconNormal) {
        this.iconNormal = iconNormal;
    }

    void setActive(boolean active) {
        this.active = active;
    }

    void setLevel(int level) {
        this.level = level;
    }

    void mousePressed() {
        if (containCoordinates(applet.mouseX, applet.mouseY)) {
            currentState = State.Hover;
        }
    }

    void draw() {
        if (currentState == State.Hover) {
            if (active) {
                applet.fill(backgroundColorHover);
                applet.rect(x, y, width, height, 10);
                applet.textSize(20);
                applet.fill(0);
                applet.text(name, x + 25, y + 22);
            }

            if (iconHover != null) {
                applet.fill(255, 0, 0);
                applet.rect(x, y, 25, 30);
                applet.image(iconHover, x, y, 25, 30);
            }
        }
        else if (currentState == State.Normal) {
            if (active) {
                applet.fill(backgroundColor);
                applet.rect(x, y, width, height, 10);
                applet.textSize(20);
                applet.fill(0);
                applet.text(name, x + 25, y + 22);
            }

            if (iconNormal != null) {
                applet.fill(0, 98, 255);
                applet.rect(x, y, 25, 30);
                applet.image(iconNormal, x, y, 25, 30);
            }

        }

    }

    boolean containCoordinates(int mouseX, int mouseY) {
        return mouseX >= x && mouseX < x + width &&
                mouseY >= y && mouseY < y + height;
    }
}
