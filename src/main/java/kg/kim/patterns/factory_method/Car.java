package kg.kim.patterns.factory_method;

public class Car extends GroundTransport{

    public Car(String model) {
        super(model);
    }

    @Override
    public void drive() {
        System.out.println("Едет машина марки "+model);
    }

}
