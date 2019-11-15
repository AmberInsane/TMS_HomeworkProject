package hw_12.task_1;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class ProductMain {
    public static void main(String[] args) throws InterruptedException {
        Set<Product> products = new HashSet<>();

        products.add(new Product("Box11"));
        Thread.sleep(4000);
        products.add(new Product("Box12"));
        Thread.sleep(4000);
        products.add(new Product("Box13"));

        System.out.println(products);
    }
}
