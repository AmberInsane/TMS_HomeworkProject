package hw_12.task_3;

import java.util.function.BinaryOperator;

public class MultiplyOperatorMain {
    public static void main(String[] args) {
        BinaryOperator<Integer> multiplyOperator = (x, y) -> x * y;
        System.out.println(multiplyOperator.apply(5,1235));
    }
}
