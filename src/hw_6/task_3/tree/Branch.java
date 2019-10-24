package hw_6.task_3.tree;

import hw_6.task_3.fruit.Fruit;

import java.util.ArrayList;

public class Branch {
    ArrayList<Branch> brunches;
    Fruit[] fruits;
    int number;
    static int counter = 0;

    public Branch() {
        fruits = new Fruit[0];
        number = counter++;
    }

    public Branch(ArrayList<Branch> brunches) {
        this.brunches = brunches;
        this.fruits = new Fruit[(int)(Math.random()*10)];
        fillFruitArray();
        number = counter++;
    }

    public Branch(ArrayList<Branch> brunches, int numberOfFruits) {
        this.brunches = brunches;
        this.fruits = new Fruit[numberOfFruits];
        fillFruitArray();
        number = counter++;
    }

    public ArrayList<Branch> getBrunches() {
        return brunches;
    }

    public void setBrunches(ArrayList<Branch> brunches) {
        this.brunches = brunches;
    }

    private void fillFruitArray() {
        for (int i = 0; i < fruits.length ; i++) {
               fruits[i] = new Fruit();
        }
    }

    public Fruit[] getFruits() {
        return fruits;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setFruits(Fruit[] fruits) {
        this.fruits = fruits;
    }
}
