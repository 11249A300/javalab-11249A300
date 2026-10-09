
import java.awt.*;
import javax.swing.*;

public class ShapeApplet extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        
        g.drawRect(30, 50, 100, 60);

        
        g.drawOval(170, 50, 80, 80);

        
        g.drawLine(30, 180, 250, 180);

        // Triangle
        int x[] = {100, 50, 150};
        int y[] = {220, 300, 300};
        g.drawPolygon(x, y, 3);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Geometric Shapes");

        f.add(new ShapeApplet());
        f.setSize(350, 380);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
