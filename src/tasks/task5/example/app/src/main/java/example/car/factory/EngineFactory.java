package example.car.factory;

import example.car.Engine;
import example.car.impl.VeryChipEngine;

final public class EngineFactory {
    public Engine createEngine() {
        return new VeryChipEngine();
    }
}
