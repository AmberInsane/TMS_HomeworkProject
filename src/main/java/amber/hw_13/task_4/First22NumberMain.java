package hw_13.task_4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Task 4 (filter + findFirst)
//Есть коллекция чисел, найти первое, которое будет больше 22.
public class First22NumberMain {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 5, 12, 22, 93, 23, 123);

        int minVal = 22;

        Optional<Integer> firstNum = findNum(integerList, minVal);

        if (firstNum.isPresent()) {
            System.out.println(firstNum.get());
        } else {
            System.out.println("Not found");
        }
    }

    private static Optional<Integer> findNum(List<Integer> list, int minInt) {
        Optional<Integer> firstNum = list.stream()
                .filter(x -> x > minInt)
                .findFirst();

        /*
        у тебя firstNum будет или со значением или Optional.empty, проверка не нужна
        return firstNum;
        */
        if (firstNum.isEmpty()) {
            return Optional.empty();
        }
        return firstNum;
    }
}
