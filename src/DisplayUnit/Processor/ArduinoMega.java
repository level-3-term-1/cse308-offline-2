package DisplayUnit.Processor;

public class ArduinoMega implements Processor{
    private double price = 200;

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
}
