package mate.lesson.hashmap;

public class CarApplication {
    public static void main(String[] args) {
        Car car1 = new Car(2019, "A5");
        // car1 - [S11]
        car1 = changeValue(car1);
        System.out.println(car1.getYear()); // 2019 "A5"

    }

    public static Car changeValue(Car car) { // S11
        car = new Car(2017, "S"); // [S22]
        return car;
    }
}
