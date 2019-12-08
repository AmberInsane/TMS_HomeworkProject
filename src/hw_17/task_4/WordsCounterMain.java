package hw_17.task_4;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

// +
public class WordsCounterMain {
    private static final String DIR_PATH = "resources/hw_17/task_4";

    public static void main(String[] args) {
        File dirFile = new File(DIR_PATH);

        try {
            if (dirFile.isDirectory()) {
                File[] dirFiles = dirFile.listFiles();

                ExecutorService executorService = Executors.newFixedThreadPool(dirFiles.length);
                List<Future<Integer>> list = new ArrayList<>();
                for (File file : dirFiles) {
                    list.add(executorService.submit(new FileWordCounter(file)));
                }
                for (int i = 0; i < dirFiles.length; i++) {
                    System.out.println("File " + dirFiles[i] + " number of words " + list.get(i).get());
                }

                System.out.println("Number of files " + dirFiles.length);
                executorService.awaitTermination(500, TimeUnit.MILLISECONDS);
                executorService.shutdownNow();
            } else {
                throw new Exception("Not dir path");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
