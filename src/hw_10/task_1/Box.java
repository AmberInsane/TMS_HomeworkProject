package hw_10.task_1;

public class Box<T> {
    private T thing;

    public Box(T thing) {
        this.thing = thing;
    }

    public T getThing() {
        return thing;
    }

    public String getDefinitionClassName() {
        return this.thing.getClass().getName();
    }
}
