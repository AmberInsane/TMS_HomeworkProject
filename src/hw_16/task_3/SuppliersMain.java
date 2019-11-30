package hw_16.task_3;

public class SuppliersMain {
    private static ToyStore store;

    public static void main(String[] args) throws InterruptedException {
        store = new ToyStore();

        Thread supplierFirst = getSupplierThread(100);
        Thread supplierSecond = getSupplierThread(50);

        supplierFirst.start();
        supplierSecond.start();

        supplierFirst.join();
        supplierSecond.join();

        System.out.println("Number of toys is " + store.getNumberOfToys());
    }

    private static Thread getSupplierThread(int toysCount) {
        Runnable supplierTask = () -> {
            for (int i = 0; i < toysCount; i++) {
                store.putToy();
            }
        };

        return new Thread(supplierTask);
    }
}
