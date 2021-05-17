package gui;

import processing.core.PApplet;
import processing.core.PImage;

interface MouseClickListener {
    void mouseClicked();
}
public class FieldButtons {
    enum ButtonState {
        Normal, Hover, Active
    }

    private ButtonState currentState = ButtonState.Normal;

    private String label;
    private float x, y, width, height;

    private int fontSize = 16;

    private int backgroundColor = 0xff404040;
    private int backgroundColorHover = 0xff5e5e5e;
    private int backgroundColorActive = 0xff282828;

    private int labelColor = 0xffe0e0e0;
    private int labelColorHover = 0xffe0e0e0;
    private int labelColorActive = 0xff969696;

    private PImage backgroundImage = null;
    private PImage backgroundImageHover = null;
    private PImage backgroundImageActive = null;

    private PImage icon = null;
    private PImage iconHover = null;
    private PImage iconActive = null;

    private boolean enabled = true;
    private MouseClickListener clickListener = () -> { };

    private final PApplet applet;


    FieldButtons (PApplet applet, String label, float x, float y, float width, float height) {
        this.applet = applet;
        this.label = label;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    ButtonState getCurrentState() {
        return currentState;
    }

    void setCurrentState(ButtonState currentState) {
        this.currentState = currentState;
    }

    String getLabel() {
        return label;
    }

    void setLabel(String label) {
        this.label = label;
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

    float getWidth() {
        return width;
    }

    void setWidth(float width) {
        this.width = width;
    }

    float getHeight() {
        return height;
    }

    void setHeight(float height) {
        this.height = height;
    }

    int getFontSize() {
        return fontSize;
    }

    void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    int getBackgroundColor() {
        return backgroundColor;
    }

    void setBackgroundColor(int backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    int getBackgroundColorHover() {
        return backgroundColorHover;
    }

    void setBackgroundColorHover(int backgroundColorHover) {
        this.backgroundColorHover = backgroundColorHover;
    }

    int getBackgroundColorActive() {
        return backgroundColorActive;
    }

    void setBackgroundColorActive(int backgroundColorActive) {
        this.backgroundColorActive = backgroundColorActive;
    }

    int getLabelColor() {
        return labelColor;
    }

    void setLabelColor(int labelColor) {
        this.labelColor = labelColor;
    }

    int getLabelColorHover() {
        return labelColorHover;
    }

    void setLabelColorHover(int labelColorHover) {
        this.labelColorHover = labelColorHover;
    }

    int getLabelColorActive() {
        return labelColorActive;
    }

    void setLabelColorActive(int labelColorActive) {
        this.labelColorActive = labelColorActive;
    }

    PImage getBackgroundImage() {
        return backgroundImage;
    }

    void setBackgroundImage(PImage backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    PImage getBackgroundImageHover() {
        return backgroundImageHover;
    }

    void setBackgroundImageHover(PImage backgroundImageHover) {
        this.backgroundImageHover = backgroundImageHover;
    }

    PImage getBackgroundImageActive() {
        return backgroundImageActive;
    }

    void setBackgroundImageActive(PImage backgroundImageActive) {
        this.backgroundImageActive = backgroundImageActive;
    }

    PImage getIcon() {
        return icon;
    }

    void setIcon(PImage icon) {
        this.icon = icon;
    }

    PImage getIconHover() {
        return iconHover;
    }

    void setIconHover(PImage iconHover) {
        this.iconHover = iconHover;
    }

    PImage getIconActive() {
        return iconActive;
    }

    void setIconActive(PImage iconActive) {
        this.iconActive = iconActive;
    }

    boolean isEnabled() {
        return enabled;
    }

    void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    MouseClickListener getClickListener() {
        return clickListener;
    }

    void setClickListener(MouseClickListener clickListener) {
        this.clickListener = clickListener;
    }

    void mousePressed() {
        if (!enabled) return;

        if (containCoordinates(applet.mouseX, applet.mouseY)) {
            currentState = ButtonState.Active;
        }

        if (applet.mouseButton == applet.RIGHT) {
            System.out.println("hi");
        }
    }

    void mouseReleased() {
        if (!enabled) return;

        if (containCoordinates(applet.mouseX, applet.mouseY)) {
            currentState = ButtonState.Hover;
        }
        else {
            currentState = ButtonState.Normal;
        }
    }

    void mouseClicked() {
        if (!enabled) return;

        if (containCoordinates(applet.mouseX, applet.mouseY)) {
            clickListener.mouseClicked();
        }
    }

    void mouseMoved() {
        if (!enabled) return;

        if (containCoordinates(applet.mouseX, applet.mouseY)) {
            currentState = ButtonState.Hover;
        }
        else {
            currentState = ButtonState.Normal;
        }
    }

    void draw() {
        if (currentState == ButtonState.Normal) {
            applet.fill(backgroundColor);
            applet.rect(x, y, width, height);

            /*if (backgroundImage != null) {
                applet.image(backgroundImage, x, y, width, height);
            }*/

            if (icon != null) {
                float iconX = x + (width - icon.width) * 0.5f;
                float iconY = y + (height - icon.height) * 0.5f;
                applet.image(icon, iconX, iconY);//TODO
            }

            if (!label.isEmpty()) {
                applet.fill(labelColor);
                applet.textAlign(applet.CENTER, applet.CENTER);
                applet.textSize(fontSize);
                applet.text(label, x + width / 2, y + height / 2);
            }
        }
        else if (currentState == ButtonState.Hover) {
            applet.fill(backgroundColorHover);
            applet.rect(x, y, width, height);
            if (backgroundImageHover != null) {
                applet.image(backgroundImageHover, x, y, width, height);
            }
            else if (backgroundImage != null) {
                applet.image(backgroundImage, x, y, width, height);
            }

            if (iconHover != null) {
                float iconX = x + (width - icon.width) * 0.5f;
                float iconY = y + (height - icon.height) * 0.5f;
                applet.image(iconHover, iconX, iconY);
            }
            else if (icon != null) {
                float iconX = x + (width - icon.width) * 0.5f;
                float iconY = y + (height - icon.height) * 0.5f;
                applet.image(icon, iconX, iconY);
            }

            if (!label.isEmpty()) {
                applet.fill(labelColorHover);
                applet.textAlign(applet.CENTER, applet.CENTER);
                applet.textSize(fontSize);
                applet.text(label, x + width / 2, y + height / 2);
            }
        }
        else if (currentState == ButtonState.Active) {
            applet.fill(backgroundColorHover);
            applet.rect(x, y, width, height);
            //backgroundImageActive = applet.loadImage("rectangle.png");
            if (backgroundImageActive != null) {
                applet.image(backgroundImageActive, x, y, width, height);
            }
            else if (backgroundImage != null) {
                applet.image(backgroundImage, x, y, width, height);
            }

            if (iconActive != null) {
                float iconX = x + (width - icon.width) * 0.5f;
                float iconY = y + (height - icon.height) * 0.5f;
                applet.image(iconActive, iconX, iconY);
            }
            else if (icon != null) {
                float iconX = x + (width - icon.width) * 0.5f;
                float iconY = y + (height - icon.height) * 0.5f;
                applet.image(icon, iconX, iconY);
            }

            if (!label.isEmpty()) {
                applet.fill(labelColorActive);
                applet.textAlign(applet.CENTER, applet.CENTER);
                applet.textSize(fontSize);
                applet.text(label, x + width / 2, y + height / 2);
            }
        }
    }

    boolean containCoordinates(int mouseX, int mouseY) {
        return mouseX >= x && mouseX < x + width &&
                mouseY >= y && mouseY < y + height;
    }


}
