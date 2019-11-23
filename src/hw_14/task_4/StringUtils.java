package hw_14.task_4;

import java.util.stream.IntStream;

public class StringUtils {
    static public String getPalindromes(String text) {
        String[] array = text.split(" ");
        StringBuilder palindromes = new StringBuilder();

        for (String str : array) {
            String cleanStr = str.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();
            if (isPalindrome(cleanStr)) {
                palindromes.append(cleanStr).append(" ");
            }
        }
        return palindromes.toString();
    }

    private static boolean isPalindrome(String word) {
        return IntStream.range(0, word.length() / 2)
                .allMatch(i -> word.charAt(i) == word.charAt(word.length() - i - 1));
    }
}