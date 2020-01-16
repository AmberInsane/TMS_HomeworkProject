package hw_19;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharactersCounter {
    Map<Character, Long> countedCharacters;

    public CharactersCounter(String string) {
        countedCharacters = string.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public void printMaxCharacter() {
        System.out.println("The most common letter is");
        System.out.println(countedCharacters
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get());
    }

    public void printMinCharacter() {
        System.out.println("The least common letter is");
        System.out.println(countedCharacters
                .entrySet()
                .stream()
                .min(Map.Entry.comparingByValue())
                .get());

    }
}
