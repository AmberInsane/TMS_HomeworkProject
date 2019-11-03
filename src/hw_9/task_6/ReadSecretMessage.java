package hw_9.task_6;

import java.io.*;

public class ReadSecretMessage {
    private static final String FILE_PATH = "src/hw_9/task_6/imj.jpeg";

    public static void main(String[] args) {
        File file = new File(FILE_PATH);
        String secret = readSecretFromFile(file);
        if (!secret.equals("")) {
            System.out.print("Secret message: " + secret);
        } else {
            System.out.print("Secret not found");
        }
    }

    private static String readSecretFromFile(File file) {
        String secret = "";
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
            String lastLine;
            while ((lastLine = br.readLine()) != null) {
                secret = lastLine;
            }
        } catch (IOException e) {
            System.err.println("Problem with reader: " + e.getMessage());
        }
        return secret;
    }
}
