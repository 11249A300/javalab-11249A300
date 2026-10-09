import java.awt.*;
import javax.swing.*;

public class ColorApplet extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.RED);
        g.drawRect(50, 50, 150, 70);

        g.setColor(Color.BLUE);
        g.drawOval(230, 50, 120, 70);

        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial",Font.BOLD,18));
        g.drawString("Java Applets are fun!", 50, 170);
    }

    public static void main(String[] args){
        JFrame f = new JFrame("Color Shapes");

        f.add(new ColorApplet());
        f.setSize(420,250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
