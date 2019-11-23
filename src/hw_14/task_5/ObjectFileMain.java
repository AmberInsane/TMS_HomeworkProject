package hw_14.task_5;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ObjectFileMain {
    private static final String PATH = "src/hw_14/task_5/cats";

    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(PATH)));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(PATH)))){
            List<Cat> cats = new LinkedList<>() {{
                add(new Cat("Sheldon"));
                add(new Cat("Tormund"));
                add(new Cat("Lyova"));
            }};

            for (Cat cat: cats) {
                oos.writeObject(cat);
                oos.flush();
            }
            oos.writeObject(null);

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
