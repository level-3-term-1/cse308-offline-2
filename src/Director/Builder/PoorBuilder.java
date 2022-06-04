package Director.Builder;

import Director.Type.Poor;
import DisplayUnit.DisplayUnit;

public class PoorBuilder implements Builder{
    private Poor poor;

    public PoorBuilder() {
        poor = new Poor();
    }

    @Override
    public void setDisplayUnit() {
        poor.setDisplayUnit();
    }

    public Poor getPoor() {
        return poor;
    }
}
