package mate.lesson.lesson01;

public class Application {
    public static void main(String[] args) {
        Integer a = 127;
        Integer b = -128;
        Integer c = 128;
        // 4 byte = 32 bit
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(c));
        // 1 0000010 = 127 + 1 = -128

        // 1 0000000000001 = 32767 + 1 = -32768 +

    }
}
