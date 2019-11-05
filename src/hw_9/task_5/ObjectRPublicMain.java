package hw_9.task_5;

import hw_9.task_4.Employee;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

//serialVersionUID added
public class ObjectRPublicMain {
    private static final String FILE_PATH = "src/hw_9/task_4/Employees";

    public static void main(String[] args) {
        try {
            File file = new File(FILE_PATH);
            if (!file.exists() && !file.createNewFile()) { // Task_1
                throw new IOException();
            }
            readEmployeeFromFile(file);
        } catch (IOException e) {
            System.err.println("Problem with creating file: " + e.getMessage());
        }
    }

    // void -> Employee
    private static void readEmployeeFromFile(File file) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Employee employee = (Employee) ois.readObject();
            System.out.println(employee);
        } catch (IOException e) {
            System.err.println("Problem with output stream: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found: " + e.getMessage());
        }
    }
}
