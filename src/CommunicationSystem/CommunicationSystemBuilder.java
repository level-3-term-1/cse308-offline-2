package CommunicationSystem;
import Utils.CommunicationOptions;

public class CommunicationSystemBuilder {
    private CommunicationSystem communicationSystem ;

    public CommunicationSystemBuilder() {
        this.communicationSystem = new CommunicationSystem();
    }

    public CommunicationSystemBuilder setModule(CommunicationOptions communicationOptions) {
        communicationSystem.setModule(communicationOptions);
        return this;
    }
    public CommunicationSystem getCommunicationSystem() {
        return communicationSystem;
    }

}
