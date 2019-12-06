package hw_17.task_3;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class FactorialMain {
    private static final int number = 10;
    private static final int threadsNumber = 2;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(threadsNumber);

        List<Callable<Long>> tasksList = new ArrayList<>();

        for (int i = 0; i < threadsNumber; i++) {
           tasksList(new FactorialPartCalculator((i * number / threadsNumber) + 1, (i + 1) * number / threadsNumber));
        //FactorialPartCalculator factorialSecondPart = new FactorialPartCalculator(number / 2 + 1, number)
        }

        List<Future<Long>> futures = executorService.invokeAll(tasksList);

        Long factorial = futures.get(0).get();
        for (int i = 1; i < futures.size(); i++) {
            factorial *= futures.get(i).get();
        }

        System.out.println(factorial);

        executorService.awaitTermination(500, TimeUnit.MILLISECONDS);
        executorService.shutdownNow();
    }
}
