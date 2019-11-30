package hw_16.task_3;

public class ToyStore {
    private int numberOfToys;

    public synchronized void putToy() {
        numberOfToys++;
    }

    public int getNumberOfToys() {
        return numberOfToys;
    }
}
