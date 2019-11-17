package hw_12.task_4;

import java.util.Scanner;
import java.util.function.Supplier;
import java.util.regex.Pattern;

public class LambdaUserMain {
    public static void main(String[] args) {
        Supplier<User> newUser = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Put in student's name");
            String name = scanner.nextLine();
            if (name.matches("[a-zA-Z]+")) {
                return new User(name);
            } else {
                System.err.println("Put in correct name");
                return null;
            }
        };

        User user = newUser.get();
        System.out.println(user);
    }
}
