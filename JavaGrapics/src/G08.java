import processing.core.PApplet;

import javax.swing.*;

public class G08 extends PApplet {

    final float SIZE = 50;
    int column, row;

    public void settings(){
       size(720, 680);
        // fullScreen();
    }

    public void setup(){

        row = Integer.parseInt(JOptionPane.showInputDialog("Enter the rows"));
        column = Integer.parseInt(JOptionPane.showInputDialog("Enter the column"));
    }

    public void draw(){

        background(255);


        float fieldWidth = column * SIZE;
        float fieldHeight = row * SIZE;
        float centeringShiftX = (width - fieldWidth) / 2.0f;
        float centeringShiftY = (height - fieldHeight) / 2.0f;

        for (int y = 0; y < row; y++){
            for (int x = 0; x < column; x++){
                float pixelX = centeringShiftX + x * SIZE;
                float pixelY = centeringShiftY + y * SIZE;
                fill(((x + y) % 2 == 0) ? 0 : 255, 0, 0);
                square(pixelX, pixelY, SIZE);
            }
        }

        centeringShiftX = (width) / 2.0f;
        centeringShiftY = (height - fieldHeight + 70) / 2.0f;

        textSize(20);
        fill(0);
        String info = String.format("Row: %d, Column %d", mouseX, mouseY);
        textAlign(CENTER, CENTER);
        text(info, centeringShiftX, centeringShiftY / 2f);
    }

    public static void main(String[] args) {

        PApplet.main("G08");
    }
}
