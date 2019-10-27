package hw_7.task_6;
/*
Написать benchmark тест, который бы измерял скорость работы String, StringBuilder и StringBuffer.
 */

public class BenchmarkStringMain {
    public static void main(String[] args) {
        int counter = 100000;
        String testString = "Test String";
        String concatString = "test";

        long start = System.currentTimeMillis();
        for (int i = 0; i < counter; i++) {
            testString = testString.concat(concatString);
        }
        long time = System.currentTimeMillis() - start;
        System.out.println("String; " + time);

        StringBuilder testStringBuilder = new StringBuilder("Test String");
        start = System.currentTimeMillis();
        for (int i = 0; i < counter; i++) {
            testStringBuilder.append(concatString);
        }
        time = System.currentTimeMillis() - start;
        System.out.println("StringBuilder; " + time);

        StringBuffer testStringBuffer = new StringBuffer("Test String");
        start = System.currentTimeMillis();
        for (int i = 0; i < counter; i++) {
           testStringBuffer.append(concatString);
        }
        time = System.currentTimeMillis() - start;
        System.out.println("StringBuffer; " + time);
    }
}
