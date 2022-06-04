package DisplayUnit.Processor;


public class RaspberryPi implements Processor{
    private double price = Utils.Price.RASPBERRY_PI.getValue();

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
}
