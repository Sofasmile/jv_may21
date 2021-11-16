package mate.lesson.pecs.initialization;

public class Machine {
    public static int machineCounter = 0;
    private String color;

    public Machine(String color) {
        this.color = color;
        System.out.println("Machine constructor");
    }
}
