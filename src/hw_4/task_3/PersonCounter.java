package hw_4.task_3;

import hw_4.task_1.Person;

// +
public class PersonCounter {
    public static void main(String[] args) {
        Person[] people = new Person[6];
        people[0] = new Person("Farrokh", 73);
        people[1] = new Person("Brian", 72);
        people[2] = new Person("Roger", 70);
        people[3] = new Person("John", 68);
        people[4] = new Person("Brian", 72);
        people[5] = new Person("Roger", 70);

        for (int i = 0; i < people.length; i++) {
            if (isNewPerson(people, i)) {
                countByPerson(people, i);
            }
        }
    }

    private static boolean isNewPerson(Person[] people, int currentIndex) {
        int indexBefore = currentIndex - 1;
        while (indexBefore >= 0) {
            if (people[currentIndex].equals(people[indexBefore])) {
                break;
            }
            indexBefore--;
        }
        return indexBefore <= 0;
    }

    private static void countByPerson(Person[] people, int currentIndex) {
        int personCounter = 1;
        for (int i = currentIndex + 1; i < people.length; i++) {
            if (people[currentIndex].equals(people[i])) {
                personCounter++;
            }
        }
        System.out.println("Person: " + people[currentIndex] + " Count: " + personCounter);
    }
}
