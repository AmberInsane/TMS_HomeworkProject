package hw_10.task_3.cars;

import java.awt.*;

// я бы использовал Car как интерфейс
public abstract class Car {
    protected long vinNumber;
    protected short year;
    protected Color color;

    public Car(long vinNumber, short year, Color color) {
        this.vinNumber = vinNumber;
        this.year = year;
        this.color = color;
    }
}
