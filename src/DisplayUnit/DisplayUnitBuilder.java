package DisplayUnit;

import Utils.Display;
import Utils.Processor;

public class DisplayUnitBuilder {

    private DisplayUnit displayUnit ;

    public DisplayUnitBuilder() {
        this.displayUnit = new DisplayUnit();
    }

    public DisplayUnitBuilder setProcessor(Processor processor) {
        this.displayUnit.setProcessor(processor);
        return this;
    }

    public DisplayUnitBuilder setDisplay(Display display) {
        this.displayUnit.setDisplay(display);
        return this;
    }

    public DisplayUnit getDisplayUnit() {
        return displayUnit;
    }
}
