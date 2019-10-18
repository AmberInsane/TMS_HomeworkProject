package hw_5.task_1;

public interface Computer {
    default void turnOn() {
        System.out.println("I'm alive!");
    }

    default void turnOff() {
        System.out.println("I'm going to die...");
    }

    void reset();
}
