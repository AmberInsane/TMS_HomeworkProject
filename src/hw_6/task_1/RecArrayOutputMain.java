package hw_6.task_1;

public class RecArrayOutputMain {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 10};
        recursionOutput(array, 0);
    }

    private static int recursionOutput(int[] array, int index) {
        System.out.print(array[index] + "\t");
        index++;
        if (index < array.length) {
            index = recursionOutput(array, index);
        }
        return index;
    }
}
