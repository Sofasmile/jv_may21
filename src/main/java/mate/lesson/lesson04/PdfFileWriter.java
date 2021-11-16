package mate.lesson.lesson04;

public class PdfFileWriter implements Writer {
    @Override
    public void write(String text) {
        // TODO write text to file (another logic)
        System.out.println("Text: '" + text + "' written to File .pdf");
    }
}
