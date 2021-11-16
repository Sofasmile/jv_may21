package mate.lesson.newtask;

public class Triangle extends Figure {
    public Triangle(String color, int number) {
        super(color, number);
    }

    @Override
    public String printInfo() {
        return "This is " + getColor() + " triangle with number - " + getNumber();
    }
}
