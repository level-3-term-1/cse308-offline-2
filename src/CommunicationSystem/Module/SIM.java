package CommunicationSystem.Module;

public class SIM implements Module{
    private double connectionCost = Utils.Price.SIM.getValue();

    @Override
    public double getConnectionCost() {
        return this.connectionCost;
    }

    @Override
    public void setConnectionCost(double newCost) {
        this.connectionCost = newCost;
    }
}
