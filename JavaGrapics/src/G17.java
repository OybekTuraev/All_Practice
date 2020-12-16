import processing.core.PApplet;

import javax.swing.*;

public class G17 extends PApplet {

                        //****          Alone Snake Ball           ****//

    final float SIZE = 30;
    final float HALF_SIZE = SIZE / 2f;
    int MAX_OPACITY = 255;
    float x,y;
    float[] allX, allY, allDy, allDx, opacity;
    int number;

    public void settings(){
        fullScreen();
    }

    public void setup(){

        number = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of sequences[10:40]"));

        x = 450;
        y = 500;

        allX = new float[number];
        allY = new float[number];
        allDx = new float[number];
        allDy = new float[number];
        opacity = new float[number];

        for (int i = 0; i < number; i++){

            allX[i] = x;
            allY[i] = y;

            x = x - cos(PI / 4) * SIZE;
            y = y - sin(PI / 4) * SIZE;

            allDx[i] = 2;
            allDy[i] = 2;
            opacity[i] = MAX_OPACITY;

            MAX_OPACITY -= 10;
        }
    }

    public void draw(){
        background(0);

        for (int i = 0; i < number; i++){

            pushMatrix();
            translate(allX[i], allY[i]);
            noStroke();
            fill(255, opacity[i]);
            circle(0,0, SIZE);
            popMatrix();

            allX[i] += allDx[i];
            allY[i] += allDy[i];

            if (allX[i] + HALF_SIZE > width || allX[i] - HALF_SIZE < 0){
                allDx[i] = - allDx[i];
            }

            if (allY[i] + HALF_SIZE > height || allY[i] - HALF_SIZE < 0){
                allDy[i] = - allDy[i];
            }
        }
    }

    public static void main(String[] args) {

        PApplet.main("G17");
    }
}
