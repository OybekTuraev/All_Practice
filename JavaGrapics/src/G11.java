import processing.core.PApplet;

public class G11 extends PApplet {

                                 //****      Solar System        ****//

    float venusAngle = 0.0f;
    float venusDeltaAngle = 0.1f;

    float earthAngle = 0.0f;
    float earthDeltaAngle = 0.01f;

    float moonAngle = 0.0f;
    float moonDeltaAngle = 0.1f;

    public void settings(){
        fullScreen();
    }

    public void setup(){
        background(0);
        noStroke();
    }

    public void draw(){

        // To occupy whole window with transparent rectangle
        fill(0,80);
        rect(0, 0, width, height);

        // Sun
        float sunX = width / 2f;
        float sunY = height / 2f;
        float sunSize = 150;

        fill(255, 174, 0);
        translate(sunX, sunY);
        circle(0, 0, sunSize);

        // Venus
        float venusX = 150;
        float venusY = 0;
        float venusSize = 50;

        pushMatrix();
        fill(2, 246, 250);
        rotate(venusAngle);
        venusAngle += venusDeltaAngle;
        translate(venusX, venusY);
        circle(0, 0, venusSize);
        popMatrix();

        // Earth
        float earthX = 280;
        float earthY = 0;
        float earthSize = 30;

        fill(252, 0, 93);
        rotate(earthAngle);
        earthAngle += earthDeltaAngle ;
        translate(earthX, earthY);
        circle(0, 0, earthSize);

        // Moon //  in relation with Earth that's why no need put push and popMatrix before it
        float moonX = 50;
        float moonY = 0;
        float moonSize = 15;

        fill(252);
        rotate(moonAngle);
        moonAngle += moonDeltaAngle ;
        translate(moonX, moonY);
        circle(0, 0, moonSize);
    }

    public static void main(String[] args) {

        PApplet.main("G11");
    }
}
