package Director.Builder;

import Director.Type.Optimal;
import DisplayUnit.DisplayUnit;

public class OptimalBuilder implements Builder{
    private Optimal optimal;

    public OptimalBuilder() {
        optimal = new Optimal();
    }

    @Override
    public void setDisplayUnit() {
        optimal.setDisplayUnit();
    }

    public Optimal getOptimal() {
        return optimal;
    }
}
