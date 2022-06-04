package DisplayUnit.Processor;

public class RaspberryPi implements Processor{
    private double price = 400;

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
}
