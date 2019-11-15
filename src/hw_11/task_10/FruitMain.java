package hw_11.task_10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FruitMain {
    public static void main(String[] args) {
        Set<Fruit> fruitSet = new HashSet<>();
        fillFruitSet(fruitSet);
        System.out.println(fruitSet);

        Map<String, Double> allFruitWeight = new HashMap<>();
        calcAllFruitWeight(fruitSet, allFruitWeight);
        System.out.println(allFruitWeight);
    }

    private static void fillFruitSet(Set<Fruit> fruitSet) {
        fruitSet.add(new Fruit("Apple", 5.6));
        fruitSet.add(new Fruit("Pear", 5.6));
        fruitSet.add(new Fruit("Pineapple", 9.0));
        fruitSet.add(new Fruit("Grape", 11.6));
        fruitSet.add(new Fruit("Apple", 15.8));
        fruitSet.add(new Fruit("Pineapple", 23.0));
    }

    private static void calcAllFruitWeight(Set<Fruit> fruitSet, Map<String, Double> allFruitWeight) {
        for (Fruit fruit : fruitSet) {
            if (allFruitWeight.containsKey(fruit.getName())) {
                allFruitWeight.put(fruit.getName(), allFruitWeight.get(fruit.getName()) + fruit.getWeight());
            } else {
                allFruitWeight.put(fruit.getName(), fruit.getWeight());
            }
        }
    }
}
