package DisplayUnit.Display;

public class LEDDisplay implements Display{

    private double price = 30;

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
}
