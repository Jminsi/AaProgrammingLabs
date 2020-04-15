// Lab1: 1.2 Class
public class Vehicle {
    private int speed = 0; // Lab1: 1.4. Visibility (public / private / protected)
                           // Lab1: 1.5. Member datas / methods

    public Vehicle(int argSpeed) {
        speed = argSpeed;
    }

    public void drive() {  // Lab1: 1.4. Visibility (public / private / protected)
                           // Lab1: 1.5. Member datas / methods
        System.out.println("Vehicle drive() speed is " + speed);
    }

    protected int getSpeed() { // Lab1: 1.4. Visibility (public / private / protected)
        return speed;
    }
}
