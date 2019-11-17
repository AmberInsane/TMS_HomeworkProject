package hw_11.task_8;

import java.util.HashSet;
import java.util.Set;

//Есть HashSet магазинов. У магазина есть название и ID. Создать несколько магазинов (через оператор new Shop(..))
//с одинаковым ID и названием и добавить их в ваш Set. Попробуйте разобраться почему они все добавились,
//несмотря на то, что Set обеспечивает уникальность
//потому что hashCode и equals не хватает - без них сравниваются ссылки

// +
public class ShopSetMain {
    public static void main(String[] args) {
        Set<Shop> shopSet = new HashSet<>();
        shopSet.add(new Shop(11, "IKEA"));
        shopSet.add(new Shop(11, "IKEA"));
        shopSet.add(new Shop(11, "IKEA"));

        System.out.println(shopSet);
    }
}

