package hw_12.task_6;

import java.util.*;

public class SportsRunMain {
    public static void main(String[] args) {
        Sportsman gena = new Sportsman("Gena", 4.3);
        Sportsman valya = new Sportsman("Valya", 3.8);
        Sportsman ira = new Sportsman("Ira", 3.9);
        Sportsman ivan = new Sportsman("Ivan", 4.5);
        Sportsman georg = new Sportsman("Georg", 4.9);

        List<Sportsman> runners = new LinkedList<>();
        runners.add(gena);
        runners.add(valya);
        runners.add(ira);
        runners.add(ivan);
        runners.add(georg);

        RunConsumer runConsumer = (runName, listOfRunners) -> {
            listOfRunners.sort((a, b) -> b.getAvgSpeed().compareTo(a.getAvgSpeed()));
            listOfRunners.get(0).addGoal(runName, Reward.GOLD);
            listOfRunners.get(1).addGoal(runName, Reward.SILVER);
            listOfRunners.get(2).addGoal(runName, Reward.BRONZE);
        };

        System.out.println("The first run");
        runConsumer.accept("600 meters run", runners);
        System.out.println(runners);

        System.out.println("After some time");
        valya.setAvgSpeed(4.5);
        georg.setAvgSpeed(4.3);
        runConsumer.accept("1000 meters run", runners);
        System.out.println(runners);

    }
}
