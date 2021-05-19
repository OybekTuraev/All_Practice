package Part01;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class StorePictures {
    private static BufferedImage robotImage;
    private static BufferedImage boxImage;
    private static BufferedImage boxFinishImage;
    private static BufferedImage brickImage;
    private static BufferedImage redPointImage;
    private static BufferedImage freeZoneImage;

    //Initialization Block
    static {
        try {
            robotImage = ImageIO.read(new File("images\\Robot.png"));
            boxImage = ImageIO.read(new File("images\\BoxBlue.png"));
            boxFinishImage = ImageIO.read(new File("images\\BoxRed.png"));
            brickImage = ImageIO.read(new File("images\\Wall.png"));
            redPointImage = ImageIO.read(new File("images\\Goal.png"));
            freeZoneImage = ImageIO.read(new File("images\\Ground.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    StorePictures() {
        super();
    }

    static BufferedImage getRobotImage() {
        return robotImage;
    }

    static BufferedImage getBoxImage() {
        return boxImage;
    }

    static BufferedImage getBoxFinishImage() { return boxFinishImage; }

    static BufferedImage getBrickImage() {
        return brickImage;
    }

    static BufferedImage getRedPointImage() {
        return redPointImage;
    }

    static BufferedImage getFreeZoneImage() { return freeZoneImage; }
}
