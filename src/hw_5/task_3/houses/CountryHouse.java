package hw_5.task_3.houses;

public class CountryHouse extends House implements Houseble {

    private int numberOfLevels;
    private int numberOfTenants;
    private String address;

    public CountryHouse(String address, int numberOfLevels, int numberOfTenants) {
        super(address, numberOfLevels, numberOfTenants);
        this.address = address;
        this.numberOfLevels = numberOfLevels;
        this.numberOfTenants = numberOfTenants;
    }

    @Override
    public void turnOnHeating() {
        for (int i = 0; i < numberOfLevels; i++) {
            System.out.println("Hitting has been turned on the " + i + " floor");
        }
    }

    @Override
    public String toString() {
        return "Country house with " + numberOfLevels + " level(s), " + address;
    }
}
