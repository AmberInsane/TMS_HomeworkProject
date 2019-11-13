package hw_11.task_3;

import java.util.ArrayList;
import java.util.List;

//Есть две коллекции, нужно удалить из первой те, которые есть во второй
public class BestGarfieldWeek {
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
        garfieldHatesDays.add("Monday") ;

        System.out.println("Days of week");
        System.out.println(daysOfWeek);
        System.out.println("Garfield hates");
        System.out.println(garfieldHatesDays);
        daysOfWeek.removeAll(garfieldHatesDays);
        System.out.println("Perfect week for Garfield contains");
        System.out.println(daysOfWeek);
    }
}
