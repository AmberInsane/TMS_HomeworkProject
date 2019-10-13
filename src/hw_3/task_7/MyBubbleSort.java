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

        // мне кажется или код не отформатирован? кажется
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j])
                    swap(array, i, j);
            }
        }

        System.out.println("After bubble sort:");
        System.out.println(Arrays.toString(array));
    }

    // i,j - так себе имена переменных
    private static void swap(int[] arr, int leftIndex, int rightIndex) {
        int temp;
        temp = arr[leftIndex];
        arr[leftIndex] = arr[rightIndex];
        arr[rightIndex] = temp;
    }
}
