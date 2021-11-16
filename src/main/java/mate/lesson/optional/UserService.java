package mate.lesson.optional;

public class UserService {
    public User getByName(String name) {
        for (User user : Db.users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    public User save(User user) {
        Db.users.add(user);
        return user;
    }
}

/*
public class UserService {
    public Optional<User> getByName(String name) {
        for (User user : Db.users) {
            if (user.getName().equals(name)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }

    public User save(User user) {
        Db.users.add(user);
        return user;
    }
}
 */
