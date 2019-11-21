package hw_12.task_5;

import hw_12.task_4.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class ListUserRemMain {
    public static void main(String[] args) {
        String pattern = "([APE])(.*)";
        Predicate<String> filter = name -> name.matches(pattern);

        // думаю это хороший пример для использования Consumer
       /* UnaryOperator<List<User>> userFilter = list -> {
            list.removeIf(nextUser -> filter.test(nextUser.getName()));
            return list;
        };*/

        Consumer<List<User>> userFilter = list -> {
            list.removeIf(nextUser -> filter.test(nextUser.getName()));
        };


        List<User> userList = new ArrayList<>();
        userList.add(new User("Ann"));
        userList.add(new User("Ololo"));
        userList.add(new User("Zenda"));
        userList.add(new User("John"));
        userList.add(new User("Peppa"));
        userList.add(new User("Elizabeths"));

        System.out.println(userList);
        userFilter.accept(userList);
        System.out.println(userList);
    }
}
