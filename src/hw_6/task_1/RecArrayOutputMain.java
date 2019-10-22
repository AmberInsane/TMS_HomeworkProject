package hw_6.task_1;

public class RecArrayOutputMain {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 10};
        recOutput(array, 0);
    }

    private static int recOutput(int[] array, int index) {
        System.out.print(array[index] + "\t");
        index++;
        if (index < array.length) {
            index = recOutput(array, index);
        }
        return index;
    }

}
