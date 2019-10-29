package hw_8.task_1;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Создать метод, который бы делил одно число на другое, обработать исключение при делении на 0.
И вывести пользователю сообщение о том, что на 0 делить нельзя
 */
public class ZeroExceptionMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int firstNumber;
            int secondNumber;
            System.out.println("Put in first number");
            firstNumber = scanner.nextInt();
            System.out.println("Put in second number");
            secondNumber = scanner.nextInt();
            System.out.println(firstNumber + "/" + secondNumber + " = " + (firstNumber / secondNumber));
        } catch (ArithmeticException e) {
            System.err.print("Don't divide by zero");
        } catch (InputMismatchException e) {
            System.err.print("Put in correct integer, please");
        }
    }
}
