package hw_17.task_6;

public class ShipsMain {
    private static final int TUNNEL_MAX_CAPACITY = 3;
    private static final Tunnel TUNNEL = new Tunnel(TUNNEL_MAX_CAPACITY);

    private static final int BERTH_MAX_CAPACITY = 5;
    private static final int BERTH_UNLOAD_TIME = 100;
    private static final Berth BERTH = new Berth(BERTH_MAX_CAPACITY, BERTH_UNLOAD_TIME);

    private static int SHIP_NUMBER = 5;
    private static int[] SHIPS_CAPACITY = {20, 50, 100};

    // выглядит неплохо, молодец
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < SHIP_NUMBER; i++) {
            TransportShip ship = new TransportShip(i, SHIPS_CAPACITY[(int) (Math.random() * SHIPS_CAPACITY.length)]);
            Thread.sleep(2000);
            System.out.println(String.format("%s created", ship));

            ShipThread shipJourney = new ShipThread(ship, BERTH, TUNNEL);
            new Thread(shipJourney).start();
        }
    }
}
