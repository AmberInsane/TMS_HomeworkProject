package hw_6.task_3.tree;

import hw_6.task_3.fruit.Fruit;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Branch> brunches;
    private Fruit[] fruits;

    public Branch() {
        fruits = new Fruit[0];
    }

    // brunches передала аргументом, а почему fruits нет?
    public Branch(ArrayList<Branch> brunches) {
        this.brunches = brunches;
        this.fruits = new Fruit[(int) (Math.random() * 10)];
        fillFruitArray();
    }

    public Branch(ArrayList<Branch> brunches, int numberOfFruits) {
        this.brunches = brunches;
        this.fruits = new Fruit[numberOfFruits];
        fillFruitArray();
    }

    private void fillFruitArray() {
        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = new Fruit();
        }
    }

    public ArrayList<Branch> getBrunches() {
        return brunches;
    }

    public void setBrunches(ArrayList<Branch> brunches) {
        this.brunches = brunches;
    }

    public Fruit[] getFruits() {
        return fruits;
    }
}
