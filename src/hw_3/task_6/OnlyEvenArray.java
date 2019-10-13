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
        int n = 0; //counter of not null elements - измени название переменной и удали комментарий
        // 'numberOfCopiedElements' длинное, но хорошее название

        for (int anArray : array) {
            if (anArray % 2 == 0) {
                evenArrWithNulls[n++] = anArray;
            }
        }

        System.out.println("Array before changes: ");
        System.out.println(Arrays.toString(array));

        int[] onlyEvenArr = new int[n];
        for (int i = 0; i < n; i++) {
            onlyEvenArr[i] = evenArrWithNulls[i];
        }
        System.out.println("Array with only even integers: ");
        System.out.println(Arrays.toString(onlyEvenArr));
    }
}
