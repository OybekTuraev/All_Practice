import processing.core.PApplet;

import javax.swing.*;

                        //****           Moving Texts         ****//

public class G06 extends PApplet {

    final float SIZE = 45;
    float dx1 = 3, dx2 = 3;
    float x1, y1, x2, y2;
    float width1, width2;
    String word1, word2;

    public void settings(){
        fullScreen();
    }

    public void setup(){

        word1 = JOptionPane.showInputDialog("Enter the first word");
        word2 = JOptionPane.showInputDialog("Enter the second word");

        x1 = width / 2.0f;
        y1 = height / 2.0f;

        x2 = x1;
        y2 = y1 + (height / 3.0f); // not working if outside height / 3
    }

    public void draw(){
        background(255);

        // first Text

        textSize(SIZE);
        textAlign(CENTER, CENTER);
        fill(0);
        text(word1, x1, y1);
        width1 = textWidth(word1);

        x1 += dx1;

        if (x1 + width1 / 2.0f > width  || x1 - width1 / 2.0f < 0){
            dx1 = -dx1;
        }

        // Second Text

        textSize(SIZE);
        textAlign(CENTER, CENTER);
        fill(255, 0, 0);
        text(word2, x2, y2);
        width2 = textWidth(word2);

        x2 -= dx2;

        if (x2 + width2 / 2.0f > width || x2 - width2 / 2.0f < 0){
            dx2 = -dx2;
        }
    }

    public static void main(String[] args) {

        PApplet.main("G06");
    }
}
