package hw_17.task_5;

import com.fasterxml.jackson.databind.ObjectMapper;
import hw_17.entity.Book;
import hw_17.entity.Student;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static hw_17.task_5.file_generator.GenerateFile.readJSONArray;

public class MostPopularBooks {
    private static String FILE_PATH = "resources/hw_17/task_5/StudentsWithBooks.json";
    private static int numberOFTop = 3;

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        List<Student> students = Arrays.asList(readJSONArray(new File(FILE_PATH), mapper, Student[].class));

        List<Book> tops = getTopBooks(students, numberOFTop);

        System.out.println("Top-" + numberOFTop + " of student's books are:");
        for (int i = 0; i < tops.size(); i++) {
            System.out.println((i + 1) + ". " + tops.get(i));
        }
    }

    private static List<Book> getTopBooks(List<Student> students, int numberOFTop) {
        Map<Book, Long> countedBooks = students.stream()
                .map(Student::getBooks)
                .flatMap(Collection::stream)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        List<Book> tops = countedBooks
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .limit(numberOFTop)
                .map(Map.Entry::getKey).collect(Collectors.toList());
        return tops;
    }
}
