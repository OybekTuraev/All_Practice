import processing.core.PApplet;

import javax.swing.*;

public class G08 extends PApplet {

    final float SIZE = 50;
    int column, row;
    float mouseCoordinateX, mouseCoordinateY;

    public void settings(){
       size(720, 680);
       //fullScreen();
    }

    public void setup(){

        row = Integer.parseInt(JOptionPane.showInputDialog("Enter the rows"));
        column = Integer.parseInt(JOptionPane.showInputDialog("Enter the column"));
    }

    public void draw(){

        background(27, 247, 240);

        float fieldWidth = column * SIZE;
        float fieldHeight = row * SIZE;
        float centeringShiftX = (width - fieldWidth) / 2.0f;
        float centeringShiftY = (height - fieldHeight) / 2.0f;

        for (int y = 0; y < row; y++){
            for (int x = 0; x < column; x++){
                float pixelX = centeringShiftX + x * SIZE;
                float pixelY = centeringShiftY + y * SIZE;
                fill(((x + y) % 2 == 0) ? 0 : 255);
                square(pixelX, pixelY, SIZE);
            }
        }

        if (mouseX > centeringShiftX && mouseX < centeringShiftX + fieldWidth &&
                mouseY > centeringShiftY && mouseY < centeringShiftY + fieldHeight){

            textSize(20);
            fill(0);

            int columnNumber = ((int)(mouseX - centeringShiftX)) / ((int)SIZE); // (120 - 110) / 50 = 0
            int rowNumber = ((int)(mouseY - centeringShiftY)) / ((int)SIZE);

            String mouseText = String.format("Row: %d, Column %d, Color %s", rowNumber, columnNumber,
                    fill(rowNumber, columnNumber));

            float pixelX = centeringShiftX + columnNumber * SIZE;
            float pixelY = centeringShiftY + rowNumber * SIZE;

            fill(250, 255, 0, 0);
            strokeWeight(4);
            stroke(255, 0, 0);
            square(pixelX, pixelY, SIZE);

            textAlign(CENTER, CENTER);
            mouseCoordinateX = (width) / 2.0f;                  // Location of the MouseText
            mouseCoordinateY = (centeringShiftY - 30);

            fill(0);
            noStroke();
            text(mouseText, mouseCoordinateX, mouseCoordinateY);
        }
    }

    private String fill(int rowNumber, int columnNumber){

        return ((rowNumber + columnNumber) % 2 == 0) ? "Black" : "White";
    }

    public static void main(String[] args) {

        PApplet.main("G08");
    }
}
