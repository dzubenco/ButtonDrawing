import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;


public class CircleButton extends JPanel implements FrameContent {

    @Override
    public void draw(Graphics g) {

        int leftX = 75;
        int topY = 150;
        int width = 225;
        int height = 75;

        Graphics2D g2 = (Graphics2D) g;

        g2.drawRoundRect(leftX, topY, width, height, 30, 30);

        g2.drawString("Rounded Button", leftX + width / 2 - 45, topY + height / 2 + 5);
    }

    protected void paintComponent(Graphics g) {

        draw(g);

    }
}