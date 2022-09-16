package example.car;

public class Car {
    public Engine engine;
    private final Electronics electronics;

    public Car(Engine engine, Electronics electronics) {
        this.engine = engine;
        this.electronics = electronics;
    }

    public void ride() {
        engine.drdrdr();
        electronics.bipbip();
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
