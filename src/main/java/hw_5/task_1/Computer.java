package hw_5.task_1;

// дефолтные методы старайся не использовать, на занятии расскажу чуть подробнее 
public interface Computer {
    default void turnOn() {
        System.out.println("I'm alive!");
    }

    default void turnOff() {
        System.out.println("I'm going to die...");
    }

    default void reset(){
        turnOff();
        turnOn();
    }
}
