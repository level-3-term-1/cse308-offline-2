package Director.Builder;

import Director.Type.Deluxe;
import DisplayUnit.DisplayUnit;
import DisplayUnit.DisplayUnitBuilder;
import Utils.Display;
import Utils.Processor;

public class DeluxeBuilder implements Builder{
    private Deluxe deluxe;

    public DeluxeBuilder() {
        this.deluxe = new Deluxe();
    }

    @Override
    public void setDisplayUnit() {
        deluxe.setDisplayUnit();
    }

    public Deluxe getDeluxe() {
        return deluxe;
    }
}
