import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class Field {
    private static final int DEFAULT_FIELD_WIDTH = 10;
    private static final int DEFAULT_FIELD_HEIGHT = 10;

    private final int width, height;

    Field() {
        this(DEFAULT_FIELD_WIDTH, DEFAULT_FIELD_HEIGHT);
    }

    Field(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int getWidth() {
        return width;
    }

    int getHeight() {
        return height;
    }

    boolean areCoordinatesInside(int x, int y) {
        return x >= 0 && x < width &&
                y >= 0 && y < height;
    }

}

class Robot {
    private int x, y;
    private final Field field;

    Robot(Field field) {
        this(field, 0,0);
    }

    Robot(Field field, int x, int y) {
        this.field = field;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    void moveLeft() {
        int nextX = x - 1;
        if (field.areCoordinatesInside(nextX, y)) {
            x = nextX;
        }
    }

    void moveRight() {
        int nextX = x + 1;
        if (field.areCoordinatesInside(nextX, y)) {
            x = nextX;
        }
    }
    void moveUp() {
        int nextY = y - 1;
        if (field.areCoordinatesInside(x, nextY)) {
            y = nextY;
        }
    }
    void moveDown() {
        int nextY = y + 1;
        if (field.areCoordinatesInside(x, nextY)) {
            y = nextY;
        }
    }
}

class RobotController extends KeyAdapter {
    private final JPanel canvas;
    private final Robot robot;

    RobotController(JPanel canvas, Robot robot) {
        this.canvas = canvas;
        this.robot = robot;
    }
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
            case KeyEvent.VK_W:
                robot.moveUp();
                canvas.repaint();
                break;
            case KeyEvent.VK_DOWN:
            case KeyEvent.VK_S:
                robot.moveDown();
                canvas.repaint();
                break;
            case KeyEvent.VK_LEFT:
            case KeyEvent.VK_A:
                robot.moveLeft();
                canvas.repaint();
                break;
            case KeyEvent.VK_RIGHT:
            case KeyEvent.VK_D:
                robot.moveRight();
                canvas.repaint();
                break;
        }
    }
}

class RobotCanvas extends JPanel {
    private static final float CELL_GAP = 0.85f;
    private final Field field;
    private final Robot robot;

    RobotCanvas(Field field, Robot robot) {
        this.field = field;
        this.robot = robot;
    }

    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        int cellSize = (int) (Math.min(getWidth() / field.getWidth(),
                getHeight() / field.getHeight()) * CELL_GAP );
        int screenFieldWidth = field.getWidth() * cellSize;
        int screenFieldHeight = field.getHeight() * cellSize;
        int centeringShiftX = (int ) ((getWidth() - screenFieldWidth) / 2.0f);
        int centeringShiftY = (int ) ((getHeight() - screenFieldHeight) / 2.0f);

        //Field
        for (int y = 0; y < field.getHeight(); y++) {
            for (int x = 0; x < field.getWidth(); x++) {
                int screenX = centeringShiftX + cellSize * x;
                int screenY = centeringShiftY + cellSize * y;

                g.setColor(((y + x) % 2 == 0) ? Color.BLACK : Color.WHITE);
                g.fillRect(screenX, screenY, cellSize, cellSize);
            }
        }

        // Robot
        /*int screenX = centeringShiftX + cellSize * robot.getX();
        int screenY = centeringShiftY + cellSize * robot.getY();

        g.setColor(Color.RED);
        g.fillOval(screenX, screenY, cellSize, cellSize);*/
    }
}

public class Example extends JFrame {
    Example() {
        setSize(400, 400);
        setLocationRelativeTo(null);
        setTitle("Fifth GUI App");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        Field field = new Field();
        Robot robot = new Robot(field);

        JPanel mainPanel = new RobotCanvas(field, robot);
        mainPanel.setBackground(Color.ORANGE);
        addKeyListener(new RobotController(mainPanel, robot));

        add(mainPanel, "Center");
    }

    public static void main(String[] args) {
        new Example().setVisible(true);
    }
}
