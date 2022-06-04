package CommunicationSystem.Module;

public interface Module {
    double getConnectionCost();
    double getMonthlyCharge();
    void setConnectionCost(double newCost);
}
