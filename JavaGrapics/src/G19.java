import processing.core.PApplet;

import javax.swing.*;

public class G19 extends PApplet {

                                //****     Snake Balls      ****//

    final int SIZE = 40; // int
    int[][] x, y; // correct, but maybe int[][] will be better
    //float[] angle;	// you are not using this at all, I guess you don't need it either.
    int[][] dx, dy;	// each ball has to have its own speed, not each snake has one. try using int[][] dx, dy
    int number = 6, length = 20;
    int distanceX, distanceY;

    public void settings(){
        fullScreen();
    }

    public void setup(){
        background(255);
        noStroke();

        // Giving the Sizes
        x = new int[number][length];
        y = new int[number][length];
        //angle = new float[number]; // do you really need it?
        dx = new int[number][length]; // so here it will be int[number][length]
        dy = new int[number][length]; // so here it will be int[number][length]

        // Assigning Values
        for (int i = 0; i < number; i++){ // GOOD!
            x[i][0] = (int) random(SIZE, width - SIZE); // this range is too dangerous. one of balls might appear right on the border and get stucked
            y[i][0] = (int) random(SIZE, height - SIZE);// try to shrink it like this (SIZE, height-SIZE), same for width

            dx[i][0] = (int)random(-3, 3);	// try to think about the way how to randomize negative values too, avoiding too small values (like zero)
            dy[i][0] = (int) random(-3, 3);// also, it might result an error using floating values of dx, dy, x, y, distanceX, distanceY. Try using int.

            if (dx[i][0] == 0){
                dx[i][0] = -1;
            }
            if (dy[i][0] == 0){
                dy[i][0] = -1;
            }

            //float distanceX = cos(angle[i]) * SIZE; // i guess, here is a problem of distances, your distance should be computed with
            // the values of dx, dy - so it will be in correct angle, thus angle[] will not be needed

            //float distanceY = sin(angle[i]) * SIZE;	// also try using int on distanceX, distanceY

             //angle[i] = random(-PI, PI); // you first use angle[i] and then assign some value? then u never use angle[i] again
            // you don't need it. Delete.

            for (int j = 1; j < length; j++){ // very good!
                // maybe distanceX, distanceY should be computed here?
                distanceX = x[i][j] + dx[i][j] + 28;
                distanceY = y[i][j] + dy[i][j] + 28;

                x[i][j] = x[i][j - 1] + distanceX; 	// what if we put a ball out of the screen? it will never reach the screen
                y[i][j] = y[i][j - 1] + distanceY;
                dx[i][j] = dx[i][j-1];
                dy[i][j] = dy[i][j-1];
                // there is a major check is missing
                // how can we be sure if a new ball is on a screen?

                if (x[i][j] > width || x[i][j] < 0){
                    x[i][j] = -x[i][j];
                }

                if (y[i][j] > height || y[i][j] < 0){
                    y[i][j] = -y[i][j];
                }
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

                if (x[i][j] < 0){
                    x[i][j] =  - x[i][j];
                    dx[i][j] = -dx[i][j];
                }

                if (x[i][j] > width){              // I guess you don't need SIZE here
                    x[i][j] = -x[i][j];
                    dx[i][j] = -dx[i][j];
                }

                if (y[i][j] < 0){
                    y[i][j] = - y[i][j];
                    dy[i][j] = -dy[i][j];
                }

                if (y[i][j] > height){
                    y[i][j] = - y[i][j];             // here is a bug, find it yourself
                    dy[i][j] = -dy[i][j];
                }
            }
        }
    }

    public static void main(String[] args) {

        PApplet.main("G19");
    }
}
