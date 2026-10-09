
import java.awt.*;
import javax.swing.*;

public class FaceApplet extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        
        g.setColor(Color.YELLOW);
        g.fillOval(100, 50, 180, 200);

        
        g.setColor(Color.BLACK);
        g.fillOval(145, 110, 20, 20);
        g.fillOval(215, 110, 20, 20);

        
        g.drawLine(190, 130, 175, 165);
        g.drawLine(175, 165, 195, 165);

        
        g.drawArc(150, 165, 80, 45, 180, 180);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Human Face");

        f.add(new FaceApplet());
        f.setSize(400, 350);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
