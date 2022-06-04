package DisplayUnit.Display;

public class LEDDisplayFactory implements DisplayFactory{
    @Override
    public Display createDisplay() {
        return new LEDDisplay();
    }
}
