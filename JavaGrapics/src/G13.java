import processing.core.PApplet;

public class G13 extends PApplet {

                                //****       Amazing Stars        ****//

    float bigRadius;
    float bigAngle = 0.0f;
    float bigDeltaAngle = 0.05f;

    float smallRadius;
    float smallAngle = 0.0f;
    float smallDeltaAngle = 0.1f;

    float starsDistance = 20;
    float starsAngle = 0.0f;
    float starsDeltaAngle = 0.015f;

    public void settings(){
        fullScreen();
    }

    public void setup(){
        background(255);
        stroke(0);
        strokeWeight(2);

        bigRadius = min(width, height) / 6f;
        smallRadius = min(width, height) / 12f;
        starsDistance = min(width, height) / 3f;
    }

    public void draw() {

        fill(0,20);
        rect(0, 0, width + 1, height + 1);

        drawStar(width / 2f, height / 2f, bigRadius, bigAngle, 255, 0, 0);
        translate(width / 2f, height / 2f);

        for (int i = 0; i < 12; i++){
            pushMatrix();
            rotate(starsAngle + i * (2 * TWO_PI / 12));
            drawStar(starsDistance, 0, smallRadius, smallAngle, 0, 255, 255);
            popMatrix();
        }

        bigAngle += bigDeltaAngle;
        smallAngle += smallDeltaAngle;
        starsAngle += starsDeltaAngle;
    }

    private void drawStar( float x, float y, float radius, float angle, float rc, float gc, float bc) {
        pushMatrix();
        translate(x, y);
        rotate(angle);
        stroke(rc, gc, bc);
        line(-radius, 0, radius, 0);
        line(0, -radius, 0, radius);
        line(-radius / 4f, -radius / 4f, radius / 4f, radius / 4f);
        line(-radius / 4f, radius / 4f, radius / 4f, -radius / 4f);
        popMatrix();
    }

    public static void main(String[] args) {

        PApplet.main("G13");
    }
}
