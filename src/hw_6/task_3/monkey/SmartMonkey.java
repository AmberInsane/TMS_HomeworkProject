package hw_6.task_3.monkey;

import hw_6.task_3.fruit.Banana;
import hw_6.task_3.fruit.Coconut;
import hw_6.task_3.fruit.Fruit;

public class SmartMonkey extends Monkey {

    public SmartMonkey() {
        super(new String[] {Banana.class.getName(), Coconut.class.getName()});
    }
}
