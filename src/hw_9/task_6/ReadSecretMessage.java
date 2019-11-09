package hw_9.task_6;

import java.io.*;

public class ReadSecretMessage {
    private static final String FILE_PATH = "src/hw_9/task_6/imj.jpeg";
    private static final String KEY_FILE_PATH = "src/hw_9/task_6/key";

    public static void main(String[] args) {
        File file = new File(FILE_PATH);
        String secret = readSecretFromFile(file, new File(KEY_FILE_PATH));
        if (secret.equals("")) { // если возможно старайся не использовать !, можно просто поменять сообщения местами (готово)
            System.out.print("Secret not found");
        } else {
            System.out.print("Secret message: " + secret);
        }
    }

    private static String readSecretFromFile(File file, File keyFile) {
        String secret = "";
        try (BufferedReader fis = new BufferedReader(new FileReader(keyFile));
             RandomAccessFile raf = new RandomAccessFile(file, "r")) {
            long startPosition = Long.valueOf(fis.readLine());
            long secretLength = Long.valueOf(fis.readLine());
            raf.seek(startPosition);
            StringBuilder secretBuilder = new StringBuilder();
            while (secretLength > 0) {
                secretBuilder.append((char) raf.read());
                secretLength--;
            }
            secret = secretBuilder.toString();
        } catch (IOException e) {
            System.err.println("Problem with reader: " + e.getMessage());
        }
        return secret;
    }
}
