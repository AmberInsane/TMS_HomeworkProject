package hw_9.task_1;

import java.io.*;
import java.util.Arrays;

//Есть массив чисел, заполнить его можете любыми цифрами. Нужно записать его в файл
public class IntArrayToFile {
    private static final String FILE_PATH = "src/hw_9/task_1/Int Array";

    public static void main(String[] args) {
        // я думаю лучше было бы сделать один try-catch, а не вкладывать один в другой (готово)
        try (FileOutputStream fos = new FileOutputStream(FILE_PATH)) {
            File file = new File(FILE_PATH);
            if (!file.exists() && !file.createNewFile()) {
                throw new IOException();
            }
            int[] array = new int[10];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 100);
            }
            fos.write(Arrays.toString(array).getBytes());
            fos.flush();
        } catch (IOException e) {
            System.err.println("Problem with file: " + e.getMessage());
        }
    }
}