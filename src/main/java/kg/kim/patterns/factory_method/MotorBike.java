package kg.kim.patterns.factory_method;

public class MotorBike extends GroundTransport{

    public MotorBike(String model) {
        super(model);
    }

    @Override
    public void drive() {
        System.out.println("Едет мотоцикл марки " + model);
    }

}
