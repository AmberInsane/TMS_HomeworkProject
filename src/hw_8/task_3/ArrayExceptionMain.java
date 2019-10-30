package hw_8.task_3;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExceptionMain {
    private static final int MAX_ARRAY_SIZE = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            String string;
            System.out.println("Put in size of array, please");
            string = scanner.next();
            int arraySize = Integer.parseInt(string);
            if (arraySize > MAX_ARRAY_SIZE) {
                throw new MyArraySizeException("TOO BIG!!!");
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
