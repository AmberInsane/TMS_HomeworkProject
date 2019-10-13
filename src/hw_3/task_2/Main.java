package hw_3.task_2;

import java.util.Arrays;

//Есть массив чисел. Найти среднее арифметическое число элементов массива
public class Main {
    public static void main(String[] args) {
        int[] array = new int[10]; // int [10] - пробел не нужен после int
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50);
        }

        System.out.println("Array is " + Arrays.toString(array));

        int sum = 0;
        for (int anArray : array) {
            sum += anArray;
        }
        double average = (double) sum / array.length;

        System.out.println("Average is " + average);
    }

}
