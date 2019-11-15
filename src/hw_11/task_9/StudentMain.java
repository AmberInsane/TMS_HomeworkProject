package hw_11.task_9;

import java.util.Set;
import java.util.TreeSet;

public class StudentMain {
    public static void main(String[] args) {
        Set<Student> studentSet = new TreeSet<>();

        studentSet.add(new Student("Lashasha", "4F"));
        studentSet.add(new Student("Alesha", "3G"));
        studentSet.add(new Student("Ziliboba", "666H"));

        System.out.println(studentSet);
    }
}
