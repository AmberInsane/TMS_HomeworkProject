package hw_8.task_3;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExceptionMain {
    private static final int MAX_ARRAY_SIZE = 10;
    private static final int MIN_ARRAY_SIZE = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String string;
            System.out.println("Put in size of array, please");
            string = scanner.next(); // scanner.nextInt()
            // а если пользователь введет отрицательное число? - готово
            int arraySize = Integer.parseInt(string);
            if (arraySize > MAX_ARRAY_SIZE) {
                throw new MyArraySizeException("TOO BIG!!!");
            }
            if (arraySize < MIN_ARRAY_SIZE) {
                throw new MyArraySizeException("TOO SMALL!!!");
            }
            System.out.println(arraySize + " is great size of array. Nice work!");

            int[] array = new int[arraySize];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 10);
            }

            System.out.println("Let me show you random array of your favorite size");
            System.out.println(Arrays.toString(array));
        } catch (NumberFormatException e) {
            System.err.print("Put in correct integer next time, please");
        } catch (MyArraySizeException e) {
            System.err.print(e.getMessage());
        }
    }
}
