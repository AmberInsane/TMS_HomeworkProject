package hw_14.task_6;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] firstArray = {1, 5, 9};
        int[] secondArray = {2, 3, 8, 10};

        int[] mergeArray = new int[firstArray.length + secondArray.length];

        int firstIndex = 0;
        int secondIndex = 0;
        int mergeIndex = 0;

        while ((mergeIndex < mergeArray.length) && (firstIndex < firstArray.length) && (secondIndex < secondArray.length)) {
            mergeArray[mergeIndex++] = firstArray[firstIndex] < secondArray[secondIndex] ? firstArray[firstIndex++] : secondArray[secondIndex++];
        }

        while (firstIndex < firstArray.length) {
            mergeArray[mergeIndex++] = firstArray[firstIndex++];
        }

        while (secondIndex < secondArray.length) {
            mergeArray[mergeIndex++] = secondArray[secondIndex++];
        }

        System.out.println(Arrays.toString(mergeArray));
    }
}
