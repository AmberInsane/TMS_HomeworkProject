package hw_8.task_1;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Создать метод, который бы делил одно число на другое, обработать исключение при делении на 0.
И вывести пользователю сообщение о том, что на 0 делить нельзя
 */
// цикла не хватает, чтобы можно было ввести заново
// готово
public class ZeroExceptionMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrect = false;
        while (!isCorrect) {
            try {
                int firstNumber;
                int secondNumber;
                System.out.println("Put in first number");
                firstNumber = scanner.nextInt();
                System.out.println("Put in second number");
                secondNumber = scanner.nextInt();
                System.out.println(firstNumber + "/" + secondNumber + " = " + ((double) firstNumber / (double) secondNumber));
                isCorrect = true;
            } catch (ArithmeticException e) {
                System.err.println("Don't divide by zero");
                scanner = new Scanner(System.in);
            } catch (InputMismatchException e) {
                System.err.println("Put in correct integer, please");
                scanner = new Scanner(System.in);
            }
        }
    }
}
