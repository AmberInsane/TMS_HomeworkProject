package hw_10.task_3;

import hw_10.task_3.cars.Car;

import java.util.ArrayList;

public class Garage<S extends Car> {
    private String address;
    private ArrayList<S> cars;

    public Garage(String address) {
        this.address = address;
        this.cars = new ArrayList<>();
    }

    public Garage(String address, ArrayList<S> cars) {
        this.address = address;
        this.cars = cars;
    }

    public ArrayList<S> getCars() {
        return cars;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "address='" + address + '\'' +
                ", cars=" + cars +
                '}';
    }
}
