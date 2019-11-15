package hw_11.task_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Создайте целочисленный ArrayList. Заполните его 100 элементами, добавляя каждый новый элемент в начало списка и выведите на экран.
//Затем удалите из него все четные элементы. И снова выведите на экран
public class ArrayList100Main {
    private static final int LIST_SIZE = 100;

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(LIST_SIZE);

        fillIntegerList(integerList);
        System.out.println(integerList);

        deleteEvenNumbers(integerList);
        System.out.println(integerList);
    }

    private static void deleteEvenNumbers(List<Integer> integerList) {
        Iterator<Integer> iterator = integerList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
    }

    private static void fillIntegerList(List<Integer> integerList) {
        for (int i = 0; i < LIST_SIZE; i++) {
            integerList.add(0, (int) (Math.random() * LIST_SIZE));
        }
    }
}
