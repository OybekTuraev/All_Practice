import jdk.nashorn.internal.scripts.JO;
import processing.core.PApplet;

import javax.swing.*;

public class G16 extends PApplet {

                    //****         Random Stars with 2D array        ****//

    final int rays = 8;

    final float MIN_RADIUS = 8;
    final float MAX_RADIUS = 15;

    final float MIN_DX = -2;
    final float MAX_DX = 2;

    final float MIN_DY = -2;
    final float MAX_DY = 2;

    final float COLOR_MIN = 0;
    final float COLOR_MAX = 255;

    /*float[] x, y;
    float[] radius;
    float[] dx, dy;
    float[] angle, deltaAngle;
    float[] rc, gc, bc; // colors*/
    int numberOfStars;

    float[][] data;

    public void settings(){
        fullScreen();
    }

    public void setup(){
        background(0);
        strokeWeight(3);

        // Ask from User the Input
        numberOfStars = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of Stars[10; 200]"));

        // Giving the Size
        /*x = new float[numberOfStars];
        y = new float[numberOfStars];
        radius = new float[numberOfStars];
        dx = new float[numberOfStars];
        dy = new float[numberOfStars];
        angle = new float[numberOfStars];
        deltaAngle = new float[numberOfStars];
        rc = new float[numberOfStars];
        gc = new float[numberOfStars];
        bc = new float[numberOfStars];*/

        data = new float[10][numberOfStars];

        //  Assigning Random Values
        for (int i = 0; i < numberOfStars; i++){
            /*x[i] = random(width);
            y[i] = random(height);
            radius[i] = random(MIN_RADIUS, MAX_RADIUS);
            dx[i] = random(MIN_DX, MAX_DX);
            dy[i] = random(MIN_DY, MAX_DY);
            rc[i] = random(COLOR_MIN, COLOR_MAX);
            gc[i] = random(COLOR_MIN, COLOR_MAX);
            bc[i] = random(COLOR_MIN, COLOR_MAX);
            angle[i] = 0;
            deltaAngle[i] = 0.03f;*/

            data[0][i] = random(width);
            data[1][i] = random(height);
            data[2][i] = random(MIN_RADIUS, MAX_RADIUS);
            data[3][i] = random(MIN_DX, MAX_DX);
            data[4][i] = random(MIN_DY, MAX_DY);
            data[5][i] = random(COLOR_MIN, COLOR_MAX);
            data[6][i] = random(COLOR_MIN, COLOR_MAX);
            data[7][i] = random(COLOR_MIN, COLOR_MAX);
            data[8][i] = 0;
            data[9][i] = 0.03f;
        }
    }

    public void draw(){
        background(0);

        for (int i = 0; i < numberOfStars; i++){

            // Rotate and Draw the stars
            /*pushMatrix();
            translate(x[i], y[i]);
            rotate(angle[i]);
            angle[i] += deltaAngle[i];
            stars(rays, 0, 0, radius[i], angle[i], rc[i], bc[i], gc[i]);
            popMatrix();*/
            pushMatrix();
            translate(data[0][i], data[1][i]);
            rotate(data[8][i]);
            data[8][i] += data[9][i];
            stars(rays, 0, 0, data[2][i], data[8][i], data[5][i], data[6][i], data[7][i]);
            popMatrix();

            // Moving the Stars
            data[0][i] += data[3][i];
            data[1][i] += data[4][i];

            if (data[0][i] < data[2][i]){
                data[0][i] = 2 * data[2][i] - data[0][i];
                data[3][i] = -data[3][i];
                data[9][i] = -data[9][i];
            }

            if (data[0][i] + data[2][i] > width){
                data[0][i] = 2 * width - data[0][i] - 2 * data[2][i];
                data[3][i] = -data[3][i];
                data[9][i] = -data[9][i];
            }

            if (data[1][i] < data[2][i]){
                data[1][i] = 2 * data[2][i] - data[1][i];
                data[4][i] = -data[4][i];
                data[9][i] = -data[9][i];
            }

            if (data[1][i] + data[2][i] > height){
                data[1][i] = 2 * height - data[1][i] - 2 * data[2][i];
                data[4][i] = -data[4][i];
                data[9][i] = -data[9][i];
            }
        }
    }

    public void stars(int rays, float x, float y,  float radius, float angle, float rc, float gc, float bc){

        float deltaAngle1 = TWO_PI / rays;

        for (int i = 0; i < rays; i++){

            float endX = x + cos(angle) * radius;
            float endY = y + sin(angle) * radius;

            stroke(rc, gc, bc);
            line(x, y, endX, endY);

            angle += deltaAngle1;
        }
    }

    public static void main(String[] args) {

        PApplet.main("G16");
    }
}
