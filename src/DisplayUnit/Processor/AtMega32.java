package DisplayUnit.Processor;

public class AtMega32 implements Processor{
    private double price = Utils.Price.ATMEGA_32.getValue();

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
}
