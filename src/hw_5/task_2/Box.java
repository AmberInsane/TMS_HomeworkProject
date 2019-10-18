package hw_5.task_2;

public class Box {
    private double weight;
    private double volume;
    private String number;

    public Box(String number, double weight, double volume) {
        this.weight = weight;
        this.volume = volume;
        this.number = number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Box number " + number + "(w:" + weight + ", v:" + volume + ")";
    }
}
