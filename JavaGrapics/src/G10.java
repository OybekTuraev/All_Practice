import processing.core.PApplet;

public class G10 extends PApplet {

                               //****       Two Rectangles      ****//

    final float SIZE = 350;
    final float distanceX = 200;
    final float distanceY = 200;
    float x1, y1, x2, y2;
    float mouseCoordinateX, mouseCoordinateY;
    String mouseText;

    public void settings(){
        fullScreen();
    }

    public void setup(){

        x1 = distanceX;
        y1 = distanceY;

        x2 = width - (distanceX + SIZE);
        y2 = distanceY;

        mouseCoordinateX = width / 2f;
        mouseCoordinateY = distanceY - 50;
    }

    public void draw(){

        background(138, 252, 8);

        strokeWeight(3);
        fill(0, 10);
        rect(x1, y1, SIZE, SIZE);
        rect(x2, y2, SIZE, SIZE);

        if (mouseX > distanceX && mouseX < distanceX + SIZE &&
                mouseY > distanceY && mouseY < distanceY + SIZE){

            mouseText = "The center of the circle is in the left rectangle";
            showText(mouseText, mouseCoordinateX, mouseCoordinateY, "black");
        }

        else if (mouseX > x2 && mouseX < x2 + SIZE &&
                mouseY > y2 && mouseY < y2 + SIZE){

            mouseText = "The center of the circle is in the right rectangle";
            showText(mouseText, mouseCoordinateX, mouseCoordinateY, "black");
        }
        else {

            mouseText = "The center of the circle is not in the both rectangles";
            showText(mouseText, mouseCoordinateX, mouseCoordinateY, "black");
        }

        fill(255);
        circle(mouseX, mouseY, 100);
    }

    public void mouseMoved(){

        mouseText = "Mouse Pressed";
        showText(mouseText, mouseCoordinateX, height - 100, "red");
    }

    private void showText(String text, float x, float y, String color){

        textAlign(CENTER, CENTER);
        textSize(25);
        fill((color.equals("black")) ? 0 : 255, 0, 0);
        text(text, x, y);
    }

    public static void main(String[] args) {

        PApplet.main("G10");
    }
}
