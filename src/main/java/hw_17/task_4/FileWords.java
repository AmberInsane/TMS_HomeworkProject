package hw_17.task_4;

public class FileWords {
    private String fileName;
    private int numberOfWords;

    public FileWords(String fileName, int numberOfWords) {
        this.fileName = fileName;
        this.numberOfWords = numberOfWords;
    }

    @Override
    public String toString() {
        return "File " + fileName + " number of words " + numberOfWords + '}';
    }
}
