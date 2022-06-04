package Application;

import CommunicationSystem.CommunicationSystem;
import CommunicationSystem.CommunicationSystemBuilder;
import DisplayUnit.DisplayUnit;
import Utils.BuildOptions;
import Utils.CommunicationOptions;

import java.util.ArrayList;

public class Application {

    private double price = Utils.Price.APPLICATION.getValue();

    ArrayList<Package> packages = new ArrayList<>();

    public void addToQueue(BuildOptions buildOptions, CommunicationOptions communicationOptions, int c) {
        CommunicationSystemBuilder communicationSystemBuilder = new CommunicationSystemBuilder().setModule(communicationOptions);
        CommunicationSystem communicationSystem = communicationSystemBuilder.getCommunicationSystem();
        DisplayUnit displayUnit = communicationSystem.connect(buildOptions);
        Package pk =  new PackageBuilder().setDisplayUnit(displayUnit).setCommunicationSystem(communicationSystem).setCount(c).getaPackage();
        packages.add(pk);

        showYearlyCost(pk);
        showDescription(pk);
    }

    private void showDescription(Package pk) {
        System.out.println(
                "processor: " + pk.getDisplayUnit().getProcessor().getClass().getSimpleName() + '\n' +
                "display: " + pk.getDisplayUnit().getDisplay().getClass().getSimpleName() + '\n' +
                "network: " + pk.getCommunicationSystem().getModule().getClass().getSimpleName()
        );
    }

    private void showYearlyCost(Package pk) {
        System.out.println("cost of this order(annual): " + this.annualCostForSingleOrder(pk));
    }

    public double annualCostForSingleOrder(Package pk){
        return pk.getCommunicationSystem().getPrice() + pk.getDisplayUnit().getCost() * pk.getCount() + this.price + pk.getCommunicationSystem().getMonthlyCharge() * 12;
    }

    public void showAllOrder() {
        for (int i = 0; i < packages.size(); i++) {
            System.out.println("-----------------------------------------------");
            System.out.println("annual cost of order " + (i + 1) + ": " + annualCostForSingleOrder(packages.get(i)));
            showDescription(packages.get(i));
            System.out.println("-----------------------------------------------");
        }
    }
}
