package hw_19;

public class WordInputException extends Exception {
    public WordInputException() {
        super("Sorry, it's not a word. Try again");
    }
}
