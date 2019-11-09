package hw_10.task_2;

import java.io.File;
import java.util.Scanner;

public class FileRenameMain {
    private static final String DIR_PATH = "src/hw_10/task_2/folderWithFiles";

    public static void main(String[] args) {
        File dir = new File(DIR_PATH);
        File[] dirFiles = dir.listFiles();
        Scanner scanner;
        boolean isCorrectInput;
        for (File file : dirFiles != null ? dirFiles : new File[0]) {
            System.out.println("What should I do with file " + file.getName() + "?");
            printMenu();
            scanner = new Scanner(System.in);
            isCorrectInput = false;
            while (!isCorrectInput) {
                try {
                    FileRenameStrategy enumApple = FileRenameStrategy.valueOf(scanner.next());
                    isCorrectInput = true;
                    if (enumApple.renameFile(file)) {
                        System.out.println("File has been renamed");
                    } else {
                        System.out.println("File hasn't been renamed");
                    }
                } catch (IllegalArgumentException e) {
                    System.err.println("Incorrect input");
                    scanner = new Scanner(System.in);
                }
            }
        }
    }

    private static void printMenu() {
        FileRenameStrategy[] values = FileRenameStrategy.values();
        for (FileRenameStrategy value : values) {
            System.out.println(value.toString());
        }
    }
}
