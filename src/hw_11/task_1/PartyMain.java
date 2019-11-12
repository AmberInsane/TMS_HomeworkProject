package hw_11.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PartyMain {
    private static final String STOP_WORD = "stop";

    public static void main(String[] args) {
        List<String> guestList = new ArrayList<>();
        guestList.add("George Lol");
        guestList.add("Ginger Kek");
        guestList.add("John Trololo");

        Scanner scanner = new Scanner(System.in);
        System.out.println("I can check in list. Stop word is " + STOP_WORD);
        String nameToFind = scanner.nextLine();
        while (!nameToFind.equals(STOP_WORD)) {
            if (guestList.indexOf(nameToFind) >= 0) {
                System.out.println("Yes, you are in list. Come in!");
            } else {
                System.out.println("Sorry, I can't find " + nameToFind + " in list");
            }
            nameToFind = scanner.nextLine();
        }
        System.out.println("Have a nice day!");
    }
}
