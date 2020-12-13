import processing.core.PApplet;

import javax.swing.*;

public class G14 extends PApplet {

                                  //****      balls      ****//

    final float SIZE = 40;
    final float HALF_SIZE = SIZE / 2.0f;
    final float DISTANCE_CIRCLE = 28;
    float x1, y1;
    int number = 4, length = 4;
    float[][] centerCoordinatesX, centerCoordinatesY;
    float[] angle;
    float dx, dy;


    public void settings(){
        fullScreen();
    }

    public void setup(){
        background(255);
        noStroke();

        while (true){

            String s = (JOptionPane.showInputDialog("Enter the number of sequence(10:40)"));
            String s1 = (JOptionPane.showInputDialog("Enter the length of sequence(10:40)"));

            if (test(s) && test(s1)){
                number = Integer.parseInt(s);
                length = Integer.parseInt(s1);
                break;
            }

            JOptionPane.showMessageDialog(frame, "Incorrect input: " + s);
        }

        x1 = width / 2.0f;
        y1 = height / 2.0f;
        angle = new float[number];

        centerCoordinatesX = new float[number][length];
        centerCoordinatesY = new float[number][length];
        dx = 5; dy = 5;

        for (int i = 0; i < number; i++){
            angle[i] = random(-PI, PI);


            centerCoordinatesX[i][0] = random(0, width);
            centerCoordinatesY[i][0] = random(0, height);
            float distanceX = cos(angle[i]) * SIZE;
            float distanceY = sin(angle[i]) * SIZE;

            for (int j = 1; j < length; j++){
                centerCoordinatesX[i][j] = centerCoordinatesX[i][j - 1] + distanceX;
                centerCoordinatesY[i][j] = centerCoordinatesY[i][j - 1] + distanceY;
            }
        }


        /*x2 = x1 + DISTANCE_CIRCLE;
        y2 = y1 + DISTANCE_CIRCLE;

        x3 = x1 + 2 * DISTANCE_CIRCLE;
        y3 = y1 + 2 * DISTANCE_CIRCLE;*/
    }

    public void draw(){

        background(0);

        for (int i = 0; i < number; i++){
            for (int j = 0; j < length; j++){

                fill(2555, 0, 0);
                circle(centerCoordinatesX[i][j], centerCoordinatesY[i][j], SIZE);
            }
        }


       /* for (int i = 0; i < number; i++){

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




        // circle 1

        /*stroke(255, 0, 0);
        fill(255, 0, 0,2);
        circle(x1, y1, SIZE);

        x1 += dx1; y1 += dy1;

        if (x1 + HALF_SIZE > width || x1 - HALF_SIZE < 0){
            dx1 = -dx1;
        }

        if (y1 + HALF_SIZE > height || y1 - HALF_SIZE < 0){
            dy1 = -dy1;
        }*/







        /*// Circle 2

        fill(0, 200, 250);
        circle(x2, y2, SIZE);

        x2 += dx2; y2 += dy2;

        if (x2 + HALF_SIZE > width || x2 - HALF_SIZE < 0){
            dx2 = -dx2;
        }

        if (y2 + HALF_SIZE > height || y2 - HALF_SIZE < 0){
            dy2 = -dy2;
        }

        // circle 3

        fill(120, 0, 30);
        circle(x3, y3, SIZE);

        x3 += dx3; y3 += dy3;

        if (x3 + HALF_SIZE > width || x3 - HALF_SIZE < 0){
            dx3 = -dx3;
        }

        if (y3 + HALF_SIZE > height || y3 - HALF_SIZE < 0){
            dy3 = -dy3;
        }*/
    }

    public boolean test(String s){
        try {
            Integer.parseInt(s);
            return Integer.parseInt(s) >= 10 && Integer.parseInt(s) <= 40;
        } catch (Exception e){
            return false;
        }
    }

    public static void main(String[] args) {

        PApplet.main("G14");
    }
}
