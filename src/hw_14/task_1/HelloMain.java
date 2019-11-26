package hw_14.task_1;

import java.util.Scanner;

// +
public class HelloMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Print in your name, please");
        String name = scanner.next();

        System.out.println("Print in your programming language");
        String language = scanner.next();

        System.out.format("Hello, my name is %s. " +
                "I'm %s developer and I'm glad to become a part of your company.", name, language);
    }
}
