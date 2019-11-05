package hw_9.task_4;

import java.io.*;

//Создайте класс Employee, Work. У Work есть атрибуты название и минимальный стаж.
//У Employee есть имя, возраст и работа (work).
//Запишите объект Employee в файл, затем восстановите его обратно в объект.
public class ObjectWRMain {
    private static final String FILE_PATH = "src/hw_9/task_4/Employees";

    public static void main(String[] args) {
        try {
            File file = new File(FILE_PATH);
            if (!file.exists() && !file.createNewFile()) { // Task_1
                throw new IOException();
            }
            Employee employeeJohn = new Employee("John", 33, new Work("Delivery guy"));
            writeEmployeeToFile(employeeJohn, file);
            readEmployeeFromFile(file);
        } catch (IOException e) {
            System.err.println("Problem with creating file: " + e.getMessage());
        }
    }

    private static void writeEmployeeToFile(Employee employee, File file) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(employee);
            oos.flush();
        } catch (IOException e) {
            System.err.println("Problem with output stream: " + e.getMessage());
        }
    }

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
