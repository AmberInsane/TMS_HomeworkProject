package hw_11.task_11;

import java.util.TreeSet;

//Есть TreeSet имен, необходимо выбрать все от "H" до "W" (regex (регэксп))
public class RegexpTreeSetMain {
    public static void main(String[] args) {
        TreeSet<String> namesTreeSet = new TreeSet<>();

        namesTreeSet.add("Olya");
        namesTreeSet.add("Valya");
        namesTreeSet.add("Gala");
        namesTreeSet.add("Hala");
        namesTreeSet.add("Nadia");
        namesTreeSet.add("Nastia");
        namesTreeSet.add("Vovan");
        namesTreeSet.add("Rostislav");
        namesTreeSet.add("Wiuwiu");
        namesTreeSet.add("Zeliboba");

        System.out.println(namesTreeSet);
        System.out.println(namesTreeSet.subSet("H", "X"));
    }
}
