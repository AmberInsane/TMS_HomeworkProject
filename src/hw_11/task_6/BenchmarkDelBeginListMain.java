package hw_11.task_6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Есть ArrayList и LinkedList на 100К одинаковых элементов.
//Нужно написать бенчмарк, который бы показал скорость удаления из НАЧАЛА у двух этих листов
//Удалить нужно все элементы
//AL 467, LL 3 <= при удалении из AL нулевого элемента массив сдвигается
public class BenchmarkDelBeginListMain {
    private static final int LIST_SIZE = 100000;

    public static void main(String[] args) {
        List<Integer> integerArrayList = new ArrayList<>(LIST_SIZE);
        fillIntegerList(integerArrayList);

        List<Integer> integerLinkedList = new LinkedList<>(integerArrayList);

        System.out.println("Time for deleting from ArrayList is " + calcDelBeginTime(integerArrayList));
        System.out.println("Time for deleting from LinkedList is " + calcDelBeginTime(integerLinkedList));
    }

    private static void fillIntegerList(List<Integer> integerList) {
        for (int i = 0; i < LIST_SIZE; i++) {
            integerList.add(0, (int) (Math.random() * LIST_SIZE));
        }
    }

    // замени на while, константа в таком цикле смотрится странно
    private static long calcDelBeginTime(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        while (!list.isEmpty()) {
            list.remove(0);
        }
        return System.currentTimeMillis() - startTime;
    }
}
