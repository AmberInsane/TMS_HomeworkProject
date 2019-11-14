package hw_11.task_5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Есть ArrayList и LinkedList на 100К одинаковых элементов.
//Нужно написать бенчмарк, который бы показал скорость удаления из СЕРЕДИНЫ у двух этих листов
//Удалить нужно все элементы
//AL 219, LL 3571 <= в AL доступ по индексу быстрее
public class BenchmarkDelMidListMain {
    private static final int LIST_SIZE = 100000;

    public static void main(String[] args) {
        List<Integer> integerArrayList = new ArrayList<>(LIST_SIZE);
        fillIntegerList(integerArrayList);

        List<Integer> integerLinkedList = new LinkedList<>(integerArrayList);

        System.out.println("Time for deleting from ArrayList is " + calcDelMidTime(integerArrayList));
        System.out.println("Time for deleting from LinkedList is " + calcDelMidTime(integerLinkedList));
    }

    private static void fillIntegerList(List<Integer> integerList) {
        for (int i = 0; i < LIST_SIZE; i++) {
            integerList.add(0, (int) (Math.random() * LIST_SIZE));
        }
    }

    private static long calcDelMidTime(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < LIST_SIZE; i++) {
            list.remove(list.size() / 2);
        }
        return System.currentTimeMillis() - startTime;
    }
}
