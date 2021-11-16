package mate.lesson.hashmap.interfaces;

public interface Writer {
    void write(String text);

    default String getDefaultMessage() {
        return "Writer interface is working...";
    }
}
