package hw_3.task_4;
//При помощи двумерного массива вывести на экран таблицу умножения

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int size = 9;
        int[][] multiplyTable = new int[size][size];
        int multiply;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                multiply = i * j;
                multiplyTable[i - 1][j - 1] = multiply;
                if (i != j)
                    multiplyTable[j - 1][i - 1] = multiply;
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(multiplyTable[i]));
        }
    }

}
