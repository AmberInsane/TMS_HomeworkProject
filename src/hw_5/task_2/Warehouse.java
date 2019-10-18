package hw_5.task_2;

import java.util.Arrays;

/*
сделать класс Warehouse, внутри которого массив (массив чего придумайте сами). Массив  должен быть immutable
При создании объекта создается массив, заносятся в него данные, изменять или добавлять значения в массив после  этого  нельзя
в классе должен быть метод next() который возвращает следующий элемент массива.
Если дошли до последнего элемента при вызове next(), должно вернуть первый элемент
также должен быть метод getArray() - который возвращает массив и переопределен метод toString()
 */
public class Warehouse {
    private static int currentBoxIndex = -1;
    private Box[] boxes;

    public Warehouse(Box[] boxes) {
        this.boxes = boxes;
    }

    public Box[] getBoxes() {
        Box[] copyOfBoxes = new Box[boxes.length];
        System.arraycopy(boxes, 0, copyOfBoxes, 0, copyOfBoxes.length);
        return copyOfBoxes;
    }

    public Box next() {
        currentBoxIndex = (currentBoxIndex + 1) % boxes.length;
        return boxes[currentBoxIndex];
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "boxes=" + Arrays.toString(boxes) +
                '}';
    }
}
