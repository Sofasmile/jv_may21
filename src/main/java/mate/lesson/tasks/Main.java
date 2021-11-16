package mate.lesson.tasks;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String args[]) {
        Role role = new Role();
        String role1 = "USER";
        role.setRoleName(Role.ROLE_NAME.valueOf(role1));



        String [] symbols = {"a", "v", "c", "a", "c"};
        Map<String, Long> collect =
                Arrays.stream(symbols)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
