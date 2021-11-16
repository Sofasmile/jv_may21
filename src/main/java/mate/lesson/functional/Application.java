package mate.lesson.functional;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Application {
    public static String[] names = {"Anna", "Bob", "John", "Alice", "Andre", "Stephan"};

    public static void main(String[] args) {
        // 1. generate 10 random users
        // 2. get all users over 10 years old from source data
        // 3. get all names from users
        // 4. sort
        Random random = new Random();

        Supplier<User> supplyUsers = () -> new User(random.nextInt(31),
                names[random.nextInt(names.length)]);

        Stream.generate(supplyUsers)
                .limit(10)
                .filter(user -> user.getAge() > 10)
                .map(User::getName)
                .sorted()
                .forEach(System.out::println);


        /*User[] users = new User[10];
        for (int i = 0; i < 10; i++) {
            users[i] = supplyUsers.get();
        }
        System.out.println(Arrays.toString(users));

        List<User> list = new ArrayList<>();
        for (User user : users) {
            if (ageFilter.test(user)) {
                list.add(user);
            }
        }

        list.forEach(System.out::println);

        Set<String> names = new TreeSet<>();
        for (User user : list) {
            names.add(mapUser.apply(user));
        }
        names.forEach(System.out::println);*/
    }
}
