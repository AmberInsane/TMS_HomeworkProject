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
        int maxInt = 0;
        int minInt = 0;
        int sumInt = 0;
        int temp;
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Put in integer number " + (i + 1) + ":");
            intArray[i] = scanner.nextInt();
        }
        /*
        if (i == 0) {
            maxInt = temp;
            minInt = temp;
        }
        else if (temp < minInt)
            minInt = temp;
        else if (temp > maxInt)
            maxInt = temp;

        sumInt += temp;
        intArray[i] = temp;

        System.out.println("Sum is " + sumInt);
        System.out.println("Min is " + minInt);
        System.out.println("Max is " + maxInt);*/
    }
}
