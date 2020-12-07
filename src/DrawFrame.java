import java.awt.Component;
import javax.swing.JFrame;

public class DrawFrame extends JFrame {

    public static final int DEFAULT_WIDTH = 400;
    public static final int DEFAULT_HEIGHT = 400;

    public DrawFrame() {
        setTitle("Test frame for a button");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }

    public DrawFrame(String type) {
        setTitle("Test frame for a button");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        FrameContentFactory factory = new FrameContentFactory();

        FrameContent button = factory.createButton(type);

        add((Component) button);
    }

}
