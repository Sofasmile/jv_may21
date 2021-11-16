package mate.lesson.exception;

public class Application {
    public static void main(String[] args) {
        String a = "abc";
        String b = a + "123";
        String d = "abc123";
        String e = "abc" + "123";

        System.out.println("1. b == d " + ( b== d));
        System.out.println("2. b == e " + (b == e));
        System.out.println("3. d == e " + (d == e));
    }


}
