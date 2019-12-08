package hw_17.task_6;

import java.util.concurrent.Semaphore;

public class Tunnel extends Semaphore {

    public Tunnel(int permitsNumber) {
        super(permitsNumber);
    }
}
