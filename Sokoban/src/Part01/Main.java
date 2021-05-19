package Part01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main extends JFrame {
    Main() {
        GameField field = new GameField();
        setSize(1650, 1080);
        setLocationRelativeTo(null);
        setTitle(String.format("Level: %d", field.getCurrentLevel()));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel mainPanel = new DrawCanvas(field, field.startPlayer());
        /*mainPanel.setFocusable(true);
        mainPanel.requestFocus();*/
        mainPanel.setBackground(Color.CYAN);
        add(mainPanel, "Center");
        addKeyListener(new KeyController(mainPanel, field));

        JPanel toolBar = new JPanel();
        toolBar.setBackground(Color.DARK_GRAY);
        add(toolBar, "East");

       /* JButton restartButton = new JButton("Restart");
        restartButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                field.restart();
                repaint();
            }
        });

        toolBar.add(restartButton);*/
    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}