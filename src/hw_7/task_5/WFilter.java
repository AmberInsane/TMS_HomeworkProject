package hw_7.task_5;

import java.util.Arrays;

//Есть массив слов. Нужно отфильтровать его так, чтобы в выходном массиве оказались слова, которые начинаются с буквы “W”/”w”.
public class WFilter {
    public static void main(String[] args) {
        String[] strings = new String[]{"hdfjksf", "dsfsf", "awwqwas", "wsfdsfsdf", "weqqqwewq"};
        int wordCounter = 0;
        for (String string: strings) {
            if (string.toLowerCase().startsWith("w")) {
                wordCounter++;
            }
        }
        String[] filteredStrings = new String[wordCounter];
        wordCounter = 0;
        for (String string: strings) {
            if (string.toLowerCase().startsWith("w")) {
                filteredStrings[wordCounter++] = string;
            }
        }
        System.out.println(Arrays.toString(filteredStrings));
    }

}
