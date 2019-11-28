package hw_15.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import hw_12.task_4.LambdaUserMain;

import java.util.List;

public class Student {
    private String group;
    @JsonProperty("firstname")
    private String firstName;
    @JsonProperty("lastname")
    private String secondName;
    private String faculty;
    private List<Lesson> lessons;

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    @Override
    public String toString() {
        return "Student{" +
                "group='" + group + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", faculty='" + faculty + '\'' +
                ", lessons=" + lessons +
                '}';
    }
}
