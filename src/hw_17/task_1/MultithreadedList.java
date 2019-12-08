package hw_17.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class MultithreadedList<T> {
    private List<T> list;

    private ReentrantLock locker;

    public MultithreadedList() {
        // нету особо смысла в таком конструкторе, можно сразу в месте объявления поля делать инициализацию
        list = new ArrayList<>();
        locker = new ReentrantLock();
    }

    public List<T> getList() {
        return list;
    }

    public void add(T element) {
//        https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/locks/Lock.html#tryLock()
        // у тебя не совсем корректно написана логика, if должен юыть за пределами try
        try {
            boolean isLocked = locker.tryLock(50, TimeUnit.MILLISECONDS);
            if (isLocked) {
                list.add(element);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            locker.unlock();
        }
    }
}
