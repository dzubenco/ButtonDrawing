import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;


public class RectangleButton extends JPanel implements FrameContent {

    @Override
    public void draw(Graphics g) {

        int leftX = 75;
        int topY = 150;
        int width = 225;
        int height = 75;

        Graphics2D g2 = (Graphics2D) g;

        g2.drawRect(leftX, topY, width, height);

        g2.drawString("Rectangle Button", leftX + width / 2 - 50, topY + height / 2 + 5);
    }

    protected void paintComponent(Graphics g) {

        draw(g);

    }
}