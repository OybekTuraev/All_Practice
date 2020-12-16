import processing.core.PApplet;

import javax.swing.*;

public class G18 extends PApplet {

                               //****     Snake Balls      ****//

    final int SIZE = 40;

    int[][] x, y;
    int[] angle;
    int[][] dx, dy;
    int number = 6, length = 5;

    public void settings(){
        fullScreen();
    }

    public void setup(){
        background(255);
        noStroke();

        // Giving the Sizes
        x = new int[number][length];
        y = new int[number][length];
        angle = new int[number];
        dx = new int[number][length];
        dy = new int[number][length];

        // Assigning Values
        for (int i = 0; i < number; i++){
            x[i][0] = (int) random(SIZE, width - SIZE);
            y[i][0] = (int) random(SIZE, height - SIZE);
            dx[i][0] = (int) random(-3, 3);
            dy[i][0] = (int) random(-3, 3);

            for (int j = 1; j < length; j++){

                int distanceX = x[i][j] + dx[i][j] + 28;
                int distanceY = y[i][j] + dy[i][j] + 28;

                x[i][j] = x[i][j - 1] + distanceX;
                y[i][j] = y[i][j - 1] + distanceY;

                dx[i][j] = dx[i][j - 1];
                dy[i][j] = dy[i][j - 1];
            }
        }
    }

    public void draw(){

        background(0);

        for (int i = 0; i < number; i++){
            for (int j = 0; j < length; j++){

                fill(255, 0, 0);
                circle(x[i][j], y[i][j], SIZE);

                x[i][j] += dx[i][j];
                y[i][j] += dy[i][j];

                if (x[i][j] - SIZE / 2 < 0){
                    x[i][j] =  (2 * SIZE - x[i][j]);
                    dx[i][j] = -dx[i][j];
                }

                if (x[i][j] > width){
                    x[i][j] = (2 * width - x[i][j] - 2 * SIZE);
                    dx[i][j] = -dx[i][j];
                }

                if (y[i][j] < 0){
                    y[i][j] = (2 * SIZE - y[i][j]);
                    dy[i][j] = -dy[i][j];
                }

                if (y[i][j]  > height){
                    y[i][j] = (2 * height - y[i][j] - 2 * SIZE);
                    dy[i][j] = -dy[i][j];
                }
            }
        }
    }

    public static void main(String[] args) {

        PApplet.main("G18");
    }
}
