package example;

import example.car.CarMain;
import example.equation.EquationMain;
import example.worker.WorkerMain;

public class App {
    public static void main(String[] args) {
        WorkerMain.main(args);
        CarMain.main(args);
        EquationMain.main(args);
    }
}
