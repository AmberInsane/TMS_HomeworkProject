package hw_17.task_3;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class FactorialMain {
    private static final int number = 10;
    private static final int threadsNumber = 2;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(threadsNumber);

        FactorialPartCalculator factorialFirstPart = new FactorialPartCalculator(1, number / 2);
        FactorialPartCalculator factorialSecondPart = new FactorialPartCalculator(number / 2 + 1, number);

        List<Future<Long>> futures = executorService.invokeAll(Arrays.asList(factorialFirstPart, factorialSecondPart));

        Long factorial = futures.get(0).get();
        for (int i = 1; i < futures.size(); i++) {
            factorial *= futures.get(i).get();
        }

        System.out.println(factorial);

        executorService.awaitTermination(500, TimeUnit.MILLISECONDS);
        executorService.shutdownNow();
    }
}
