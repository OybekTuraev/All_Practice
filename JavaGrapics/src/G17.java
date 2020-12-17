import processing.core.PApplet;

import javax.swing.*;

public class G17 extends PApplet {

           //  Not Yet Complete           //****      Alone Snake Ball       ****//

    final int SIZE = 40;
    final int NUMBER_SEQUENCE = 1;

    float[][] x, y;
    float[][] dx, dy;
    float[] distanceX, distanceY, opacity;
    int distanceK, length;
    float maxOpacity = 255;

    public void settings(){
        fullScreen();
    }

    public void setup(){
        background(0);
        noStroke();

        length = Integer.parseInt(JOptionPane.showInputDialog("Enter the length of sequence"));

        // Giving the Sizes
        x = new float[NUMBER_SEQUENCE][length];
        y = new float[NUMBER_SEQUENCE][length];

        dx = new float[NUMBER_SEQUENCE][length];
        dy = new float[NUMBER_SEQUENCE][length];
        distanceX = new float[NUMBER_SEQUENCE];
        distanceY = new float[NUMBER_SEQUENCE];
        opacity = new float[length];

        // Assigning Values
        for (int i = 0; i < NUMBER_SEQUENCE; i++){
            x[i][0] = (int) random(SIZE, width - SIZE);
            y[i][0] = (int) random(SIZE, height - SIZE);
            dx[i][0] = 3;
            dy[i][0] = 3;

            distanceK = (int)(SIZE / Math.sqrt(sq(dx[i][0]) + sq(dy[i][0])));

            distanceX[i] = dx[i][0] * distanceK;
            distanceY[i] = dy[i][0] * distanceK;
        }

        for (int i = 0; i < NUMBER_SEQUENCE; i++){
            for (int j = 1; j < length; j++){

                x[i][j] = x[i][j - 1] - distanceX[i];
                y[i][j] = y[i][j - 1] - distanceY[i];

                dx[i][j] = dx[i][j - 1];
                dy[i][j] = dy[i][j - 1];

                opacity[j] = maxOpacity;
                maxOpacity -= 10;

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

        fill(0,50);
        rect(0, 0, width, height);

        for (int i = 0; i < NUMBER_SEQUENCE; i++){
            for (int j = 0; j < length; j++){

                fill(255, 0, 0);
                circle(x[i][j], y[i][j], SIZE);

                x[i][j] += dx[i][j];
                y[i][j] += dy[i][j];

                if (x[i][j] < 0 || x[i][j] > width){
                    dx[i][j] = -dx[i][j];
                }

                if (y[i][j] < 0 || y[i][j] > height){
                    dy[i][j] = -dy[i][j];
                }
            }
        }
    }

    public static void main(String[] args) {

        PApplet.main("G17");
    }
}
