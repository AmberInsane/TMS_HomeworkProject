package hw_16.task_2;

// +
public class Looper {
    private static final int MAX_NUM = 20;

    public void printNumbers() throws InterruptedException {
        for (int i = 0; i <= MAX_NUM; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            Thread.sleep(1000);
        }
    }
}
