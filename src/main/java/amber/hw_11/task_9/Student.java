package hw_11.task_9;

import java.util.Objects;

// +
public class Student implements Comparable<Student> {
    private String name;
    private String groupName;

    public Student(String name, String groupName) {
        this.name = name;
        this.groupName = groupName;
    }

    @Override
    public int compareTo(Student o) {
        int result = this.name.compareTo(o.name);
        if (result == 0) {
            result = this.groupName.compareTo(o.groupName);
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(groupName, student.groupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, groupName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}
