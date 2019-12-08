package hw_17.task_1;

// +
public class MultithreadedListMain {
    public static void main(String[] args) throws InterruptedException {
        MultithreadedList<String> list = new MultithreadedList<>();

        Runnable runnable = () -> {
            for (int i = 0; i < 100; i++) {
                list.add("abc");
            }
        };

        Thread thread = new Thread(runnable);
        Thread anotherThread = new Thread(runnable);

        thread.start();
        anotherThread.start();

        thread.join();
        anotherThread.join();

        System.out.println(list.getList().size());
    }
}
