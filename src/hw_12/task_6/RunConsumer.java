package hw_12.task_6;

import java.util.List;

@FunctionalInterface
public interface RunConsumer {
    void accept(String runName, List<Sportsman> runners);
}
