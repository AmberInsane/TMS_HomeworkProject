package hw_5.task_1;
/*Есть интерфейс Computer,у которого есть методы включить, выключить и резет. Создайте класс, который бы имплементировал
этот интерфейс
 */
//+
public class ComputerMain {
    public static void main(String[] args) {
        Computer laptop = new Laptop();
        laptop.reset();
    }
}
