package hw_8.task_4;

// +
public class WashingMachine {
    public void work() {
        try {
            // while (true) я бы лучше сделал поле isWorking и метод, по которому можно было бы проверить работает или нет
            while (true) {
                System.out.println("I'm working");
                if (System.currentTimeMillis() % 5 == 1) {
                    throw new WashingMachineException("Oh, no!");
                }
                if (System.currentTimeMillis() % 5 == 2) {
                    break;
                }
            }
        } catch (WashingMachineException e) {
            System.err.println(e.getMessage());
        } finally {
            drainWater();
        }
    }

    private void drainWater() {
        System.out.println("Water has been drained");
    }
}
