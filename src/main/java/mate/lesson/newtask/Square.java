package mate.lesson.newtask;

public class Square extends Figure {
    public Square(String color, int number) {
        super(color, number);
    }

    @Override
    public String printInfo() {
        return "This is " + getColor() + " square with number - " + getNumber();
    }
}
