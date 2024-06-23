package kg.kim.patterns.factory_method;

public class Main {
    public static void main(String[] args) {
        GroundTransport transport = new Car("Волга");
        transport.drive();
        transport = new MotorBike("Rocker bike");
        transport.drive();
        transport = new Bike("Mountain bike");
        transport.drive();
    }
}
