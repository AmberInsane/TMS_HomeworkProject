package hw_3.task_3;

import java.util.Arrays;

//Есть массив чисел. Заменить каждый нечетный элемент массива на 0.
public class Main {
    public static void main(String[] args) {
        int[] array = new int [10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50);
        }
        System.out.println("Array before change");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1)
                array[i] = 0;
        }

        System.out.println("Array after change");
        System.out.println(Arrays.toString(array));
    }
}
