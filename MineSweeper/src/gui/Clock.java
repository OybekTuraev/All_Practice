package gui;

import processing.core.PApplet;

public class Clock {
    private float time, x, y;
    private PApplet applet;
    StringBuilder timer;

    Clock(PApplet applet, float x, float y) {
        this.applet = applet;
        this.x = x;
        this.y = y;
        time = 0;
    }

    void setXAndY (float x, float y) {
        this.x = x;
        this.y = y;
    }

    void startTime(int level) {
        time += 1 / applet.frameRate;

        applet.textSize(25);
        applet.fill(255, 0, 0);
        timer = new StringBuilder(String.format("00%.0f", time));
        if (time >= 9) {
            timer.deleteCharAt(1);
        }
        else if (time >= 99) {
            timer.deleteCharAt(0);
        }

        if (level == 2) {
            applet.text(timer.toString(), x - 90, y - 110);
        }
        else if (level == 3) {
            applet.text(timer.toString(), x - 90, y - 110);
        }
        else {
            applet.text(timer.toString(), x - 90, y - 30);
        }
    }
}
