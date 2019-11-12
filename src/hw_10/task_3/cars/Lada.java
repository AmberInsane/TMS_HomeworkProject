package hw_10.task_3.cars;

import java.awt.*; 

// +
public class Lada extends Car {
    public Lada(long vinNumber, short year, Color color) {
        super(vinNumber, year, color);
    }

    @Override
    public String toString() {
        return "Lada{" +
                "vinNumber=" + vinNumber +
                ", year=" + year +
                ", color=" + color +
                '}';
    }
}
