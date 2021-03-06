package hw_16.task_2;

public class LooperMain {
    public static void main(String[] args) throws InterruptedException {
        Looper mainLooper = new Looper();

        // я думаю можно было класс Looper сделать Runnable, тогда не пришлось бы дополнительно код писать с лямбдой
        Runnable runnableLoop = () -> {
            try {
                new Looper().printNumbers();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread loopThread = new Thread(runnableLoop);
        loopThread.setName("Loop thread");

        mainLooper.printNumbers();
        loopThread.start();

        loopThread.join();
        System.out.println("End of main thread");
    }
}
