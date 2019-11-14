package hw_11.task_7;

import java.util.*;

public class ReverseTreeSetMain {
    private static final int LIST_SIZE = 100;

    public static void main(String[] args) {
        TreeSet<Integer> integerSet = new TreeSet<>();

        fillIntegerSet(integerSet);
        System.out.println("TreeSet before revers");
        System.out.println(integerSet);

        Set<Integer> reversedIntegerSet = new TreeSet<>(Collections.reverseOrder());
        reversedIntegerSet.addAll(integerSet);
        System.out.println("TreeSet after revers");
        System.out.println(reversedIntegerSet);
    }

    private static void fillIntegerSet(Set<Integer> integerSet) {
        for (int i = 0; i < LIST_SIZE; i++) {
            integerSet.add((int) (Math.random() * LIST_SIZE));
        }
    }
}
