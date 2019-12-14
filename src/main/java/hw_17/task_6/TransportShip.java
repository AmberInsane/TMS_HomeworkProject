package hw_17.task_6;

// +
public class TransportShip {
    private int number;
    private int capacity;

    public TransportShip(int number, int capacity) {
        this.number = number;
        this.capacity = capacity;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "TransportShip{" +
                "number=" + number +
                ", capacity=" + capacity +
                '}';
    }
}
