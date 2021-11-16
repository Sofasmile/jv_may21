package mate.lesson.lesson04;

public class WriterService {
    private Writer fileWriter;

    public WriterService(Writer fileWriter) {
        this.fileWriter = fileWriter;
    }

    public void writeDataToFile(String text) {

        fileWriter.write("Hello");
    }
}
