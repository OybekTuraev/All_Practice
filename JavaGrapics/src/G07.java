import processing.core.PApplet;

import javax.swing.*;

public class G07 extends PApplet {

    float initialAngle = 0.0f;
    float initialAngle1 = 0.0f;
    float deltaAngle = 0.02f;
    float deltaAngle1 = 0.006f;
    float x, y;
    float numOuterStars;

    public void settings(){
        fullScreen();
    }

    public void setup(){

        background(0);
        strokeWeight(3); // line thickness

        numOuterStars = Integer.parseInt(JOptionPane.showInputDialog("The number of the stars"));
    }

    public void draw(){

        background(0); // important thing here to clean everything

        x = width / 2.0f;
        y = height / 2.0f;
        float radiusForSmallStars = height / 2.5f;

        stroke(255, 0, 0); // line color
        star(8, x, y, 50, 150, initialAngle);
        initialAngle += deltaAngle;


        for (int i = 0; i < numOuterStars; i++){

            float outerX = (x + cos(initialAngle1  + i) * radiusForSmallStars);
            float outerY = (y + sin(initialAngle1 + i) * radiusForSmallStars);

            star(8, outerX, outerY, 20, 50, initialAngle1);

            initialAngle1 += deltaAngle1;
        }
    }


    private void star(int rayCount, float x, float y, float radius1, float radius2, float angle) {

        float angleStep = TWO_PI / rayCount; // to increase angle every time, in equal

        float prevEndX = x + cos(angle - angleStep) * radius1; // without multiplying radius2, it would be a unit radius
        float prevEndY = y + sin(angle - angleStep) * radius1;

        for (int i = 0; i < rayCount; i++) {

            float selectedRadius = (i % 2 == 0) ? radius2 : radius1;

            float endX = x + cos(angle) * selectedRadius;
            float endY = y + sin(angle) * selectedRadius;
            line(x, y, endX, endY);
            line(prevEndX, prevEndY, endX, endY); // to connect the lines

            angle += angleStep;

            prevEndX = endX; // each time endX will updated first, then prevEndX equal to previous EndX
            prevEndY = endY;
        }
    }

    public static void main(String[] args) {

        PApplet.main("G07");
    }
}
