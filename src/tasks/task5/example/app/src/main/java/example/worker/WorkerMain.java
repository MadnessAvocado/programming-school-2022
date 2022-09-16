package example.worker;

import example.worker.impl.AndreySuperDuperWorker;
import example.worker.impl.SemenSuperDuperWorker;

import java.util.List;

public class WorkerMain {
    public static void main(String[] args) {
        System.out.println("*".repeat(10) + " Worker " + "*".repeat(10));

        var andrey = new AndreySuperDuperWorker();
        var semen = new SemenSuperDuperWorker();

        List<SuperDuperWorker> workers = List.of(andrey, semen);

        for (var worker : workers) {
            worker.doWork();
        }

        System.out.println();
    }
}
