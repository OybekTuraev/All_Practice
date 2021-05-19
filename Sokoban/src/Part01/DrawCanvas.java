package Part01;

import javax.swing.*;
import java.awt.*;

public class DrawCanvas extends JPanel {
    private static final float CELL_GAP = 0.85f;
    private GameField field;
    private final Player player;

    DrawCanvas(GameField field, Player player) {
        this.field = field;
        this.player = player;
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        //Additional Stuff to draw
        int cellSize = (int) (Math.min(getWidth() / field.getWidth(),
                getHeight() / field.getHeight()) * CELL_GAP );
        int screenFieldWidth = field.getWidth() * cellSize;
        int screenFieldHeight = field.getHeight() * cellSize;
        int centeringShiftX = (int ) ((getWidth() - screenFieldWidth) / 2.0f);
        int centeringShiftY = (int ) ((getHeight() - screenFieldHeight) / 2.0f);

        //Game Field
        for (int y = 0; y < field.getHeight(); y++) {
            for (int x = 0; x < field.getWidth(); x++) {
                int screenX = centeringShiftX + cellSize * x;
                int screenY = centeringShiftY + cellSize * y;
                int width = 83;
                int height = 83;

                Object specificElementPosition = field.getSpecificElementPosition(x, y);

                if (specificElementPosition instanceof Brick) {
                    g.drawImage(StorePictures.getBrickImage(), screenX, screenY, width, height, null);
                }
                else if (specificElementPosition instanceof FreeZone) {
                    g.drawImage(StorePictures.getFreeZoneImage(), screenX, screenY, width, height, null);
                }
                else if (specificElementPosition instanceof RedPoint) {
                    g.drawImage(StorePictures.getFreeZoneImage(), screenX, screenY, width, height, null);
                    g.drawImage(StorePictures.getRedPointImage(), screenX, screenY, width, height, null);
                }
                else if (specificElementPosition instanceof Player) {
                    g.drawImage(StorePictures.getFreeZoneImage(), screenX, screenY, width, height, null);
                    int screenPX = centeringShiftX + cellSize * player.getX();
                    int screenPY = centeringShiftY + cellSize * player.getY();
                    g.drawImage(StorePictures.getRobotImage(), screenPX, screenPY,  null);
                }
                else if (specificElementPosition instanceof Box) {
                    g.drawImage(StorePictures.getFreeZoneImage(), screenX, screenY, width, height, null);
                    if (field.isGotoNextLevel()) {
                        g.drawImage(StorePictures.getBoxFinishImage(), screenX, screenY, width, height, null);
                    }
                    else {
                        g.drawImage(StorePictures.getBoxImage(), screenX, screenY, null);
                    }
                }
            }
        }
    }
}
