package mate.lesson.newtask;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER_OF_SHAPES = 3;
    private static final int MAX_NUMBER = 100;
    private static final String[] colors = {"red", "green", "white"};
    private Random random = new Random();

    public Figure getRandomShape() {
        int index = random.nextInt(MAX_NUMBER_OF_SHAPES);
        switch (index) {
            case 1: return new Circle(getColor(), getNumber());
            case 2: return new Square(getColor(), getNumber());
            case 3:
            default:
                return new Triangle(getColor(), getNumber());
        }
    }

    private int getNumber() {
        return random.nextInt(MAX_NUMBER);
    }

    private String getColor() {
        return colors[random.nextInt(colors.length)];
    }
}
