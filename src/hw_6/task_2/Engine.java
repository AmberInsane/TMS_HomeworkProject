package hw_6.task_2;

/*
У мотора должны быть методы “заглушить мотор” и “завести мотор”.
Если попробовать завести работающий мотор, то вывести на экран, что мотор уже работает.
Если заглушить не работающий мотор, то вывести на экран, что мотор уже заглушен
 */
public class Engine {
    private boolean work = false; // по умолчанию итак будет false

    // isWork -> 'is' это методы типа гет для boolean полей, а методы типа get/set идут после основных, но перед equals/hashcode
    public boolean isWork() {
        return work;
    }

    public boolean turnOn() {
        boolean success = false; // а если убрать эту переменную и просто возвращать work?
        if (!work) {
            work = true;
            success = true;
            System.out.println("Engine is working");
        } else {
            System.out.println("Engine has already started");
        }
        return success;
    }

    public boolean turnOff() {
        boolean success = false; // а если убрать эту переменную и просто возвращать work?
        if (work) {
            work = false;
            success = true;
            System.out.println("Engine is drowning out");
        } else {
            System.out.println("Engine has already drowned out");
        }
        return success;
    }
}
