package hw_5.task_3.houses;

public abstract class House {
    private int numberOfLevels;     // обычно такие поля делают protected
    private int numberOfTenants;     // обычно такие поля делают protected
    private String address;     // обычно такие поля делают protected

    // конструктор идет раньше других методов
    public House(String address, int numberOfLevels, int numberOfTenants) {
        this.address = address;
        this.numberOfLevels = numberOfLevels;
        this.numberOfTenants = numberOfTenants;
    }
    
    public int getNumberOfLevels() {
        return numberOfLevels;
    }

    public int getNumberOfTenants() {
        return numberOfTenants;
    }

    public void turnOnHeating() {
        System.out.println("Hitting has been turned on");
    }
}
