// Lab1: 1.6. Inheritance
public class Motorcycle extends Vehicle {
    private double fuelAmount = 0;

    public Motorcycle(int argSpeed) {
        super(argSpeed);
    }

    public void drive() { // Lab1: 1.9. Overriding
        System.out.println("Motorcycle drive() speed is " + super.getSpeed());
    }

    public void setFuelAmount(int argFuel) { // Lab1: 1.8. Polymorphism
        fuelAmount = (double)argFuel;
    }

    public void setFuelAmount(double argFuel) { // Lab1: 1.8. Polymorphism
        fuelAmount = argFuel;
    }
}
