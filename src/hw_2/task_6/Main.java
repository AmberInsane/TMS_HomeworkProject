package hw_2.task_6;
/*
Напишите программу вывода всех четных чисел от 2 до 100 включительно
 */

// +
public class Main {
    public static void main(String[] args) {
        int i = 2;
        while (i <= 100) {
            System.out.print("\t"+i);
            i +=2;
        }
    }
}
