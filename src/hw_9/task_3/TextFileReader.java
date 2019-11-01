package hw_9.task_3;

import java.io.*;

//Прочитать файл из Task_2 и вывести на экран содержимое
public class TextFileReader {
    private static final String FILE_PATH = "src/hw_9/task_2/Text10000";

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Problem with reading from file");
        }
    }
}
