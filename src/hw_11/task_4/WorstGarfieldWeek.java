package hw_11.task_4;

import java.util.ArrayList;
import java.util.List;

// +
public class WorstGarfieldWeek {
    public static void main(String[] args) {
        List<String> daysOfWeek = new ArrayList<>();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        List<String> garfieldHatesDays = new ArrayList<>();
        garfieldHatesDays.add("Monday");

        System.out.println("Days of week");
        System.out.println(daysOfWeek);
        System.out.println("Garfield hates");
        System.out.println(garfieldHatesDays);
        
        daysOfWeek.retainAll(garfieldHatesDays);
        
        System.out.println("The worst week for Garfield contains");
        System.out.println(daysOfWeek);
    }
}
