package hw_5.task_2;

public class WarehouseMain {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(new Box[]{
                new Box("A-1", 13.3, 300),
                new Box("A-2", 14.10, 400),
                new Box("B-16", 12.3, 666),
                new Box("B-39", 19.5, 700),
                new Box("C-11", 13.3, 300)
        });

        System.out.println(warehouse);
        for (int i = 0; i < warehouse.getBoxes().length * 2; i++) {
            Box nextBox = warehouse.next();
            nextBox.setNumber("G-" + i);
            System.out.println(nextBox);
        }

        System.out.println(warehouse);
    }
}
