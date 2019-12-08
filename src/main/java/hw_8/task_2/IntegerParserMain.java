package hw_8.task_2;

import java.util.InputMismatchException;
import java.util.Scanner;

//Написать метод, который бы парсил строку в число,
// обработать исключение, которое может быть при неверном формате числа
public class IntegerParserMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = null;
        boolean isCorrect = false;
        while (!isCorrect) {
            try {
                System.out.println("Put in number, please");
                // String string = scanner.next(); а лучше вынести за пределы try-catch и показывать пользователю что он ввел в блоке catch - готово
                string = scanner.next();
                int number = Integer.parseInt(string);
                isCorrect = true;
                System.out.print(number + " is nice integer");
            } catch (NumberFormatException e) {
                System.err.println(string + " is not number. Put in correct integer, please");
                scanner = new Scanner(System.in);
            }
        }
    }
}
