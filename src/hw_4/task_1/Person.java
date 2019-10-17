package hw_4.task_1;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private static String text = "Hello from static";

    public Person() {
        this("no name", 0);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        Person.text = text;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", age: " + age + ".";
    }

    public void show() {
        System.out.println(this);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return false;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(age, person.age);
    }
}

