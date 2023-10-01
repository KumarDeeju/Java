import javax.swing.*;
import java.awt.*;

public class IndiaMap extends JFrame {
    public IndiaMap() {
        super("India Map");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel for drawing the map
        MapPanel mapPanel = new MapPanel();
        add(mapPanel);

        setVisible(true);
    }

    private class MapPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Draw the map
            g.setColor(Color.GREEN);
            g.fillRect(0, 0, getWidth(), getHeight());

            g.setColor(Color.ORANGE);
            g.fillRect(0, getHeight() / 3, getWidth(), getHeight() / 3);

            g.setColor(Color.WHITE);
            g.fillOval(getWidth() / 2 - 50, getHeight() / 3 - 50, 100, 100);

            g.setColor(Color.BLUE);
            g.fillRect(0, 2 * getHeight() / 3, getWidth(), getHeight() / 3);

            g.setColor(Color.WHITE);
            g.fillOval(getWidth() / 2 - 50, 2 * getHeight() / 3 - 50, 100, 100);
        }
    }

    public static void main(String[] args) {
        new IndiaMap();
    }
}
