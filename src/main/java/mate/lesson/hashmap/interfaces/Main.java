package mate.lesson.hashmap.interfaces;

public class Main {
    public static void main(String[] args) {
        Writer fileService = new FileService();
        fileService.getDefaultMessage();
        System.out.println(fileService.getDefaultMessage());
    }
}
