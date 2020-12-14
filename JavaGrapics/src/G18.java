import processing.core.PApplet;

import javax.swing.*;

public class G18 extends PApplet {

                              //****     Snake Balls      ****//

    final float SIZE = 40;

    float[][] x, y;
    float[] angle;
    float dx, dy;
    int number = 10, length = 2;

    public void settings(){
        fullScreen();
    }

    public void setup(){
        background(255);
        noStroke();

        // Giving the Sizes
        x = new float[number][length];
        y = new float[number][length];
        angle = new float[number];
        dx = 5; dy = 5;

        // Assigning Values
        for (int i = 0; i < number; i++){
            x[i][0] = random(0, width);
            y[i][0] = random(0, height);
            float distanceX = cos(angle[i]) * SIZE;
            float distanceY = sin(angle[i]) * SIZE;
            angle[i] = random(-PI, PI);

            for (int j = 1; j < length; j++){
                x[i][j] = x[i][j - 1] + distanceX;
                y[i][j] = y[i][j - 1] + distanceY;
            }
        }
    }

    public void draw(){

        background(0);

        for (int i = 0; i < number; i++){
            for (int j = 0; j < length; j++){

                fill(255, 0, 0);
                circle(x[i][j], y[i][j], SIZE);
            }
        }









        /*for (int i = 0; i < number; i++){

            centerCoordinatesX[i] = x1 + i * DISTANCE_CIRCLE;
            centerCoordinatesY[i] = y1 + i * DISTANCE_CIRCLE;

            fill(255, 0, 0);
            circle(centerCoordinatesX[i], centerCoordinatesY[i], SIZE);
        }

        for (int i = 0; i < number; i++){

            centerCoordinatesX[i][j] += dx;
            centerCoordinatesY[i][j] += dy;

            if (centerCoordinatesX[i] + HALF_SIZE > width || centerCoordinatesX[i] - HALF_SIZE < 0){
                dx = -dx;
            }
            if (centerCoordinatesY[i] + HALF_SIZE > height || centerCoordinatesY[i] - HALF_SIZE < 0){
                dy = -dy;
            }
        }*/

    }

    public static void main(String[] args) {

        PApplet.main("G18");
    }
}
