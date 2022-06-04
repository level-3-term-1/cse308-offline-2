package Director.Type;

import DisplayUnit.DisplayUnit;
import DisplayUnit.DisplayUnitBuilder;
import Utils.Display;
import Utils.Processor;

public class Optimal {
    private DisplayUnit displayUnit;

    public DisplayUnit getDisplayUnit() {
        return displayUnit;
    }

    public void setDisplayUnit() {
        DisplayUnitBuilder displayUnitBuilder = new DisplayUnitBuilder().setDisplay(Display.LED).setProcessor(Processor.ARDUINO_MEGA);
        displayUnit = displayUnitBuilder.getDisplayUnit();
    }
}
