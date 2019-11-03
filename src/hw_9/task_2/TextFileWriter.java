package hw_9.task_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//Есть некоторый текст, его нужно записать в файл. Можно использовать одно и тоже предложение, запишите его 10.000 раз
public class TextFileWriter {
    private static final String FILE_PATH = "src/hw_9/task_2/Text10000";

    public static void main(String[] args) {
        try {
            File file = new File(FILE_PATH);
            if (!file.exists() && !file.createNewFile()) {
                throw new IOException();
            }
            try (FileWriter fw = new FileWriter(FILE_PATH)) {
                String text = "Hello, Hell";
                int n = 10000;
                for (int i = 0; i < n; i++) {
                    fw.append(text);
                    fw.append("\n");
                }
                fw.flush();
            } catch (IOException e) {
                System.err.println("Problem with putting in file");
            }
        } catch (IOException e) {
            System.err.println("Problem with creating file");
        }
    }
}
