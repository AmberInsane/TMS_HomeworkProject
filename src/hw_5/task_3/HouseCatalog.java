package hw_5.task_3;

import hw_5.task_3.houses.*;

public class HouseCatalog {
    private House[] houses;

    public HouseCatalog(){
        this.houses = new House[] {
                new CountryHouse("Hello st., 29", 2,4),
                new BlockHouse("Hello st., 30", 10,500, 1200),
                new BlockHouse("Ololo St. 60", 50, 1200, 2567),
                new CountryHouse("Ololo St. 666", 3, 10)};
    }

    @Override
    public String toString(){
        StringBuilder housesString = new StringBuilder();
        for (int i = 0; i < houses.length; i++) {
            housesString.append("House number ").append(i + 1).append(": ").append(houses[i]).append("\n");
        }
        return housesString.toString();
    }
}
