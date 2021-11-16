package mate.lesson.hashmap.interfaces;

public interface Printer {
    void print(String text);

    default String getDefaultMessage() {
        return "Printer interface is working...";
    }

    void printDefault(String text);

}
