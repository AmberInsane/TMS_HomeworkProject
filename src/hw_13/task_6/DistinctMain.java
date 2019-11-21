package hw_13.task_6;

import hw_13.entity.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctMain {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Xs", "Apple", 1300));
        phones.add(new Phone("P20Lite", "Huawei", 550));
        phones.add(new Phone("C113", "Motorola", 80));
        phones.add(new Phone("S4", "Samsung", 150));
        phones.add(new Phone("P20Lite", "Huawei", 550));
        phones.add(new Phone("P30Pro", "Huawei", 1200));

        List<Phone> distPhones = phones.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(distPhones);
    }
}
