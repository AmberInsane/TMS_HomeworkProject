package hw_2.task_5;
/*Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры
для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("inch    sm");
        for (int i = 1; i <= 20; i++) {
            System.out.format("%4d %8.2f%n", i, i * 2.54);
        }

    }
}