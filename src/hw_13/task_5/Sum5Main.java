package hw_13.task_5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Task 5 (limit, reduce)
//Есть коллекция чисел, найти произведение первых 5ти элементов.
public class Sum5Main {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 5, 12, 23, 324);

        int limitNum = 5;
        /*
проверять на макс число элементов не обязательно (только если сама хлочешь),
если коллекция будет меньше, чем число в limit() то будет использована вся коллекция без ограничений
        */
        if (integerList.size() < limitNum) {
            System.err.println("There is no " + limitNum + " elements");
        } else {
            Optional<Integer> sum = integerList.stream()
                    .limit(limitNum)
                    .reduce((x, y) -> x * y);

            if (sum.isPresent()) {
                System.out.println(sum.get());
            } else {
                System.err.println("Something went wrong");
            }
        }
    }
}
