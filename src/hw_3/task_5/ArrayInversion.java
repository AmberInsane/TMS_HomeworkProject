package hw_3.task_5;

import java.util.Arrays;

//Есть массив чисел, нужно инвертировать его порядок, т.е. массив [0,1,2,3,4] -> [4,3,2,1,0]

// +
public class ArrayInversion {
    public static void main(String[] args) {
        int buffer;
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50);
        }
        System.out.println("Array before inversion: ");
        System.out.println(Arrays.toString(array));

        int numberOfIterations = array.length / 2;

        for (int i = 0; i < numberOfIterations; i++) {
            buffer = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = buffer;
        }

        System.out.println("Array after inversion: ");
        System.out.println(Arrays.toString(array));
    }

}
