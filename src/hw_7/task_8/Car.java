package hw_7.task_8;

import hw_6.task_8.Engine;

public class Car {
    private String name;
    private hw_6.task_8.Engine engine;

    public Car(String name, hw_6.task_8.Engine engine) {
        this.name = name;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine=" + engine +
                '}';
    }
}
