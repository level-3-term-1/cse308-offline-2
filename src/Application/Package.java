package Application;

import CommunicationSystem.CommunicationSystem;
import DisplayUnit.DisplayUnit;

public class Package {
    private CommunicationSystem communicationSystem;
    private DisplayUnit displayUnit;
    private int count;

    public CommunicationSystem getCommunicationSystem() {
        return communicationSystem;
    }

    public void setCommunicationSystem(CommunicationSystem communicationSystem) {
        this.communicationSystem = communicationSystem;
    }

    public DisplayUnit getDisplayUnit() {
        return displayUnit;
    }

    public void setDisplayUnit(DisplayUnit displayUnit) {
        this.displayUnit = displayUnit;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
