package hw_3.task_1;
/*Создать массив из 3 элементов.
При помощи класса сканер и пользователя заполнить его.
Вывести сумму, наименьшее и наибольшее из чисел на экран
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[3];

        Scanner scanner = new Scanner(System.in);

        // я у кого-то в ДЗ видел try-catch, скорее всего это была ты, а, значит, стоит его применять
        // тем более здесь получим исключение, если пользователь введет не число
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Put in integer number " + (i + 1) + ":");
            intArray[i] = scanner.nextInt();
        }

        int maxInt = intArray[0];
        int minInt = intArray[0];
        int sumInt = 0;

        for (int i = 1; i < intArray.length; i++) {

            if (intArray[i] < minInt) // всегда используй {}
                minInt = intArray[i];
            else if (intArray[i] > maxInt)// {}, я бы лучше разделил на 2 if вместо if-else-if, но это не ошибка
                maxInt = intArray[i];

            sumInt += intArray[i];
        }

        System.out.println("Sum is " + sumInt);
        System.out.println("Min is " + minInt);
        System.out.println("Max is " + maxInt);
// пустая строка не нужна
    }
}
