package hw_6.task_3.tree;

import hw_6.task_3.fruit.Fruit;

public class Tree {
    Branch trunk;
    Class<? extends Fruit> fruitClass;

    public Tree(Class<? extends Fruit> fruitClass) {
        this.fruitClass = fruitClass;
        trunk = new Branch();
    }

    public Branch getTrunk() {
        return trunk;
    }

    public Class<? extends Fruit> getFruitClass() {
        return fruitClass;
    }

    @Override
    public String toString() {
        return printBrunch(trunk, 0).toString();
    }

    private StringBuilder printBrunch(Branch branch, int level) {
        StringBuilder brunchString = new StringBuilder();
        for (Branch tempBranch : branch.getBrunches()) {
            for (int i = 0; i < level; i++) {
                brunchString.append("\t");
            }
            brunchString.append("Brunch with ").append(tempBranch.getFruits().length).append(" fruit(s)");
            brunchString.append("\n");
            brunchString.append(printBrunch(tempBranch, level + 1));
        }
        return brunchString;
    }
}
