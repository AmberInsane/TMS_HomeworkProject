package hw_5.task_2;

import java.util.Arrays;

/*
сделать класс Warehouse, внутри которого массив (массив чего придумайте сами). Массив  должен быть immutable
При создании объекта создается массив, заносятся в него данные, изменять или добавлять значения в массив после  этого  нельзя
в классе должен быть метод next() который возвращает следующий элемент массива.
Если дошли до последнего элемента при вызове next(), должно вернуть первый элемент
также должен быть метод getArray() - который возвращает массив и переопределен метод toString()
 */

// форматируй код
public class WarehouseMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Warehouse warehouse = new Warehouse(new Box[]{
                new Box("A-1", 13.3, 300),
                new Box("A-2", 14.10, 400),
                new Box("B-16", 12.3, 666),
                new Box("B-39", 19.5, 700),
                new Box("C-11", 13.3, 300)
        });
        // warehouse1 - так себе название
        Warehouse warehouse1 = new Warehouse(new Box[]{});
        System.out.println(warehouse1);
        System.out.println(Arrays.toString(warehouse1.getBoxes()));
        System.out.println(warehouse1.next());

        System.out.println(warehouse);
        for (int i = 0; i < warehouse.getBoxes().length * 2; i++) {
            Box nextBox = warehouse.next();
            nextBox.setNumber("G-" + i);
            if (i%2 == 1 && i < warehouse.getBoxes().length){
                warehouse.getBoxes()[i] = new Box("G-10", 11, 11);
            }
            System.out.println(nextBox);
        }

        System.out.println(warehouse);
    }
}
