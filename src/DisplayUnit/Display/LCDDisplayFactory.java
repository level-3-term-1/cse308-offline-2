package DisplayUnit.Display;

public class LCDDisplayFactory implements DisplayFactory{
    @Override
    public Display createDisplay() {
        return new LCDDisplay();
    }
}
