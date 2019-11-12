package hw_10.task_3.cars;

import java.awt.*; 

// +
public class BMW extends Car {
    public BMW(long vinNumber, short year, Color color) {
        super(vinNumber, year, color);
    }

    @Override
    public String toString() {
        return "BMW{" +
                "vinNumber=" + vinNumber +
                ", year=" + year +
                ", color=" + color +
                '}';
    }
}
