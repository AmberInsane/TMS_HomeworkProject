package hw_10.task_3;

import hw_10.task_3.cars.*;

import java.awt.*;
import java.util.ArrayList;

public class GarageMain {
    public static void main(String[] args) {
        Car[] cars = new Car[]{new Lada(13242344, (short) 2012, Color.BLACK),
                new Lada(324234324, (short) 2018, Color.ORANGE),
                new BMW(586869865, (short) 2000, Color.BLUE)};

        Garage<Car> allCarsGarage = new Garage<>("Ololo st., 29");
        Garage<BMW> onlyBMWGarage = new Garage<>("Ololo st., 30", new ArrayList<>());
        Garage<Lada> onlyLadaGarage = new Garage<>("Ololo st., 33", new ArrayList<>());

        for (Car car : cars) {
            allCarsGarage.getCars().add(car);
            if (car instanceof BMW) {
                onlyBMWGarage.getCars().add((BMW) car);
            }
            if (car instanceof Lada) {
                onlyLadaGarage.getCars().add((Lada) car);
            }
        }

        System.out.println(allCarsGarage);
        System.out.println(onlyBMWGarage);
        System.out.println(onlyLadaGarage);
    }
}
