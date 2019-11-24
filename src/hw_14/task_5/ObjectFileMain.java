package hw_14.task_5;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ObjectFileMain {


    public static void main(String[] args) {
        String folderPath = "src/hw_14/task_5/cats";

        List<Cat> cats = new LinkedList<>() {{
            add(new Cat("Sheldon"));
            add(new Cat("Tormund"));
            add(new Cat("Lyova"));
            add(null);
        }};

        System.out.println("Cats before serialization");
        System.out.println(cats);

        CatFileWriter catFileWriter = (cat, file) -> {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
                oos.writeObject(cat);
                oos.flush();
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        };

        CatFileRider catFileRider = (file) -> {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                return (Cat) ois.readObject();
            } catch (IOException e) {
                System.err.println("IOException " + e.getMessage());
            } catch (ClassNotFoundException e) {
                System.err.println("ClassNotFoundException " + e.getMessage());
            }
            return null;
        };

        int counter = 0;
        for (Cat cat : cats) {
            File file = new File(folderPath + "/cat" +counter++);
            catFileWriter.writeCatToFile(cat, file);
        }

        File folder = new File(folderPath);
        File[] files = folder.listFiles();
        List<Cat> catsFromFiles = new ArrayList<>();

        for (File file: files) {
            catsFromFiles.add(catFileRider.readCatFromFile(file));
        }

        System.out.println("Cats after serialization");
        System.out.println(catsFromFiles);

    }
}
