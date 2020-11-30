import processing.core.PApplet;

public class G09 extends PApplet {


    public void settings(){
        size(640, 360);
    }

    public void setup(){

        background(0);

        textSize(16);
        //textAlign(RIGHT);
        text("ABCD", 50, 30);

       //textAlign(CENTER);
        text("MMMM", 50, 50);

        //textAlign(LEFT);
        text("KKKK", 50, 70);


    }

    public void draw(){
    }



    public static void main(String[] args) {

        PApplet.main("G09");
    }
}
