package hw_3.task_3;
//Есть массив чисел. Заменить каждый нечетный элемент массива на 0.

import java.util.Arrays;
//Есть массив чисел. Заменить каждый нечетный элемент массива на 0.
public class Main {
    public static void main(String[] args) {
        int[] array = {1,4,3,2,4,5,45,24435,436,546,45,654,6,5464,23,2,-1,2342,-234};
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if (flag)
                array[i] = 0;
            flag = !flag;
        }
        System.out.println(Arrays.toString(array));
    }
}
