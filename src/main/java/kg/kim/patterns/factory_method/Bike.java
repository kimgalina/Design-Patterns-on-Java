package kg.kim.patterns.factory_method;

public class Bike extends GroundTransport{
    public Bike(String model) {
        super(model);
    }

    @Override
    public void drive() {
        System.out.println("Едет велосипед марки " + model);
    }

}
