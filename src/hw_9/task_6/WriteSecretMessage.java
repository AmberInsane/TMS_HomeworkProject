package hw_9.task_6;

import java.io.*;

public class WriteSecretMessage {
    private static final String FILE_PATH = "src/hw_9/task_6/imj.jpeg";
    private static final String KEY_FILE_PATH = "src/hw_9/task_6/key";
    private final static String SECRET = "42 is the Answer to the Ultimate Question of Life, the Universe, and Everything";

    public static void main(String[] args) {
        File file = new File(FILE_PATH);
        writeSecretToFile(SECRET, file);
    }

    private static void writeSecretToFile(String secret, File file) {
        try (RandomAccessFile raf = new RandomAccessFile(file, "rw");
             FileOutputStream fos = new FileOutputStream(KEY_FILE_PATH)) {
            long secretLength = secret.length();
            long startPosition = (long) (file.length() * Math.random());
            fos.write(Long.toString(startPosition).getBytes());
            fos.write(("\n" + secretLength).getBytes());
            raf.seek(startPosition);
            raf.write(secret.getBytes());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
