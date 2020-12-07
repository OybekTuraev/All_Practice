import processing.core.PApplet;

public class G09 extends PApplet {

                                 //****       Rounding ChessBoard       ****//

    float x, y, row, x2, y2, centerX, centerY;
    final float SIZE = 300;
    final float HALF_SIZE = SIZE / 2;
    final float OFFSET = 15;
    float distance, sizeOfSmall;
    float angle;
    float deltaAngle;
    float dx = 4, dy = 1;

    public void settings(){
        fullScreen();
    }

    public void setup(){

        //background(0);
        row = 5; // SIZE / row side of small square
        x = width / 2f;
        y = height / 2f;
        x2 = x + SIZE;
        y2 = y + SIZE;
        sizeOfSmall = ((SIZE / row) - OFFSET);
        distance = OFFSET + sizeOfSmall;
        angle = 0.0f;
        deltaAngle = 0.01f;
        centerX = (x + x2) / 2;
        centerY = (y + y2) / 2;

    }

    public void draw(){

        fill(0,100);
        rect(0,0, width, height);

        for (float i = x; i < x2; i += distance){
            for (float j = y; j < y2; j += distance){

                pushMatrix();
                translate(i + sizeOfSmall / 2f, j + sizeOfSmall / 2f);
                rotate(angle);
                fill(255);
                rect(-sizeOfSmall / 2f, -sizeOfSmall / 2f, sizeOfSmall, sizeOfSmall);
                popMatrix();
            }
        }

        angle += deltaAngle;

        x += dx;

        if (x > width || x < 0){
            dx = -dx;
        }

        y += dy;

        if (y > height || y < 0){
            dy = -dy;
        }
    }

    public static void main(String[] args) {

        PApplet.main("G09");
    }
}
