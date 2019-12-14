package hw_17.task_6;

public class ShipThread implements Runnable {
    private TransportShip ship;
    private Berth berth;
    private Tunnel tunnel;

    public ShipThread(TransportShip ship, Berth berth, Tunnel tunnel) {
        this.ship = ship;
        this.berth = berth;
        this.tunnel = tunnel;
    }

    @Override
    public void run() {
        goForward(true);
        unloadShip();
        goForward(false);
    }

    private void goForward(boolean isForward) {
        try {
            tunnel.acquire();

            // думаю лучшим способом сделать енам с сообщениями и передавать их в метод, чем тернарный оператор
            System.out.println(String.format("%s goes %s the tunnel", ship, isForward ? "forward" : "backward"));
            Thread.sleep(50 * ship.getCapacity());

            System.out.println(String.format("%s released the tunnel", ship));
            tunnel.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void unloadShip() {
        try {
            berth.acquire();

            System.out.println(String.format("%s is unloading in the berth", ship));
            Thread.sleep(berth.getUnloadTimePerTon() * ship.getCapacity());

            berth.release();
            System.out.println(String.format("%s finished unload in the berth", ship));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
