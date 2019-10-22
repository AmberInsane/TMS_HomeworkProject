package hw_6.task_2;

/*
У коробки передач должны быть методы “переключить передачу выше” и “переключить передачу ниже”.
Нельзя понизить передачу ниже 0 и повысить больше 7.
 */
public class Transmission {
    private static int MIN_GEAR = 0;
    private static int MAX_GEAR = 7;
    private int gear;

    public Transmission() {
        this.gear = MIN_GEAR;
    }

    public void upTransmission() {
        if (gear < MAX_GEAR) {
            gear++;
        } else {
            System.out.println("I can't up the gear, it's maximum");
        }
    }

    public void downTransmission() {
        if (gear > MIN_GEAR) {
            gear--;
        } else {
            System.out.println("I can't down the gear, it's minimum");
        }
    }

    public int getGear() {
        return gear;
    }
}
