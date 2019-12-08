package hw_12.task_6;

import java.util.Map;
import java.util.TreeMap;

// +
public class Sportsman {
    private String name;
    private Double avgSpeed;
    private Map<String, Reward> goals;

    public Sportsman(String name) {
        this.name = name;
        this.avgSpeed = 0.0;
        this.goals = new TreeMap<>();
    }

    public Sportsman(String name, Double avgSpeed) {
        this.name = name;
        this.avgSpeed = avgSpeed;
        this.goals = new TreeMap<>();
    }

    public Sportsman(String name, Double avgSpeed, Map<String, Reward> goals) {
        this.name = name;
        this.avgSpeed = avgSpeed;
        this.goals = goals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAvgSpeed() {
        return avgSpeed;
    }

    public void setAvgSpeed(double avgSpeed) {
        this.avgSpeed = avgSpeed;
    }

    public Map<String, Reward> getGoals() {
        return goals;
    }

    public void setGoals(Map<String, Reward> goals) {
        this.goals = goals;
    }

    public void addGoal(String runNumber, Reward reward) {
        goals.put(runNumber, reward);
    }

    @Override
    public String toString() {
        return "Sportsman{" +
                "name='" + name + '\'' +
                ", avgSpeed=" + avgSpeed +
                ", goals=" + goals +
                '}';
    }
}
