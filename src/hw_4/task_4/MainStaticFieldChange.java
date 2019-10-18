package hw_4.task_4;

import hw_4.task_1.Person;

// +
public class MainStaticFieldChange {
    private static Person[] people;

    public static void main(String[] args) {
        people = new Person[3];
        people[0] = new Person();
        people[1] = new Person();
        people[2] = new Person();

        printAllTexts("Before changing");
        people[1].setText("Bye from static");
        printAllTexts("After changing");
    }

    private static void printAllTexts(String title) {
        System.out.print(title + ": ");
        for (int i = 0; i < people.length; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(people[i].getText());
        }
        System.out.println();
    }
}
