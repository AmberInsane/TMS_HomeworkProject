package hw_6.task_3.monkey;

public class Monkey {
    private String[] knownFruits;
    private String name;

    public Monkey(String name, String[] knownFruits) {
        this.name = name;
        this.knownFruits = knownFruits;
    }

    public String[] getKnownFruits() {
        return knownFruits;
    }

    public String getName() {
        return name;
    }
}
