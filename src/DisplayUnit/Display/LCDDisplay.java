package DisplayUnit.Display;

public class LCDDisplay implements Display{

    private double price = 50;

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
}
