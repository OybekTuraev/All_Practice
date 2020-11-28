import processing.core.PApplet;

public class G04 extends PApplet {

                                  //****      Three balls      ****//

    final float SIZE = 40;
    final float HALF_SIZE = SIZE / 2.0f;
    final float DISTANCE_CIRCLE = 40;
    float x1, x2, x3, y1, y2, y3;

    float dx1 = 5, dy1 = 5;
    float dx2 = 5, dy2 = 5;
    float dx3 = 5, dy3 = 5;

    public void settings(){
        fullScreen();
    }

    public void setup(){
        background(255);
        noStroke();

        x1 = width / 2.0f;
        y1 = height / 2.0f;

        x2 = x1 + DISTANCE_CIRCLE;
        y2 = y1 + DISTANCE_CIRCLE;

        x3 = x1 + 2 * DISTANCE_CIRCLE;
        y3 = y1 + 2 * DISTANCE_CIRCLE;
    }

    public void draw(){

        background(0);
        // circle 1

        stroke(255, 0, 0);
        fill(255, 0, 0,2);
        circle(x1, y1, SIZE);

        x1 += dx1; y1 += dy1;

        if (x1 + HALF_SIZE > width || x1 - HALF_SIZE < 0){
            dx1 = -dx1;
        }

        if (y1 + HALF_SIZE > height || y1 - HALF_SIZE < 0){
            dy1 = -dy1;
        }

        // Circle 2

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
        }
    }

    public static void main(String[] args) {

        PApplet.main("G04");
    }
}
