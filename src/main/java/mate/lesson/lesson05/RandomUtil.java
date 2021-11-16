package mate.lesson.lesson05;

import java.util.Random;

public class RandomUtil {
    private static final int DEFAULT_UPPER_BOUND = 100;

    public int getRandomNumber(int upperBound) {
        return new Random().nextInt(upperBound);
    }

    public int getRandomNumber() {
        return new Random().nextInt(DEFAULT_UPPER_BOUND);
    }
}
