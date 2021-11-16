package mate.lesson.lesson04;

public interface Writer {
    public static final String a = "hello";

    void write(String text);

    default void say() {
        test();
        System.out.println("Hello");
    }

    private void test() {
        System.out.println("Hello");
    }

    static void test2() {

    }
}

