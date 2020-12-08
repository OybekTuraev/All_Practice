import processing.core.PApplet;

import javax.swing.*;

public class G12 extends PApplet {

                         //***             Snake Game            ****//

    int fieldWidth, fieldHeight;
    final float FIELD_CELL_SCALE = 0.8f;

    final int SNAKE_LENGTH = 1;
    int[] snakeXs = new int[SNAKE_LENGTH];
    int[] snakeYs = new int[SNAKE_LENGTH];
    int snakeHeadIndex = 0;
    int snakeDx = 1;
    int snakeDy = 0;

    public void settings(){
        fullScreen();
    }

    public void setup(){
        background(0);
        strokeWeight(3);

        while (true){

            String s = (JOptionPane.showInputDialog("Enter the field's size(10:40)"));

            if (test(s)){
                fieldWidth = Integer.parseInt(s);
                fieldHeight = fieldWidth;
                break;
            }

            JOptionPane.showMessageDialog(frame, "Incorrect input: " + s);
        }
    }

    public void draw(){

        // Field

        float cellSize = min(width / fieldWidth, height / fieldHeight) * FIELD_CELL_SCALE;
        float fieldPixelWidth = fieldWidth * cellSize;
        float fieldPixelHeight = fieldHeight * cellSize;
        float cxPixelShiftX = (width - fieldPixelWidth) / 2f;
        float cxPixelShiftY = (height - fieldPixelHeight) / 2f;

        stroke(0);
        fill(0, 51, 41, 30);
        for (int y = 0; y < fieldHeight; y++){
            for (int x = 0; x < fieldWidth; x++){
                float pixelX = cxPixelShiftX + x * cellSize;
                float pixelY = cxPixelShiftY + y * cellSize;
                square(pixelX, pixelY, cellSize);
            }
        }

        // Snake

        ellipseMode(CORNER);
        noStroke();

        fill(255, 0, 0);
        for (int i = 0; i < SNAKE_LENGTH; i++){

            float pixelX = cxPixelShiftX + snakeXs[i] * cellSize;
            float pixelY = cxPixelShiftY + snakeYs[i] * cellSize;
            circle(pixelX, pixelY, cellSize);
        }

        int snakeHeadX = snakeXs[snakeHeadIndex];
        int snakeHeadY = snakeYs[snakeHeadIndex];
        snakeHeadIndex = (1 + snakeHeadIndex) % SNAKE_LENGTH; // To start from beginning

        // To control snake Xs like if else
        snakeXs[snakeHeadIndex] = min(max(snakeHeadX + snakeDx, 0), fieldWidth - 1);
        snakeYs[snakeHeadIndex] = min(max(snakeHeadY + snakeDy, 0), fieldHeight - 1);

        textAlign(CENTER, CENTER);
        textSize(25);
        float textX = width / 2f;
        float textY = 40;
        fill(255, 0, 0);
        String message = "Press Arrow Buttons";

        if (keyPressed){
            switch (keyCode){

                case UP:
                    snakeDx = 0;
                    snakeDy = -1;
                    message = "YOU PRESSED: UP";
                    break;
                case DOWN:
                    snakeDx = 0;
                    snakeDy = 1;
                    message = "YOU PRESSED: DOWN";
                    break;
                case LEFT:
                    snakeDx = -1;
                    snakeDy = 0;
                    message = "YOU PRESSED: LEFT";
                    break;
                case RIGHT:
                    snakeDx = 1;
                    snakeDy = 0;
                    message = "YOU PRESSED: RIGHT";
                    break;
            }
        }

        fill(0);
        rect(textX - textWidth("YOU PRESSED: RIGHT") / 2, textY - 12,
                textWidth("YOU PRESSED: RIGHT"), 25);
        fill(255,0,0);
        text(message, textX, textY);

        delay(30);
    }

    public boolean test(String s){
        try {
            Integer.parseInt(s);
            return Integer.parseInt(s) >= 10 && Integer.parseInt(s) <= 40;
        } catch (Exception e){
            return false;
        }
    }

    public static void main(String[] args) {

        PApplet.main("G12");
    }
}
