package mate.lesson.optional;

public class OptionalApplication {
    public static void main(String[] args) {
        UserService userService = new UserService();
        User ben = userService.getByName("Ben");
        System.out.println(ben.getAge());
    }
}
