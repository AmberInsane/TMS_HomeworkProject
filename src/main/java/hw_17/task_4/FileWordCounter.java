package hw_17.task_4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.Callable;

// я бы предложил тебе возвращать не Integer, а объект, в котором было бы кол-во слов + имя файла
public class FileWordCounter implements Callable<FileWords> {
    private File file;

    public FileWordCounter(File file) {
        this.file = file;
    }

    @Override
    public FileWords call() {
        int counter = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            System.out.println(Thread.currentThread().getName());
            String line;
            while ((line = br.readLine()) != null) {
                counter += line.split(" ").length;
            }
        } catch (IOException e) {
            System.err.println("Problem with reading from file: " + e.getMessage());
        }
        return new FileWords(file.getName(), counter);
    }
}
