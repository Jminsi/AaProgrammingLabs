public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(100); // Lab1: 1.3. Instantiation of object (creating an object)
        vehicle.drive(); // Lab1: 1.1. vehicle Object
        
        Motorcycle motorcycle = new Motorcycle(150);
        motorcycle.setFuelAmount(10); // Lab1: 1.8. Polymorphism
        motorcycle.setFuelAmount(10.5); // Lab1: 1.8. Polymorphism

        Vehicle motorcycleVehicle = motorcycle;
        motorcycleVehicle.drive(); //Lab1: 1.9. Overriding

        // Lab1: 1.7 Interface
        Bicycle bicycle = new Bicycle();
        bicycle.setPrice(500);
        bicycle.printPrice();

        // Lab1: 1.7 Interface
        Book book = new Book();
        book.setPrice(20);
        book.printPrice();

        // Lab1: 1.10. Abstract classes
        School school = new School();
        school.printAddress();
    }

}
