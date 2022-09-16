package example.worker.impl;

import example.worker.SuperDuperWorker;

public class AndreySuperDuperWorker implements SuperDuperWorker {
    @Override
    public void doWork() {
        System.out.println("Andrey is working now...");
    }
}
