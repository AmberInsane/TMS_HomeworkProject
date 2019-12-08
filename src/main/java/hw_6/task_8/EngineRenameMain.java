package hw_6.task_8;

import java.util.Arrays;

public class EngineRenameMain {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = new Car("1111", new Engine("1.4T", 1.4));
        cars[1] = new Car("2222", new Engine("1.5T", 1.5));
        cars[2] = new Car("3423", new Engine("1.8R", 1.8));
        cars[3] = new Car("2342", new Engine("1.9R", 1.9));
        cars[4] = new Car("1231", new Engine("1.0", 1.4));

        System.out.println("Before changing:");
        System.out.println(Arrays.toString(cars));

        for (Car car : cars) {
            if (car.getEngine().getVolume() == 1.4) {
                car.getEngine().setName("2.0Т");
            }
            if (car.getEngine().getVolume() == 1.8) {
                car.getEngine().setName("1.8Т");
            }
        }

        System.out.println("After changing:");
        System.out.println(Arrays.toString(cars));
    }
}
