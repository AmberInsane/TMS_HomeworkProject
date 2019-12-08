package hw_2.task_5;
/*Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры
для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
 */

// Main -> Task_5
public class Main {
    public static void main(String[] args) {
        // раз ты используешь формат, то стоит придерживаться общего стиля, а не просто ставить пробелы между словами
        // done
        System.out.format("%4s %8s%n", "inch","sm");
        for (int i = 1; i <= 20; i++) {
            System.out.format("%4d %8.2f", i, i * 2.54);
        }

    }
}
