package hw_4.task_3;

import hw_4.task_1.Person;

import java.util.HashMap;
import java.util.Map;

public class PersonCounterUsingMap {
    public static void main(String[] args) {
        Person[] people = new Person[6];
        people[0] = new Person("Farrokh", 73);
        people[1] = new Person("Brian", 72);
        people[2] = new Person("Roger", 70);
        people[3] = new Person("John", 68);
        people[4] = new Person("Brian", 72);
        people[5] = new Person("Roger", 70);

        HashMap<Person, Integer> countMap = new HashMap<>();
        for (Person person : people) {
            if (countMap.containsKey(person)) {
                countMap.put(person, countMap.get(person) + 1);
            } else {
                countMap.put(person, 1);
            }
        }
        for (Map.Entry entry : countMap.entrySet()) {
            System.out.println("Person: " + entry.getKey() + " Count: "
                    + entry.getValue());
        }
    }
}
