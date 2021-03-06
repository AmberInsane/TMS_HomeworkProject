package hw_6.task_2;

/*
У коробки передач должны быть методы “переключить передачу выше” и “переключить передачу ниже”.
Нельзя понизить передачу ниже 0 и повысить больше 7.
 */
public class Transmission {
    // + final
    private static int MIN_GEAR = 0;
    // + final
    private static int MAX_GEAR = 7;

    private int gear;

    public Transmission() {
        this.gear = MIN_GEAR; // эта строка не нужна, у тебя gear по умолчанию 0, как и MIN_GEAR
    }

    public void upTransmission() {
        if (gear < MAX_GEAR) {
            gear++;
        } else {
            System.out.println("I can't up the gear, it's maximum");
        }
        System.out.println("Current gear is " + gear);
    }

    public void downTransmission() {
        if (gear > MIN_GEAR) {
            gear--;
        } else {
            System.out.println("I can't down the gear, it's minimum");
        }
        System.out.println("Current gear is " + gear);
    }

    public int getGear() {
        return gear;
    }
}
