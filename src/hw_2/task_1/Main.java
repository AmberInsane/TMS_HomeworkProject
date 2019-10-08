package hw_2.task_1;
/*Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
суммарный путь пробежит спортсмен за 7 дней?
*/
public class Main {
    public static void main(String[] args) {
        int daysCount = 7;
        double sumDistance, dayDistance;

        dayDistance = 10.0;
        sumDistance = dayDistance;

        for (int i = 0; i < daysCount; i++) {
            dayDistance += dayDistance * 0.1;
            sumDistance += dayDistance;
        }

        System.out.println("Суммарный путь составялет " + sumDistance + " км");
    }

}
