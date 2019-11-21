package hw_13.task_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//Task 2 (max, String::compareTo / Comparator.naturalOrder())
//Есть коллекция строк, нужно найти строку с максимальной длинной.
public class MinLenMain {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hola");
        stringList.add("Hello");
        stringList.add("Hi");
        stringList.add("Privet");

        Optional<String> maxStr = stringList.stream().max(Comparator.naturalOrder());
        System.out.println("The longest string is " + maxStr.get());
    }
}
