package hw_12.task_1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Product {
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private String name;
    private LocalDateTime arriveTime;

    public Product(String name) {
        this.name = name;
        this.arriveTime = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", arriveTime=" + arriveTime.format(dtf) +
                '}';
    }
}
