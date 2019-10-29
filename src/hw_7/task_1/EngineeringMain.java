package hw_7.task_1;
//Игра в слова. Есть строка “engineering”. Нужно выделить подстроку так, чтобы получилось два слова “engine” и “ring”.
// +
public class EngineeringMain {
    public static void main(String[] args) {
        String engineering = "engineering";
        String engine = engineering.substring(0,6);
        System.out.println(engine);
        String ring = engineering.substring(7);
        System.out.print(ring);
    }
}
