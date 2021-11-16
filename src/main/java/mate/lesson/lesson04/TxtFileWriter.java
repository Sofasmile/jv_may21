package mate.lesson.lesson04;

public class TxtFileWriter implements Writer {
    @Override
    public void write(String text) {
        // TODO write text to file
        System.out.println("Text: '" + text + "' written to File .txt");
    }

    @Override
    public void say() {
        Writer.test2();
        System.out.println("Good morning");
    }

    public static void test3() {
        Writer.test2();
        System.out.println("Good morning");
    }
}
