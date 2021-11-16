package mate.lesson.newtask;

public abstract class Figure {
    private String color;
    private int number;

    public Figure(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    public abstract String printInfo();
}
