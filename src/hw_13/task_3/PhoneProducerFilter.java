package hw_13.task_3;

import hw_13.entity.Phone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//Task 3 (map + filter)
//Есть коллекция телефонов. Необходимо получить из нее коллекцию производителей (производитель - это строка) и оставить только те, которые входят в список:
// Apple, Samsung, Xiaomi

// +
public class PhoneProducerFilter {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Xs", "Apple", 1300));
        phones.add(new Phone("C113", "Motorola", 80));
        phones.add(new Phone("S4", "Samsung", 150));
        phones.add(new Phone("P20Lite", "Huawei", 550));
        phones.add(new Phone("P30Pro", "Huawei", 1200));

        List<String> phonesToFind = Arrays.asList("Apple", "Samsung", "Xiaomi");

        List<String> foundedProducers = phones.stream()
                .map(Phone::getProducer)
                .filter(phonesToFind::contains)
                .collect(Collectors.toList());

        System.out.println(foundedProducers);
    }
}
