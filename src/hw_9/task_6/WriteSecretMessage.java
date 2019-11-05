package hw_9.task_6;

import java.io.*;

public class WriteSecretMessage {
    private static final String FILE_PATH = "src/hw_9/task_6/imj.jpeg";

    // final.            secret -> SECRET
    private static String secret = "42 is the Answer to the Ultimate Question of Life, the Universe, and Everything";

    public static void main(String[] args) {
        try {
            File file = new File(FILE_PATH);
            if (!file.exists() && !file.createNewFile()) { // Task_1
                throw new IOException();
            }
            writeSecretToFile(secret, file);
        } catch (IOException e) {
            System.err.println("Problem with creating file: " + e.getMessage());
        }
    }

    private static void writeSecretToFile(String secret, File file){ // вроде не отформатирован код?
        try (FileOutputStream fos = new FileOutputStream(file, true)){
            fos.write(("\n" + secret).getBytes());
            fos.flush();
        } catch (Exception e) {
            System.err.println("Problem with output stream: " + e.getMessage());
        }
    }
}
