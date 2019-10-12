package hw_3.task_4;
//При помощи двумерного массива вывести на экран таблицу умножения

import java.util.Arrays;

public class MultiplyTable {
    public static void main(String[] args) {
        int size = 9;
        int[][] multiplyTable = new int[size][size];
        int multiply;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                multiply = (i + 1) * (j + 1);
                multiplyTable[i][j] = multiply;
                if (i != j)
                    multiplyTable[j][i] = multiply;
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(multiplyTable[i]));
        }
    }

}
