package hw_5.task_3.houses;

public abstract class House {
    private int numberOfLevels;
    private int numberOfTenants;
    private String address;

    public int getNumberOfLevels() {
        return numberOfLevels;
    }

    public int getNumberOfTenants() {
        return numberOfTenants;
    }

    public void turnOnHeating() {
        System.out.println("Hitting has been turned on");
    }
    public House(String address,int numberOfLevels, int numberOfTenants){
        this.address = address;
        this.numberOfLevels = numberOfLevels;
        this.numberOfTenants = numberOfTenants;
    }
}
