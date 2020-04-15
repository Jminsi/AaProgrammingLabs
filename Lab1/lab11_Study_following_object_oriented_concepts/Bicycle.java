// Lab1: 1.7. Interface
public class Bicycle implements PriceInterface {
    private int bikePrice = 0;

    public void setPrice(int argPrice) {
        bikePrice = argPrice;
    }

    public void printPrice() {
        System.out.println("Bike price is " + bikePrice);
    }
}
