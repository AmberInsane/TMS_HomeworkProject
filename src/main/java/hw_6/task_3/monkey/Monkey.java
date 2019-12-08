package hw_6.task_3.monkey;

// по идее у обезьян может быть метод который принимает дерево, а она считает фрукты на нем
public class Monkey {
    private String[] knownFruits;
    private String name;

    // смущает String[] knownFruits, а не Fruits[] knownFruits
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
