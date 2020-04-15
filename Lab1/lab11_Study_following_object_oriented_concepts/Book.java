// Lab1: 1.7. Interface
public class Book implements PriceInterface {
    private int bookPrice = 0;

    public void setPrice(int argPrice) {
        bookPrice = argPrice;
    }

    public void printPrice() {
        System.out.println("Book price is " + bookPrice);
    }
}
