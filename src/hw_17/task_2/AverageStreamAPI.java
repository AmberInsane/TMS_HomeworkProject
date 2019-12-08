package hw_17.task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

// +
public class AverageStreamAPI {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        int length = 10;

        for (int i = 0; i < length; i++) {
            numbers.add(i);
        }

        OptionalDouble average = numbers.stream().mapToInt(x -> x).average();
        System.out.println("average is " + average.getAsDouble());
    }
}
