package hw_6.task_9;

public class StringLengthMain {
    public static void main(String[] args) {
        String[] strings = new String[5];
        strings[0] = "Ololo";
        strings[1] = "Tratata";
        strings[2] = "Urururu";
        strings[3] = "Piu";
        strings[4] = "Azaza";

        for (String string : strings) {
            if (string.length() >= 5) {
                System.out.println(string);
            }
        }
    }
}
