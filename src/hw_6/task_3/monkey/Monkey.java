package hw_6.task_3.monkey;

import hw_6.task_3.fruit.Fruit;

public class Monkey {
    private String[] knownFruits;

    public Monkey(String[] knownFruits) {
        this.knownFruits = knownFruits;
    }

    public String[] getKnownFruits() {
        return knownFruits;
    }
}
