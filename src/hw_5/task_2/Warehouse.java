package hw_5.task_2;

import java.util.Arrays;

public class Warehouse implements Cloneable { // implements Cloneable можно убрать
    // статик = одно для всех классов, а это значит создав два экземпляра твоего класса получим неверно работающую программу
    private static int currentBoxIndex = 0;
    private final Box[] boxes;

    public Warehouse(Box[] boxes) {
        this.boxes = boxes;
    }

    public Box[] getBoxes() {
        Box[] copyOfBoxes = new Box[boxes.length];
        System.arraycopy(boxes, 0, copyOfBoxes, 0, copyOfBoxes.length);
        return copyOfBoxes;
    }

    public Box next() throws CloneNotSupportedException {
        Box cloneBox;
        if (boxes.length != 0) {
            cloneBox = boxes[currentBoxIndex].clone();
            currentBoxIndex = (currentBoxIndex + 1) % boxes.length;
        } else {
            cloneBox = null;
        }

        return cloneBox;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "boxes=" + Arrays.toString(boxes) +
                '}';
    }
}
