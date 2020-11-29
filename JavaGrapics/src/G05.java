import processing.core.PApplet;

public class G05 extends PApplet {

                             // ****       Iron Mike Tyson       **** //

    final float DISTANCE_WORDS = 200;
    float x1, x2, x3, y1, y2, y3;
    float size1 = 40, max1 = 150, min1 = 30, speedText1 = 1;
    float size2 = 150, max2 = 150, min2 = 30, speedText2 = 1;
    float size3 = 150, max3 = 150, min3 = 30, speedText3 = 1;

    public void settings(){
        fullScreen();
    }

    public void setup(){
        background(0);
        noStroke();

        x1 = width / 2.0f;
        y1 = height / 2.0f;

        x2 = x1;
        y2 = y1 - DISTANCE_WORDS;

        x3 = x1;
        y3 = y1 + DISTANCE_WORDS;

    }

    public void draw(){
        background(255);

        // Above Center

        textSize(size2);
        textAlign(CENTER, CENTER);
        fill(0);
        text("Iron", x2, y2);


        size2 -= speedText2;

        if (size2 > max2 || size2 < min2){
            speedText2 = -speedText2;
        }

        // Center word

        textSize(size1);
        textAlign(CENTER, CENTER);
        fill(255, 0, 0);
        text("Mike", x1, y1);

        size1 += speedText1;

        if (size1 > max1 || size1 < min1){
            speedText1 = -speedText1;
        }

        // Below the center

        textSize(size2);
        textAlign(CENTER, CENTER);
        fill(0);
        text("Tyson", x3, y3);


        size3 -= speedText3;

        if (size3 > max3 || size3 < min3){
            speedText3 = -speedText3;
        }

    }

    public static void main(String[] args) {

        PApplet.main("G05");
    }
}
