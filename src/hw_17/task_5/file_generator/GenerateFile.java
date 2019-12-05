package hw_17.task_5.file_generator;

import com.fasterxml.jackson.databind.ObjectMapper;
import hw_17.entity.Student;
import hw_17.entity.Book;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class GenerateFile {
    private static String STUDENTS_JSON = "resources/hw_17/task_5/Students.json";
    private static String BOOKS_JSON = "resources/hw_17/task_5/Books.json";
    private static String GENERATED_FILE_PATH = "resources/hw_17/task_5/StudentsWithBooks.json";

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        List<Student> students = Arrays.asList(readJSONArray(new File(STUDENTS_JSON), mapper, Student[].class));
        System.out.println(students);

        List<Book> books = Arrays.asList(readJSONArray(new File(BOOKS_JSON), mapper, Book[].class));
        System.out.println(books);

        writeStudentsToFile(new File(GENERATED_FILE_PATH), mapper, addBooksToStudents(students, books));
    }

    private static List<Student> addBooksToStudents(List<Student> students, List<Book> books) {
        for (Student student : students) {
            int booksNum = (int) (Math.random() * books.size()) + 1;
            List<Book> studentsBook = new ArrayList<>(booksNum);
            for (int i = 0; i < booksNum; i++) {
                int bookNum = (int) (Math.random() * books.size());
                Book curBook = books.get(bookNum);
                if (!studentsBook.contains(curBook)) {
                    studentsBook.add(curBook);
                }
            }
            student.setBooks(studentsBook);
        }
        return students;
    }

    public static <T> T readJSONArray(File file, ObjectMapper mapper, Class<T> clazz) throws IOException {
        return mapper.readValue(file, clazz);
    }

    private static void writeStudentsToFile(File file, ObjectMapper mapper, List<Student> students) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        mapper.writeValue(fileWriter, students);
    }
}
