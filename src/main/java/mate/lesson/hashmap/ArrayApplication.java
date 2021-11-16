package mate.lesson.hashmap;

public class ArrayApplication {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // S11
        changeValue(array); // S11
        System.out.println(array[0]);
    }

    public static void changeValue(int[] array) { // S11
        array[0] = 500; // S11 [500]
    }
}
