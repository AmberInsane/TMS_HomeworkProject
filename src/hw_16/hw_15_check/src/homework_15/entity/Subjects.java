package hw_16.hw_15_check.src.homework_15.entity;

// Subjects -> Subject
public class Subjects {
    private String subName;
    private int mark;

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Subjects{" +
                "subName='" + subName + '\'' +
                ", mark=" + mark +
                '}';
    }
}
