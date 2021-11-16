package mate.lesson.hashmap;

public class PrimitiveApplication {
    public static void main(String[] args) {
        int a = 10;
        changeValue(a);
        System.out.println(a);
    }

    public static void changeValue(int a) {
        a = 20;
    }
}
