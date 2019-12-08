package hw_6.task_3.monkey;

import hw_6.task_3.fruit.Banana;
import hw_6.task_3.fruit.Coconut;

public class SmartMonkey extends Monkey {
    public SmartMonkey(String name) {
        super(name, new String[]{Banana.class.getName(), Coconut.class.getName()});
    }
}
