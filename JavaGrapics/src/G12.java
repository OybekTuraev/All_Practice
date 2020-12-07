import processing.core.PApplet;

import javax.swing.*;

public class G12 extends PApplet {

                                //****      Snake Game         ****//

    final int FIELD_WIDTH = 20;
    final int FIELD_HEIGHT = 20;
    final float FIELD_CELL_SCALE = 0.8f; // how much of the window is occupied
    float column, row;

    final int SNAKE_LENGTH = 10;
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
        strokeWeight(2);


    }

    public void draw(){
        background(0    );

        // Field

        float cellSize = min(width / FIELD_WIDTH, height / FIELD_HEIGHT) * FIELD_CELL_SCALE;
        float fieldPixelWidth = FIELD_WIDTH * cellSize;
        float fieldPixelHeight = FIELD_HEIGHT * cellSize;
        float cxPixelShiftX = (width - fieldPixelWidth) / 2f;
        float cxPixelShiftY = (height - fieldPixelHeight) / 2f;

        stroke(0, 0, 255);
        fill(0, 182, 189);
        for (int y = 0; y < FIELD_HEIGHT; y++){
            for (int x = 0; x < FIELD_WIDTH; x++){
                float pixelX = cxPixelShiftX + x * cellSize;
                float pixelY = cxPixelShiftY + y * cellSize;
                square(pixelX, pixelY, cellSize);
            }
        }


        // Snake

        ellipseMode(CORNER);
        noStroke();
        fill(255, 0, 0); // need to make gradient

        for (int i = 0; i < SNAKE_LENGTH; i++){
            float pixelX = cxPixelShiftX + snakeXs[i] * cellSize;
            float pixelY = cxPixelShiftY + snakeYs[i] * cellSize;
            circle(pixelX, pixelY, cellSize);
        }


        int snakeHeadX = snakeXs[snakeHeadIndex];
        int snakeHeadY = snakeYs[snakeHeadIndex];
        // to start from beginning, repeating, index's max is 9, traverse
        snakeHeadIndex = (snakeHeadIndex + 1) % SNAKE_LENGTH;

        snakeXs[snakeHeadIndex] = min(max(snakeHeadX + snakeDx, 0), FIELD_WIDTH - 1);
        snakeYs[snakeHeadIndex] = min(max(snakeHeadY + snakeDy, 0), FIELD_HEIGHT - 1);

        if (keyPressed){

            switch (keyCode){
                case UP:
                    snakeDx = 0;
                    snakeDy = -1;
                    break;
                case DOWN:
                    snakeDx = 0;
                    snakeDy = 1;
                    break;
                case LEFT:
                    snakeDx = -1;
                    snakeDy = 0;
                    break;
                case RIGHT:
                    snakeDx = 1;
                    snakeDy = 0;
                    break;
            }
        }

        delay(50);
    }



    public static void main(String[] args) {

        PApplet.main("G12");
    }
}
