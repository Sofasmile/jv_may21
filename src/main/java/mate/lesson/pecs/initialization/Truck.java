package mate.lesson.pecs.initialization;

public class Truck extends Machine {
    private static int truckCounter = 0;
    private int maxSpeed;

    public Truck(String color, int maxSpeed) {
        super(color);
        this.maxSpeed = maxSpeed;
        Machine.machineCounter++;
        truckCounter++;
        System.out.println("Truck constructor");
    }
}
