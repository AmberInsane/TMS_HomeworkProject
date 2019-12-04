package hw_17.task_3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FactorialMain {
    private static final int number = 5;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        FactorialPartCalculator factorialFirstPart = new FactorialPartCalculator(1, number / 2);
        FactorialPartCalculator factorialSecondPart = new FactorialPartCalculator(number / 2 + 1, number);

        FutureTask<Long> futureFirstPart = new FutureTask<>(factorialFirstPart);
        FutureTask<Long> futureSecondPart = new FutureTask<>(factorialSecondPart);

        new Thread(futureFirstPart).start();
        new Thread(futureSecondPart).start();

        Long firstPartResult = futureFirstPart.get();
        Long secondPartResult = futureSecondPart.get();

        Long result = firstPartResult * secondPartResult;
        System.out.println(result);
    }
}
