package DisplayUnit.Processor;


public class ArduinoMega implements Processor{
    private double price = Utils.Price.ARDUINO_MEGA.getValue();

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
}
