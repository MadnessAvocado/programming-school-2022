package example.car;

import example.car.factory.EngineFactory;
import example.car.impl.CoolElectronics;
import example.car.impl.CoolEngine;

public class CarMain {
    public static void main(String[] args) {

        System.out.println("*".repeat(10) + " Car " + "*".repeat(10));

        var car1 = new Car(EngineFactory.createEngine(), new CoolElectronics());
        var car2 = new Car(EngineFactory.createEngine(), new CoolElectronics());

        System.out.println("First car engine = " + car1.engine);
        System.out.println("Riding first car...");
        car1.ride();


        System.out.println("Upgrading default very chip engine...");
        car2.setEngine(new CoolEngine());

        System.out.println("Second car engine = " + car2.engine);
        System.out.println("Riding second car...");
        car2.ride();

        System.out.println();
    }

}
