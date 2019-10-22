package hw_6.task_2;

/*
У мотора должны быть методы “заглушить мотор” и “завести мотор”.
Если попробовать завести работающий мотор, то вывести на экран, что мотор уже работает.
Если заглушить не работающий мотор, то вывести на экран, что мотор уже заглушен
 */
public class Engine {
    private boolean work = false;

    public void start() {
        if (!work) {
            work = true;
            System.out.println("Engine is working");
        } else {
            System.out.println("Engine has already started");
        }
    }

    public void drownOut() {
        if (work) {
            work = false;
            System.out.println("Engine is drowning out");
        } else {
            System.out.println("Engine has already drowned out");
        }
    }
}
