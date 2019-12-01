package hw_16.hw_15_check.src.homework_15.task_2_task_3;

import com.fasterxml.jackson.databind.ObjectMapper;
import hw_16.hw_15_check.src.homework_15.entity.Student;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JacksonJsonReader {
    //@Mary абсолютные пути зло
    //@Mary файлы json без расширений - возможно стоит добавить
    // согласен
    private static final String FOLDER_PATH = "C:\\Users\\Artur Kuznetcov\\IdeaProjects\\homework1\\resource\\json\\Students\\Student";
    private static final String NEW_FILE_PATH = "homework_15/task_2_task_3/List";
    private static final String NEW_JSON_FILE_PATH = "C:\\Users\\Artur Kuznetcov\\IdeaProjects\\homework1\\resource\\json\\Students\\output";

    public static void main(String[] args) throws IOException {
        List<Student> students = ListOfAllJson(FOLDER_PATH);
        writeListToFile(NEW_FILE_PATH, students); //@Mary излишняя запись в файл
        // здесь скорее двумя способами, норм
        writeListToJsonFile(NEW_JSON_FILE_PATH, students);
    }

    //@Mary переменная типа File с названием fileName вводит заблуждение -> File file или String fileName
    private static Student readJSON(File fileName) throws IOException {
        //@Mary на каждый файл создается ObjectMapper, достаточно одного для всех
        ObjectMapper objectMapper = new ObjectMapper();
        //@Mary new File(String.valueOf(fileName))) излишне, первым параметром достаточно было передать fileName
        Student student = objectMapper.readValue(new File(String.valueOf(fileName)), Student.class);
        return student;
    }

    // ListOfAllJson -> list...
    private static List<Student> ListOfAllJson(String dir) throws IOException {
        File f = new File(dir);
        File[] list = f.listFiles();
        List<Student> studentList = new ArrayList<>();
        for (File entry : list) {
            studentList.add(readJSON(entry));
        }
        //@Mary "отсортировать студентов по фамилии и имени", а получилось по имени и фамилии (наверное это важно)
        // согласен, но я пока на это закрываю глаза, т.к. цель другая, на реальном проекте конечно не прокатило бы
        Collections.sort(studentList, Comparator.comparing(Student::getName).thenComparing(Student::getSurname));
        return studentList;
    }

    private static void writeListToJsonFile(String fileName, List<Student> students) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        FileWriter fileWriter = new FileWriter(fileName);
        objectMapper.writeValue(fileWriter, students);
        System.out.println("File 'json' has been successfully written");
    }

    private static void writeListToFile(String fileName, List<Student> students) {
        try (FileWriter fileWriter = new FileWriter(new File(NEW_FILE_PATH));
             BufferedWriter buff = new BufferedWriter(fileWriter)) { //@Mary запись объектов как строк. ObjectOutputStream подошел бы лучше
            buff.write(String.valueOf(students)); //@Mary не ошибка, но короче students.toString() 
            // не, записывать объект как строку вообще грустная история, не надо так делать
            buff.flush();
            System.out.println("File has been successfully written");
        } catch (IOException e) {
            System.out.println("Error in writing" + e.getMessage());
        }
    }

}
