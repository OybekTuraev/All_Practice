package Part01;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyController extends KeyAdapter {
    private final JPanel canvas;
    private final Player player;
    private final GameField field;

    KeyController(JPanel canvas, GameField field) {
        this.canvas = canvas;
        this.player = field.startPlayer();
        this.field = field;
    }

    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
            case KeyEvent.VK_W:
                player.moveUp();
                canvas.repaint();
                break;
            case KeyEvent.VK_DOWN:
            case KeyEvent.VK_S:
                player.moveDown();
                canvas.repaint();
                break;
            case KeyEvent.VK_LEFT:
            case KeyEvent.VK_A:
                player.moveLeft();
                canvas.repaint();
                break;
            case KeyEvent.VK_RIGHT:
            case KeyEvent.VK_D:
                player.moveRight();
                canvas.repaint();
                break;
        }

        if (field.isGotoNextLevel()) {
            JOptionPane.showMessageDialog(null, "Congratulations!");
            field.nextLevel();
            canvas.repaint();
        }
    }
}
