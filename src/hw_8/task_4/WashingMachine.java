package hw_8.task_4;

public class WashingMachine {
    public void work() {
        try {
            while (true) {
                System.out.println("I'm working");
                if (System.currentTimeMillis() % 3 == 1) {
                    throw new WashingMachineException("Oh, no!");
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
