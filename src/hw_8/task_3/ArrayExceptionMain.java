package hw_8.task_3;

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
            if (arraySize > 10) {
                throw new MyArraySizeException("TOO BIG!!!");
            }
            System.out.print(arraySize + " is great size of array. Nice work!");
        } catch (NumberFormatException e) {
            System.err.print("Put in correct integer next time, please");
        } catch (MyArraySizeException e) {
            System.err.print(e.getMessage());
        }
    }
}
