package hw_5.task_3;

import hw_5.task_3.houses.*;

// +
public class MainHouse {
    public static void main(String[] args) {
        System.out.println("=====Country house=====");
        House countryHouse = new CountryHouse("Privete st., 44", 2, 4);
        System.out.println(countryHouse + " has " + countryHouse.getNumberOfTenants() + " tenants");
        countryHouse.turnOnHeating();

        System.out.println("=====Block house=====");
        House blockHouse = new BlockHouse("Gorky st., 12", 12, 240, 666);
        blockHouse.turnOnHeating();

        System.out.println("=====House Catalog=====");
        HouseCatalog houseCatalog = new HouseCatalog();
        System.out.println(houseCatalog);
    }
}
