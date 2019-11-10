package hw_10.task_1;

//Создать обобщенный (generic) класс, который в конструкторе принимает аргумент неизвестного типа. Создайте  в классе метод,
//который бы выводил что это за тип на экран (получить имя класса для переменной getClass().getName())
public class MainBox {
    public static void main(String[] args) {
        Box<Sock> myBox = new Box<>(new Sock());
        System.out.println("Class name is " + myBox.getDefinitionClassName());
    }
}
