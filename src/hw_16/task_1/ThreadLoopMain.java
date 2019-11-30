package hw_16.task_1;

public class ThreadLoopMain {
    public static void main(String[] args) throws InterruptedException {
        int maxNumOfLoop = 10;

        Runnable runnableLoop = () -> {
            for (int i = 0; i <= maxNumOfLoop; i++) {
                System.out.println(i);
            }
        };

        Thread threadLoop = new Thread(runnableLoop);
        threadLoop.start();

        threadLoop.join();
        System.out.println("Main thread end");
    }
}
