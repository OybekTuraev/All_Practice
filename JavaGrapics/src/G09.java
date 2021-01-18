import processing.core.PApplet;

public class G09 extends PApplet {

                                 //****       Rounding ChessBoard       ****//

    float x, y, row, x2, y2;
    final float SIZE = 300;
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
        row = 3; // SIZE / row side of small square
        x = width / 2f;
        y = height / 2f;
        x2 = x + SIZE;
        y2 = y + SIZE;
        sizeOfSmall = ((SIZE / row) - OFFSET);
        distance = OFFSET + sizeOfSmall;
        angle = 0.0f;
        deltaAngle = 0.01f;
    }

    public void draw(){

        fill(0,70);
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
        x2 += dx;
        if (x < 0 || x2 > width){
            dx = -dx;
        }

        y += dy;
        y2 += dy;
        if (y < 0 || y2 > height){
            dy = -dy;
        }
    }

    public static void main(String[] args) {

        PApplet.main("G09");
    }
}
