package CommunicationSystem.Module;

public class WIFI implements Module{
    private double connectionCost = Utils.Price.WIFI.getValue();
    private double monthlyCharge = Utils.Price.WIFI_MONTHLY.getValue();

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
