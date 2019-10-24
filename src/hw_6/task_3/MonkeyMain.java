package hw_6.task_3;

import hw_6.task_3.monkey.Monkey;
import hw_6.task_3.monkey.SmartMonkey;
import hw_6.task_3.monkey.StupidMonkey;
import hw_6.task_3.tree.BananaTree;
import hw_6.task_3.tree.Branch;
import hw_6.task_3.tree.Tree;

import java.util.ArrayList;
import java.util.Arrays;

/*
Есть 2 дерева, на одном растут бананы, на другом - кокосы. Дерево состоит из веток (само дерево - главная ветка).
На ветке могут быть фрукты (т.е. бананы или кокосы) и другие ветки.
Для каждой ветки при ее создании можно задать кол-во фруктов, а если не задавать - то рандом.
Есть 3 обезьяны, одна умеет считать кокосы, вторая бананы, а третья - и кокосы и бананы (типо умная)
Есть класс - MonkeyManager, в котором есть метод - попросить любую обезьяну посчитать фрукты на любом дереве
 */
public class MonkeyMain {
    public static void main(String[] args) {
        Tree[] trees = new Tree[1];
        BananaTree bananaTree = new BananaTree();
        ArrayList<Branch> branches = new ArrayList<>();
        branches.add(new Branch(new ArrayList<>(), 2));
        branches.add(new Branch(new ArrayList<>()));
        Branch branch1 = new Branch(branches, 0);
        branches = new ArrayList<>();
        branches.add(new Branch(new ArrayList<>(), 2));
        Branch branch2 = new Branch(branches, 0);
        branches = new ArrayList<>();
        branches.add(branch1);
        branches.add(branch2);
        bananaTree.getTrunk().setBrunches(branches);
        trees[0] = bananaTree;
        System.out.println(bananaTree);

        Monkey smartMonkey = new SmartMonkey();
        Monkey onlyCoconutMonkey = new StupidMonkey("Coconut");
        Monkey onlyBananaMonkey = new StupidMonkey("Banana");

        for (int i = 0; i < trees.length; i++) {
            if (Arrays.asList(onlyCoconutMonkey.getKnownFruits()).contains(trees[i].getFruitClass().getName()))
                System.out.println(countFruits(onlyCoconutMonkey, trees[i].getTrunk()));
            else
                System.out.println("I don't know");
        }
    }

    static int countFruits(Monkey monkey, Branch branch) {
        System.out.println("LOL");
        int fruitsNumber = 0;
        for (Branch tempBranch : branch.getBrunches()) {
            System.out.println(tempBranch.getNumber() + " " + tempBranch.getFruits().length);
            fruitsNumber += tempBranch.getFruits().length + countFruits(monkey, tempBranch);
        }

        return fruitsNumber;
    }
}
