package hw_13.task_7;

import hw_13.entity.Phone;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinCostMain {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Xs", "Apple", 1300));
        phones.add(new Phone("C113", "Motorola", 80));
        phones.add(new Phone("S4", "Samsung", 150));
        phones.add(new Phone("P20Lite", "Huawei", 550));
        phones.add(new Phone("P30Pro", "Huawei", 1200));

        Optional<Phone> minCostPhone = phones.stream()
                .min(Comparator.comparing(Phone::getPrice));

        if (minCostPhone.isPresent()) {
            System.out.println(minCostPhone.get());
        } else {
            System.err.println("Phones not found");
        }
    }
}
