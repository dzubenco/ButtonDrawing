
public class FrameContentFactory {

        public FrameContent createButton(String type) {
            if (type.equalsIgnoreCase("Rectangle")) {
                return new RectangleButton();
            }
            else if (type.equalsIgnoreCase("Circle")) {
                return new CircleButton();
            }
            else return null;
        }

}
