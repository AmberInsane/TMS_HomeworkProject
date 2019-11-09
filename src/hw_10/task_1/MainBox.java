package hw_10.task_1;

public class MainBox {
    public static void main(String[] args) {
        Box<Sock> myBox = new Box<>(new Sock());
        System.out.println("Class name is " + myBox.getDefinitionClassName());
    }
}
