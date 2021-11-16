package mate.lesson.optional;

import java.util.ArrayList;
import java.util.List;

public class Db {
    public static List<User> users = new ArrayList<>();

    static {
        users.add(new User("Bob", 19));
        users.add(new User("Alice", 21));
        users.add(new User("John", 26));
        users.add(new User("Bill", 23));
        users.add(new User("Steven", 20));
    }
}
