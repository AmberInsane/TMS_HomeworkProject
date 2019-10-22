package hw_6.task_2;

//Есть класс автомобиль. У автомобиля есть коробка передач и  мотор.
/*
Машина должна уметь ездить, т.е. надо завести мотор, включить первую передачу и нажать газ.
Машина не может поехать, если не заведен мотор.
Когда машина едет, то пускай выведет на экран текущую скорость
 */
public class Car {
    private boolean work = false;
    private Transmission transmission;
    private Engine engine;

    public Car() {
        this.engine = new Engine();
        this.transmission = new Transmission();
    }

    public void pedalGas() {
        if (!work) {
            work = true;
            System.out.println("You pedaled, good job");
        } else {
            System.out.println("Please, stop touch it");
        }
    }

    public void start() {
        if (!work) {
            engine.start();
            transmission.upTransmission();
            pedalGas();
        }
    }

    public int getCurrentSpeed() {
        return this.transmission.getGear() * 20;
    }

    @Override
    public String toString() {
        return "Car{" +
                "work=" + work +
                ", transmission=" + transmission +
                ", engine=" + engine +
                ", currentSpeed=" + getCurrentSpeed() +
                '}';
    }
}
