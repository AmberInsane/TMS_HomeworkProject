package hw_14.task_5;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ObjectFileMain {
    private static String FILE_PATH = "src/hw_14/task_5/cat";

    public static void main(String[] args) {
        List<Cat> cats = new LinkedList<>() {{
            add(new Cat("Sheldon"));
            add(new Cat("Tormund"));
            add(new Cat("Lyova"));
            add(null);
        }};

        System.out.println("Cats before serialization");
        System.out.println(cats);

        File file = new File(FILE_PATH);
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
             ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(cats);
            oos.flush();

            List<Cat> catsFromFiles = new ArrayList<>((List<Cat>) ois.readObject());
            System.out.println("Cats after serialization");
            System.out.println(catsFromFiles);
        } catch (IOException e) {
            System.err.println("IOException " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("ClassNotFoundException " + e.getMessage());
        }
    }
}
