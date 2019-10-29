package hw_7.task_8;

public class Engine {
    private double volume;
    private String name;

    public Engine(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", name='" + name + '\'' +
                '}';
    }
}
