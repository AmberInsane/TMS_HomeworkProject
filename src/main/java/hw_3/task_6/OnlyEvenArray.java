package hw_3.task_6;
//Есть массив чисел. Необходимо создать другой массив содержащий только четные элементы из первого

import java.util.Arrays;

public class OnlyEvenArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50);
        }

        Integer[] evenArrWithNulls = new Integer[array.length];
        int numberOfCopiedElements = 0;

        for (int anArray : array) {
            if (anArray % 2 == 0) {
                evenArrWithNulls[numberOfCopiedElements++] = anArray;
            }
        }

        System.out.println("Array before changes: ");
        System.out.println(Arrays.toString(array));

        int[] onlyEvenArr = new int[numberOfCopiedElements];
        for (int i = 0; i < numberOfCopiedElements; i++) {
            onlyEvenArr[i] = evenArrWithNulls[i];
        }
        System.out.println("Array with only even integers: ");
        System.out.println(Arrays.toString(onlyEvenArr));
    }
}
