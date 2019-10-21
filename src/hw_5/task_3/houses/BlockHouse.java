package hw_5.task_3.houses;

// +
public class BlockHouse extends House implements Housable {
    private int numberOfFlats;
    private int numberOfLevels;
    private int numberOfTenants;
    private String address;

    public BlockHouse(String address, int numberOfLevels, int numberOfFlats, int numberOfTenants) {
        super(address, numberOfLevels, numberOfTenants);
        this.address = address;
        this.numberOfLevels = numberOfLevels;
        this.numberOfTenants = numberOfTenants;
        this.numberOfFlats = numberOfFlats;
    }

    @Override
    public String toString() {
        return "Block house with " + numberOfLevels + " level(s) and " + numberOfFlats + " flat(s), " + address;
    }
}
