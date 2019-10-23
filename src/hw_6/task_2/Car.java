package hw_6.task_2;

//Есть класс автомобиль. У автомобиля есть коробка передач и  мотор.
/*
Машина должна уметь ездить, т.е. надо завести мотор, включить первую передачу и нажать газ.
Машина не может поехать, если не заведен мотор.
Когда машина едет, то пускай выведет на экран текущую скорость
 */
public class Car {
    private boolean isWork = false;
    private Transmission transmission;
    private Engine engine;

    public Car() {
        this.engine = new Engine();
        this.transmission = new Transmission();
    }

    public boolean isWork() {
        return isWork;
    }

    public void turnOff() {
        isWork = false;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public Engine getEngine() {
        return engine;
    }

    public void pushGasPedal() {
        if (!isWork) {
            System.out.println("You pedaled, good job. Car is moving");
            isWork = true;
        } else {
            System.out.println("Please, stop touch it");
        }
    }

    public int getCurrentSpeed() {
        int currentSpeed = 0;
        if (isWork) {
            currentSpeed = transmission.getGear() * 20;
        }
        return currentSpeed;
    }
}
