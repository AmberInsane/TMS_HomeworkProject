package hw_12.task_5;

import hw_12.task_4.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.UnaryOperator;

public class ListUserRemMain {
    public static void main(String[] args) {
        UnaryOperator<List<User>> userFilter = list -> {
            Iterator<User> iterator = list.iterator();
            String pattern = "([APE])(.*)";
            while (iterator.hasNext()) {
                User nextUser = iterator.next();
                if (nextUser.getName().matches(pattern)) {
                    iterator.remove();
                }
            }
            return list;
        };

        List<User> userList = new ArrayList<>();
        userList.add(new User("Ann"));
        userList.add(new User("Ololo"));
        userList.add(new User("Zenda"));
        userList.add(new User("John"));
        userList.add(new User("Peppa"));
        userList.add(new User("Elizabeths"));

        System.out.println(userList);
        System.out.println(userFilter.apply(userList));
    }
}
