package CommunicationSystem.Module;

public class SIM implements Module{
    private double connectionCost = Utils.Price.SIM.getValue();
    private double monthlyCharge = Utils.Price.SIM_MONTHLY.getValue();

    @Override
    public double getConnectionCost() {
        return this.connectionCost;
    }

    @Override
    public double getMonthlyCharge() {
        return monthlyCharge;
    }

    @Override
    public void setConnectionCost(double newCost) {
        this.connectionCost = newCost;
    }
}
