import processing.core.PApplet;

public class G01 extends PApplet {

                                          // ***** Smooth Animation ***** //

    final float SIZE = 30;
    final float HALF_SIZE = SIZE / 2;

    float x1, y1;
    float dx1 = 5, dy1 = 5;

    float x2, y2;
    float dx2 = -5, dy2 = -5;

    public void settings(){

        size(1024, 600);
    }

    public void setup(){
        background(0);
        noStroke();

        x1 = x2 = width / 2.0f;
        y1 = y2 = height / 2.0f;
    }

        // 60 times per second, draw used when need to move, for animation
    public void draw(){

        //background(0);

        fill(0, 0, 0, 2);   // to leave tracing
        rect(0,0, width, height);

        // Circle 1

        fill(255);
        circle(x1, y1, SIZE);

        // with number control speed, with the sign direction
        // adding one 1 , and in draw it repeats that's why it's moving

        x1 += dx1; y1 += dy1;

        if (x1 + HALF_SIZE > width || x1 - HALF_SIZE < 0) {    // when x reached to hit the wall , the right size,
            dx1 = -dx1; // dx *= -1;                     // it means, when it hits, come back with changing direction
        }

        if (y1 + HALF_SIZE > height || y1 - HALF_SIZE < 0) {
            dy1 = -dy1;
        }

        // Circle 2

        fill(255, 0, 0);
        circle(x2, y2, SIZE);

        x2 += dx2; y2 += dy2;

        if (x2 + HALF_SIZE > width || x2 - HALF_SIZE < 0) {
            dx2 = -dx2;
        }

        if (y2 + HALF_SIZE > height || y2 - HALF_SIZE < 0) {
            dy2 = -dy2;
        }

    }


    public static void main(String[] args) {

        PApplet.main("G01");

    }
}
