import processing.core.PApplet;

import javax.swing.*;

public class G18 extends PApplet {

                              //****     Snake Balls      ****//

    final float SIZE = 40;

    float[][] x, y;
    float[] angle;
    float[] dx, dy;
    int number = 6, length = 20;

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
        dx = new float[number];
        dy = new float[number];

        // Assigning Values
        for (int i = 0; i < number; i++){
            x[i][0] = random(0, width);
            y[i][0] = random(0, height);
            dx[i] = random(1, 4);
            dy[i] = random(1, 4);
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

                x[i][j] += dx[i];
                y[i][j] += dy[i];

                if (x[i][j] < 0){
                    x[i][j] =  - x[i][j];
                    dx[i] = -dx[i];
                }

                if (x[i][j] + SIZE > width){
                    x[i][j] = -x[i][j];
                    dx[i] = -dx[i];
                }

                if (y[i][j] < 0){
                    y[i][j] = - y[i][j];
                    dy[i] = -dy[i];
                }

                if (y[i][j] + SIZE > height){
                    x[i][j] = - y[i][j];
                    dy[i] = -dy[i];
                }

            }
        }
    }

    public static void main(String[] args) {

        PApplet.main("G18");
    }
}
