package hw_12.task_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// +
public class ReversSortMain {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("hello");
        strings.add("world");
        strings.add("hell");
        strings.add("lol");
        System.out.println(strings);

        strings.sort((a, b) -> b.compareTo(a));
        System.out.println(strings);
    }
}
