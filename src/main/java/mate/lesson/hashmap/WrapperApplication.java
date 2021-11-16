package mate.lesson.hashmap;

public class WrapperApplication {
    public static void main(String[] args) {
        Integer a = 10;
        changeValue(a);
        System.out.println(a);

    }

    public static void changeValue(Integer a) {
        a.byteValue();
    }
}
