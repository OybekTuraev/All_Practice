import processing.core.PApplet;

public class G02 extends PApplet {

                              // ****   Gradient   **** //

    final int NUMBER_OF_CIRCLES = 15;
    final int MAX_VALUE_RED = 255;
    int x, y, first_circle_diameter, difference_of_circles, difference_of_color;

    public void settings(){

        fullScreen(); //size(1024, 600);
    }

    public void setup(){
        background(0);
        noStroke();

        x = width / 2;
        y = height / 2;
        first_circle_diameter = height;
        difference_of_circles = first_circle_diameter / NUMBER_OF_CIRCLES;
        difference_of_color = MAX_VALUE_RED / NUMBER_OF_CIRCLES;

        for (int i = 0; i < NUMBER_OF_CIRCLES; i++){

            int red = (i + 1) * difference_of_color; // from the most light to the brightest one
            fill(red, 0, 0);
            int next_circle_diameter = first_circle_diameter - i * difference_of_circles;
            circle(x, y, next_circle_diameter);
        }

    }

    public void draw(){

    }

    public static void main(String[] args) {

        PApplet.main("G02");

    }
}
