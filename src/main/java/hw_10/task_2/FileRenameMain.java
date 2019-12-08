package hw_10.task_2;

import java.io.File;
import java.util.Scanner;

//Есть папка с файлами, которые нужно переименовать.
//Реализуйте паттерн "стратегия" при помощи Enum для переименования файлов:
//- имя файла маленькими буквами
//- первая бука в имени файла с большой буквы, а остальные маленькие
//- имя файла написано кэпс локом (все буквы большие)
//Напишите класс, у которого будет метод принимающий текущее имя файла и стратегию для переименования.
public class FileRenameMain {
    private static final String DIR_PATH = "src/hw_10/task_2/folderWithFiles";

    public static void main(String[] args) {
        File dir = new File(DIR_PATH);
        File[] dirFiles = dir.listFiles();
        Scanner scanner;
        boolean isCorrectInput;
        
        // этот огромный for стоит разбить на несколько методов
        for (File file : dirFiles != null ? dirFiles : new File[0]) { // этот код очень плохо читается, не стоит так писать
            System.out.println("What should I do with file " + file.getName() + "?");
            printMenu();
            scanner = new Scanner(System.in); // в каждой итерации цика новый Scanner не стоит создавать
            isCorrectInput = false;
            while (!isCorrectInput) { // думаю этот цикл лишний и можно без него
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
                    scanner = new Scanner(System.in); // здесь точно не нужно создавать новый сканнер
                }
            }
        }
    }

    private static void printMenu() {
        FileRenameStrategy[] values = FileRenameStrategy.values();
        for (FileRenameStrategy value : values) {
            System.out.println(value.toString()); // не нужно самому вызывать метод toString() он будет вызван автоматически
        }
    }
}
