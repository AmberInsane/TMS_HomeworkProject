package hw_14.task_2;

import java.io.*;

//Есть текстовый файл. Нужно скопировать из него только те строки,
// которые содержат слово pancakes и записать их в другой файл

// +
public class PancakesMain {
    private static final String PATH_IN = "src/hw_14/task_2/text";
    private static final String PATH_OUT = "src/hw_14/task_2/text_out";

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader(PATH_IN));
             BufferedWriter bw = new BufferedWriter(new FileWriter(PATH_OUT))) {
            String line;
            String pattern = "(.*)pancakes(.*)";
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                if (line.matches(pattern)) {
                    bw.write(line + "\n");
                }
            }
        } catch (IOException e) {
            System.err.println("Problem with reading from file");
        }
    }
}
