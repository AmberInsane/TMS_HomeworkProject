package hw_2.task_2;
/*Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
 */
public class Main {
    public static void main(String[] args) {
        int tempCount = 1; //текущее количество амеб

        for (int i = 3; i <= 24; i += 3) {
            tempCount *= 2;
            System.out.println("Через " + i + " часа(ов) будет аж " + tempCount + " амеб(ы)");
        }
    }

}
