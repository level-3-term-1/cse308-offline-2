package CommunicationSystem.Module;

public class SIMFactory implements ModuleFactory{
    @Override
    public Module createModule() {
        return new SIM();
    }
}
