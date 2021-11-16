package mate.lesson.newtask;

public class Circle extends Figure {
    public Circle(String color, int number) {
        super(color, number);
    }

    @Override
    public String printInfo() {
        return "This is " + getColor() + " circle with number - " + getNumber();
    }
}
