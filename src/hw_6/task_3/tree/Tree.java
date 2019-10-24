package hw_6.task_3.tree;

import hw_6.task_3.fruit.Fruit;

public class Tree {
    Branch trunk;
    Class<? extends Fruit> fruitClass;


    public Tree(Fruit fruit) {
        fruitClass = fruit.getClass();
        trunk = new Branch();
    }

    public Branch getTrunk() {
        return trunk;
    }

    public void setTrunk(Branch trunk) {
        this.trunk = trunk;
    }

    public Class<? extends Fruit> getFruitClass() {
        return fruitClass;
    }

    @Override
    public String toString() {
        return printBrunch(trunk).toString();
    }

    private StringBuilder printBrunch(Branch branch) {
        StringBuilder brunchString = new StringBuilder();
        for (Branch tempBranch : branch.getBrunches()) {
            brunchString.append("\n");
            brunchString.append("Brunch number " + tempBranch.number + " - " + tempBranch.getFruits().length);
            brunchString.append(printBrunch(tempBranch));
        }

        return brunchString;
    }
}
