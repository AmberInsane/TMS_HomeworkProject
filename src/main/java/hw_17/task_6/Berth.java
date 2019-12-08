package hw_17.task_6;

import java.util.concurrent.Semaphore;

public class Berth extends Semaphore {
    private long unloadTimePerTon;

    public Berth(int permits, int unloadTimePerTon) {
        super(permits, true);
        this.unloadTimePerTon = unloadTimePerTon;
    }

    public long getUnloadTimePerTon() {
        return unloadTimePerTon;
    }
}
