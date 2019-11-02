package hw_9.task_4;

import java.io.Serializable;

// У Work есть атрибуты название и минимальный стаж.
public class Work implements Serializable {
    private String name;
    private int minExperience;

    public Work(String name, int minExperience) {
        this.name = name;
        this.minExperience = minExperience;
    }

    public Work(String name) {
        this.name = name;
        minExperience = 0;
    }

    public Work() {
        this.name = "None";
        minExperience = 0;
    }

    @Override
    public String toString() {
        return "Work{" +
                "name='" + name + '\'' +
                ", minExperience=" + minExperience +
                '}';
    }
}
