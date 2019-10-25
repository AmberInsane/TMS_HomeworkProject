package hw_6.task_3;

import hw_6.task_3.fruit.Banana;
import hw_6.task_3.fruit.Coconut;
import hw_6.task_3.monkey.Monkey;
import hw_6.task_3.monkey.SmartMonkey;
import hw_6.task_3.monkey.StupidMonkey;
import hw_6.task_3.tree.BananaTree;
import hw_6.task_3.tree.Branch;
import hw_6.task_3.tree.Palm;
import hw_6.task_3.tree.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
Есть 2 дерева, на одном растут бананы, на другом - кокосы. Дерево состоит из веток (само дерево - главная ветка).
На ветке могут быть фрукты (т.е. бананы или кокосы) и другие ветки.
Для каждой ветки при ее создании можно задать кол-во фруктов, а если не задавать - то рандом.
Есть 3 обезьяны, одна умеет считать кокосы, вторая бананы, а третья - и кокосы и бананы (типо умная)
Есть класс - MonkeyManager, в котором есть метод - попросить любую обезьяну посчитать фрукты на любом дереве
 */
public class MonkeyMain {
    public static void main(String[] args) {
        System.out.println("Hello! Let's do monkey business!");
        Tree[] trees = new Tree[2];
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

        System.out.println("Banana tree is");
        System.out.println(bananaTree);

        Palm palm = new Palm();
        branches = new ArrayList<>();
        branches.add(new Branch(new ArrayList<>(), 2));
        branches.add(new Branch(new ArrayList<>()));
        branch1 = new Branch(branches, 0);
        branches = new ArrayList<>();
        branches.add(new Branch(new ArrayList<>(), 2));
        branch2 = new Branch(branches, 0);
        branches = new ArrayList<>();
        branches.add(branch1);
        branches.add(branch2);
        branches.add(new Branch(new ArrayList<>()));
        palm.getTrunk().setBrunches(branches);
        trees[1] = palm;

        System.out.println("Palm is");
        System.out.println(palm);


        Monkey smartMonkey = new SmartMonkey("Smart John");
        Monkey onlyCoconutMonkey = new StupidMonkey("Coconut Jill", Coconut.class.getName());
        Monkey onlyBananaMonkey = new StupidMonkey("Banana Sam", Banana.class.getName());
        Monkey[] monkeys = new Monkey[3];
        monkeys[0] = smartMonkey;
        monkeys[1] = onlyCoconutMonkey;
        monkeys[2] = onlyBananaMonkey;

        Scanner in = new Scanner(System.in);
        int commandNumber = 0;
        showMenu(monkeys);

        while (commandNumber != -1) {
            try {
                commandNumber = in.nextInt();
                commandNumber = commandNumber == 0 ? -1 : commandNumber;
                if (commandNumber > 0) {
                    Monkey tempMonkey = monkeys[commandNumber - 1];
                    for (Tree tree : trees) {
                        if (Arrays.asList(tempMonkey.getKnownFruits()).contains(tree.getFruitClass().getName()))
                            System.out.println("Number of " + cutClassName(tree.getFruitClass().getName()) + "s on the " + cutClassName(tree.getClass().getName()) + " is " + countFruits(tempMonkey, tree.getTrunk()));
                        else
                            System.out.println("I don't know. I don't like " + cutClassName(tree.getFruitClass().getName()));
                    }
                } else {
                    System.out.print("Bye-bye");
                }
            } catch (Exception e) {
                System.out.println("Please, put in correct number of command");
                in = new Scanner(System.in);
            }
        }
    }

    private static int countFruits(Monkey monkey, Branch branch) {
        int fruitsNumber = 0;
        for (Branch tempBranch : branch.getBrunches()) {
            fruitsNumber += tempBranch.getFruits().length + countFruits(monkey, tempBranch);
        }
        return fruitsNumber;
    }

    private static void showMenu(Monkey[] monkeys) {
        StringBuffer menuStringBuffer = new StringBuffer();
        menuStringBuffer.append("Choose a monkey\n");
        for (int i = 0; i < monkeys.length; i++) {
            menuStringBuffer.append((i + 1)).append(" - ").append(monkeys[i].getName()).append("\n");
        }
        menuStringBuffer.append("0 - Exit\n");
        System.out.println(menuStringBuffer);
    }

    private static String cutClassName(String className) {
        className = className.substring(className.lastIndexOf(".") + 1);
        return className;
    }
}
