package hw_2.task_7;
/*
Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
 */

// +
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 99; i = i + 2) {
            sum += i;
        }
        System.out.println("Sum of odd numbers from 1 to 99 is " + sum);
    }
}
