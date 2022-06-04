package Application;

import CommunicationSystem.CommunicationSystem;
import CommunicationSystem.CommunicationSystemBuilder;
import DisplayUnit.DisplayUnit;
import Utils.BuildOptions;
import Utils.CommunicationOptions;

import java.util.ArrayList;

public class Application {

    ArrayList<Package> packages = new ArrayList<>();

    public void addToQueue(BuildOptions buildOptions, CommunicationOptions communicationOptions, int c) {
        CommunicationSystemBuilder communicationSystemBuilder = new CommunicationSystemBuilder().setModule(communicationOptions);
        CommunicationSystem communicationSystem = communicationSystemBuilder.getCommunicationSystem();
        DisplayUnit displayUnit = communicationSystem.connect(buildOptions);
        Package pk =  new PackageBuilder().setDisplayUnit(displayUnit).setCommunicationSystem(communicationSystem).setCount(c).getaPackage();
        packages.add(pk);

        showCost(pk);
        showDescription(pk);
    }

    private void showDescription(Package pk) {

    }

    private void showCost(Package pk) {
        System.out.println("cost of this order: " + this.costForSingleOrder(pk));
    }

    public double costForSingleOrder(Package pk){
        return pk.getCommunicationSystem().getPrice() + pk.getDisplayUnit().getCost() * pk.getCount();
    }
}
