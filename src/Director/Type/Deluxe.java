package Director.Type;

import DisplayUnit.DisplayUnit;
import DisplayUnit.DisplayUnitBuilder;
import Utils.Display;
import Utils.Processor;

public class Deluxe {
    private DisplayUnit displayUnit;

    public DisplayUnit getDisplayUnit() {
        return displayUnit;
    }

    public void setDisplayUnit() {
        DisplayUnitBuilder displayUnitBuilder = new DisplayUnitBuilder().setDisplay(Display.LCD).setProcessor(Processor.RASPBERRY_PI);
        displayUnit = displayUnitBuilder.getDisplayUnit();
    }
}
