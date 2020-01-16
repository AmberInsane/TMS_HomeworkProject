package hw_19;

import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    private static final String END_WORD = "yes";

    public static void main(String[] args) {
        String inputString;
        Scanner scanner = new Scanner(System.in);
        Predicate<String> isWord = x -> x.trim().indexOf(' ') < 0;

        StringBuilder commonString = new StringBuilder();
        while (true) {
            try {
                System.out.println("Put in word, please");
                inputString = scanner.nextLine();

                if (isWord.test(inputString)) {
                    System.out.println("Thank you!");
                    commonString.append(inputString.trim());
                } else {
                    throw new WordInputException();
                }

                System.out.println("Do you want to stop it? If yes, put in '" + END_WORD + "'");
                inputString = scanner.nextLine();

                if (inputString.equals(END_WORD)) {
                    countCharacters(commonString.toString());
                    break;
                }
            } catch (WordInputException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    private static void countCharacters(String string) {
        CharactersCounter charactersCounter = new CharactersCounter(string);
        charactersCounter.printMaxCharacter();
        charactersCounter.printMinCharacter();
    }
}
