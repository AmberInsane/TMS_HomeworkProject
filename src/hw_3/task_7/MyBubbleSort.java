package hw_3.task_7;
//Есть целочисленный неотсортированный массив. Отсортируйте его "пузырьком". Попробуйте сами написать и затем посмотрите реализацию

import java.util.Arrays;

public class MyBubbleSort {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50);
        }

        System.out.println("Before bubble sort:");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j])
                    swap(array, i, j);
            }

        }

        System.out.println("After bubble sort:");
        System.out.println(Arrays.toString(array));
    }

    private static void swap(int[] arr, int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
