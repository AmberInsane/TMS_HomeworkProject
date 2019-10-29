package hw_8.task_2;

import java.util.InputMismatchException;
import java.util.Scanner;

//Написать метод, который бы парсил строку в число,
// обработать исключение, которое может быть при неверном формате числа
public class IntegerParserMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String string;
            System.out.println("Put in number, please");
            string = scanner.next();
            int number = Integer.parseInt(string);
            System.out.print(number + " is nice integer");
        } catch (NumberFormatException e) {
            System.err.print("Put in correct integer next time, please");
        }
    }
}
