import processing.core.PApplet;

import javax.swing.*;

public class G18 extends PApplet {

       // Not Yet Complete              //****      Snake Balls       ****//

    final int SIZE = 40;
    final float MAX_COLOR = 255f;

    float[][] x, y;
    float[][] dx, dy;
    float[] distanceX, distanceY;
    int distanceK, length, number;
    float color;

    public void settings(){
        fullScreen();
    }

    public void setup(){
        background(0);
        noStroke();

        number = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of sequence"));
        length = Integer.parseInt(JOptionPane.showInputDialog("Enter the length of sequence"));

        // Giving the Sizes
        x = new float[number][length];
        y = new float[number][length];

        dx = new float[number][length];
        dy = new float[number][length];
        distanceX = new float[number];
        distanceY = new float[number];

        // Assigning Values
        for (int i = 0; i < number; i++){
            x[i][0] = (int) random(SIZE, width - SIZE);
            y[i][0] = (int) random(SIZE, height - SIZE);
            dx[i][0] = random(1, 4);
            dy[i][0] = random(1, 4);
            color = MAX_COLOR / number;

            distanceK = (int)(SIZE / Math.sqrt(sq(dx[i][0]) + sq(dy[i][0])));

            distanceX[i] = dx[i][0] * distanceK;
            distanceY[i] = dy[i][0] * distanceK;
        }

        for (int i = 0; i < number; i++){
            for (int j = 1; j < length; j++){

                x[i][j] = x[i][j - 1] - distanceX[i];
                y[i][j] = y[i][j - 1] - distanceY[i];

                dx[i][j] = dx[i][j - 1];
                dy[i][j] = dy[i][j - 1];

                if (x[i][j] < 0){
                    distanceX[i] = -distanceX[i];
                    dx[i][j] = -dx[i][j];
                    x[i][j] =  - x[i][j];
                }
                else if (x[i][j] > width){
                    distanceX[i] = -distanceX[i];
                    dx[i][j] = -dx[i][j];
                    x[i][j] = (2 * width - x[i][j]);
                }

                if (y[i][j] < 0){
                    distanceY[i] = -distanceY[i];
                    dy[i][j] = -dy[i][j];
                    y[i][j] =  - y[i][j];
                }
                else if (y[i][j] > height){
                    distanceY[i] = -distanceY[i];
                    dy[i][j] = -dy[i][j];
                    y[i][j] = (2 * height - y[i][j]);
                }
            }
        }
    }   

    public void draw(){

        fill(0, 30);
        rect(0, 0, width, height);

        for (int i = 0; i < number; i++){
            for (int j = 0; j < length; j++){

                // Color
                if (i % 3 == 0){
                    fill(255 - color * j, 0, 0);
                }

                else if (i % 3 == 1){
                    fill(0, 255 - color * j, 0);
                }

                else {
                    fill(0, 0, 255 - color * j);
                }

                circle(x[i][j], y[i][j], SIZE);

                // Moving
                x[i][j] += dx[i][j];
                y[i][j] += dy[i][j];

                if (x[i][j] < 0){
                    dx[i][j] = -dx[i][j];
                    x[i][j] =  - x[i][j];
                }
                else if (x[i][j] > width){
                    dx[i][j] = -dx[i][j];
                    x[i][j] = (2 * width - x[i][j]);
                }

                if (y[i][j] < 0){
                    dy[i][j] = -dy[i][j];
                    y[i][j] =  - y[i][j];
                }
                else if (y[i][j] > height){
                    dy[i][j] = -dy[i][j];
                    y[i][j] = (2 * height - y[i][j]);
                }
            }
        }
    }

    public static void main(String[] args) {

        PApplet.main("G18");
    }
}
