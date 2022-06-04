package CommunicationSystem;

import CommunicationSystem.Module.Module;
import CommunicationSystem.Module.ModuleFactory;
import CommunicationSystem.Module.SIMFactory;
import CommunicationSystem.Module.WIFIFactory;
import Director.Builder.DeluxeBuilder;
import Director.Builder.OptimalBuilder;
import Director.Builder.PoorBuilder;
import Director.Director;
import Director.Type.Deluxe;
import Director.Type.Optimal;
import Director.Type.Poor;
import DisplayUnit.DisplayUnit;
import Utils.BuildOptions;
import Utils.CommunicationOptions;

public class CommunicationSystem {
    private ModuleFactory moduleFactory;
    private Director director = new Director();


    private Module module;


    public Module getModule() {
        return module;
    }

    public double getPrice(){
        return this.module.getConnectionCost();
    }

    public void setModule(CommunicationOptions communicationOptions) {
        switch (communicationOptions){
            case SIM -> {
                moduleFactory = new SIMFactory();
            }
            case WIFI -> {
                moduleFactory = new WIFIFactory();
            }
        }

        module = moduleFactory.createModule();
    }

    public DisplayUnit connect(BuildOptions buildOptions) {

        DeluxeBuilder deluxeBuilder;
        OptimalBuilder optimalBuilder;
        PoorBuilder poorBuilder;

        switch (buildOptions) {
            case DELUXE -> {
                deluxeBuilder = new DeluxeBuilder();
                director.constructPackage(deluxeBuilder);
                Deluxe deluxe = deluxeBuilder.getDeluxe();
                return deluxe.getDisplayUnit();
            }
            case OPTIMAL -> {
                optimalBuilder = new OptimalBuilder();
                director.constructPackage(optimalBuilder);
                Optimal optimal = optimalBuilder.getOptimal();
                return optimal.getDisplayUnit();
            }
            case POOR -> {
                poorBuilder = new PoorBuilder();
                director.constructPackage(poorBuilder);
                Poor poor = poorBuilder.getPoor();
                return poor.getDisplayUnit();
            }
        }
        return null;
    }
}
