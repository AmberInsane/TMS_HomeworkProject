package hw_16.hw_15_check.src.homework_15.task_2_task_3;

import com.google.gson.Gson;
import hw_16.hw_15_check.src.homework_15.entity.Student;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//@Mary Прочитать студентов при помощи Jackson JSON парсера, но ладн
// это да...
public class GsonReader {
    public static void main(String[] args) throws IOException {
        // путь в константу и он должен быть относительным, а не абсолютным
        showAllJson("C:\\Users\\Artur Kuznetcov\\IdeaProjects\\homework1\\resource\\json\\Students\\Student");
    }

    public static void readJSON(File fileName) {
        Gson gson = new Gson();
        try (FileReader fr = new FileReader(fileName)) {
            Student student = gson.fromJson(fr, Student.class);
            System.out.println(student);
        } catch (IOException e) {
            System.out.println("Problem in reading" + e.getMessage());
        }
    }

    private static void showAllJson(String dir) {
        File f = new File(dir);
        // думаю лучше проверки на налл проверять существует файл или нет 
        // и тогда у тебя просто будет пустой список файлов внутри, если директория сущестует и она пустая
        File[] list = f.listFiles();

        if (list == null) {
            return;
        }
        for (File entry : list) {
            readJSON(entry);
        }
    }
}
