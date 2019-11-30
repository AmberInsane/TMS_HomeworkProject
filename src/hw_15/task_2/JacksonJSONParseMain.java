package hw_15.task_2;

import com.fasterxml.jackson.databind.ObjectMapper;
import hw_15.entity.Student;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JacksonJSONParseMain {
    private static String DIR_PATH = "resources/hw_15/task_2";

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        List<Student> students = readValuesFromDir(new File(DIR_PATH), mapper);

        writeStudentsToFile(new File(DIR_PATH + "/out/output.json"), mapper, sortStudents(students));
    }

    private static List<Student> readValuesFromDir(File direction, ObjectMapper mapper) throws IOException {
        List<Student> students = new ArrayList<>();
        for (File file : direction.listFiles()) {
            if (file.isFile()) {
                Student student = mapper.readValue(file, Student.class);
                students.add(student);
            }
        }
        return students;
    }

    private static List<Student> sortStudents(List<Student> students) {
        //Collections.sort(studentList, Comparator.comparing(Student::getName).thenComparing(Student::getSurname));
        // так короче и понятнее
        students.sort((firstStudent, secondStudent) -> {
            int nameResult = firstStudent.getSecondName().compareTo(secondStudent.getSecondName());
            if (nameResult >= 0) {
                nameResult = firstStudent.getFirstName().compareTo(secondStudent.getFirstName());
            }
            return nameResult;
        });
        return students;
    }

    private static void writeStudentsToFile(File file, ObjectMapper mapper, List<Student> students) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        mapper.writeValue(fileWriter, students);
    }
}
