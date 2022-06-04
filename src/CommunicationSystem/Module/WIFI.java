package CommunicationSystem.Module;

public class WIFI implements Module{
    private double connectionCost;

    @Override
    public double getConnectionCost() {
        return this.connectionCost;
    }

    @Override
    public void setConnectionCost(double newCost) {
        this.connectionCost = newCost;
    }
}
