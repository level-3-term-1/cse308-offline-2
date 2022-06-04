package DisplayUnit.Processor;

public interface Processor {
    double getPrice();
    void setPrice(double newPrice);

    default void abcd() {
        System.out.println("abcd");
    }
}
