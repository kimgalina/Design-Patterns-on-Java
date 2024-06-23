package kg.kim.patterns.factory_method;

public abstract class GroundTransport {
    protected String model;
    public GroundTransport (String model) {
        this.model = model;
    }

    public abstract void drive(); // фабричный метод
}
