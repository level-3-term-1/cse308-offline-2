package CommunicationSystem.Module;

public class WIFIFactory implements ModuleFactory{
    @Override
    public Module createModule() {
        return new WIFI();
    }
}
