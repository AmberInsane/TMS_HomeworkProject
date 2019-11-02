package hw_9.task_6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SecretMessageMain {
    private static final String FILE_PATH = "src/hw_9/task_6/imj.jpeg";

    private static String secret = "Message: 42 is the Answer to the Ultimate Question of Life, the Universe, and Everything";

    public static void main(String[] args) {
        try {
            File file = new File(FILE_PATH);
            if (!file.exists() && !file.createNewFile()) {
                throw new IOException();
            }
            writeSecretToFile(secret, file);
            //readSecretFromFile(file);
        } catch (IOException e) {
            System.err.println("Problem with creating file: " + e.getMessage());
        }
    }

    private static void writeSecretToFile(String secret, File file){
        try (FileOutputStream fos = new FileOutputStream(file, true)){
            fos.write(secret.getBytes());
            fos.flush();
        } catch (Exception e) {
            System.err.println("Problem with output stream: " + e.getMessage());
        }
    }
}
