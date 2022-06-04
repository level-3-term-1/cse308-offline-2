package Application;

import CommunicationSystem.CommunicationSystem;
import DisplayUnit.DisplayUnit;

public class PackageBuilder {
    private Package aPackage;

    public PackageBuilder() {
        aPackage = new Package();
    }

    public PackageBuilder setCommunicationSystem(CommunicationSystem communicationSystem) {
        aPackage.setCommunicationSystem(communicationSystem);
        return this;
    }

    public PackageBuilder setDisplayUnit(DisplayUnit displayUnit) {
        aPackage.setDisplayUnit(displayUnit);
        return this;
    }


    public PackageBuilder setCount(int count) {
        aPackage.setCount(count);
        return this;
    }
    public Package getaPackage() {
        return aPackage;
    }

}
