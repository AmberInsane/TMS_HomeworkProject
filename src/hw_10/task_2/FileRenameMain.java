package hw_10.task_2;

import java.io.File;
import java.util.Scanner;

import static hw_10.task_2.FileRenameStrategy.*;

public class FileRenameMain {
    private static final String DIR_PATH = "src/hw_10/task_2/folderWithFiles";

    public static void main(String[] args) {
        File dir = new File(DIR_PATH);

        File[] dirFiles = dir.listFiles();

        Scanner scanner;
        for (File file : dirFiles) {
            System.out.println("What should I do with file " + file.getName() + "?");
            printMenu();
            scanner = new Scanner(System.in);
            try {
                FileRenameStrategy enumApple = FileRenameStrategy.valueOf(scanner.next());
                switch (enumApple) {
                    case TO_LOW_STRATEGY:
                        if (TO_LOW_STRATEGY.renameFile(file)) {
                            System.out.println("File have been renamed to " + file.getName());
                        } else {
                            System.out.println("File haven't been renamed");
                        }
                        break;
                    case TO_INITCAP_STRATEGY:
                        TO_INITCAP_STRATEGY.renameFile(file);
                        break;
                    case TO_UPPER_STRATEGY:
                        TO_UPPER_STRATEGY.renameFile(file);
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.err.println("Incorrect input");
                scanner = new Scanner(System.in);
            }
        }
    }

    private static void printMenu() {
        FileRenameStrategy[] values = FileRenameStrategy.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i].toString());
        }
    }
}
