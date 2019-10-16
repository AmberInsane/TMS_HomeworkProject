package hw_4.task_3;

import hw_4.task_1.Person;

import java.util.HashMap;
import java.util.Map;

public class PersonCounter {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("Olya", 16);
        people[1] = new Person("Vano", 29);
        people[2] = new Person("Olya", 16);

        countByUsingHashMap(people);
    }

    private static void countByUsingHashMap(Person[] people) {
        HashMap<Person, Integer> countMap = new HashMap<>();
        for (int i = 0; i < people.length; i++) {
            if (countMap.containsKey(people[i])) {
                countMap.put(people[i], countMap.get(people[i]) + 1);
            } else {
                countMap.put(people[i], 1);
            }
        }
        for (Map.Entry entry : countMap.entrySet()) {
            System.out.println("Person: " + entry.getKey() + " Count: "
                    + entry.getValue());
        }
    }
}
