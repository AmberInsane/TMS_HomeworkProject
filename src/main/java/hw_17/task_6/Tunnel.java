package hw_17.task_6;

import java.util.concurrent.Semaphore;

// не вижу смысла в этом классе, нового он ничего не добавил
public class Tunnel extends Semaphore {

    public Tunnel(int permitsNumber) {
        super(permitsNumber);
    }
}
