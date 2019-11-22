package hw_13.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// +
public class FilterMain {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hola");
        stringList.add("Hello");
        stringList.add("Hi");
        stringList.add("Privet");

        int filterStrLen = 5;
        List<String> filteredStrings = stringList.stream()
                .filter(string -> string.length() >= filterStrLen)
                .collect(Collectors.toList());

        System.out.println(filteredStrings);
    }
}
