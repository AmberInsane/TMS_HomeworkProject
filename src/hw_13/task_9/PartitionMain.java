package hw_13.task_9;

import hw_13.entity.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Есть коллекция телефонов. Нужно разделить на две части, в одной только айфоны, в другой остальные производители.
public class PartitionMain {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Xs", "Apple", 1300));
        phones.add(new Phone("C113", "Motorola", 80));
        phones.add(new Phone("S4", "Samsung", 150));
        phones.add(new Phone("P20Lite", "Huawei", 550));
        phones.add(new Phone("P30Pro", "Huawei", 1200));

        Map<Boolean, List<Phone>> collect = phones.stream()
                .collect(Collectors.partitioningBy(phone -> "Apple".equals(phone.getProducer())));

        System.out.println(collect);
    }
}
