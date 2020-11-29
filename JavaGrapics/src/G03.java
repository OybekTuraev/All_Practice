import processing.core.PApplet;

public class G03 extends PApplet {

                             //****       Stars      ****//

    public void settings(){
        size(1024, 600);
    }

    public void setup(){

        background(0);
        strokeWeight(3); // line thickness

        /*float x = width / 2.0f;
        float y = height / 2.0f;
        float radius1 = 70.0f;
        float radius2 = 200.0f;
        int rayCount = 8 ;
        float angle = 0.0f;*/

        stroke(255, 0, 0); // line color
        star(8, width / 2.0f, height / 2.0f, 50, 150, 0.0f);
        stroke(255, 255, 0); // line color
        star(8, width / 2.0f - 350, height / 2.0f - 150, 30, 80, 0.0f);
        stroke(255, 255, 0); // line color
        star(8, width / 2.0f - 350, height / 2.0f + 150, 30, 80, 0.0f);
        stroke(255, 255, 0); // line color
        star(8, width / 2.0f + 350, height / 2.0f - 150, 30, 80, 0.0f);
        stroke(255, 255, 0); // line color
        star(8, width / 2.0f + 350, height / 2.0f + 150, 30, 80, 0.0f);
    }


    private void star(int rayCount, float x, float y, float radius1, float radius2, float angle){

        float angleStep = TWO_PI / rayCount; // to increase angle every time, in equal

        float prevEndX = x + cos(angle - angleStep) * radius1; // without multiplying radius2, it would be a unit radius
        float prevEndY = y + sin(angle - angleStep) * radius1;

        for (int i = 0; i < rayCount; i++){

            float selectedRadius = (i % 2 == 0) ? radius2 : radius1;

            float endX = x + cos(angle) * selectedRadius;
            float endY = y + sin(angle) * selectedRadius;
            line(x, y, endX, endY);
            line(prevEndX, prevEndY, endX, endY); // to connect the lines

            angle += angleStep;

            prevEndX = endX; // each time endX will updated first, then prevEndX equal to previous EndX
            prevEndY = endY;
        }
    }

    public static void main(String[] args) {

        PApplet.main("G03");
    }
}
