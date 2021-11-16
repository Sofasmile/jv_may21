package mate.lesson.test;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Stack;
import java.util.stream.Stream;

public class Main {

    private static final Map<String, String> map = new HashMap<>();

    static {
        map.put("(", ")");
        map.put("{", "}");
        map.put("[", "]");
    }

    public static boolean isValid(String s) {
        Optional<String> as = Optional.of("as");
        Stack<String> stack = new Stack<>();
        String[] characters = s.split("");
        for (String symbol : characters) {
            if (map.keySet().contains(symbol)) {
                stack.push(symbol);
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            String temp = stack.pop();
            if (map.get(temp) == null || ! map.get(temp).equals(symbol)) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        int DAYS_LEFT = 9;
        LocalDate currentDate = LocalDate.now();
        YearMonth yearAndMonth = YearMonth.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM");
        String dateEnd = (currentDate.getDayOfMonth() + DAYS_LEFT > yearAndMonth.lengthOfMonth())
                ? yearAndMonth.atEndOfMonth().format(formatter)
                : currentDate.plusDays(DAYS_LEFT).format( formatter);

        System.out.println(dateEnd);
//        System.out.println(isValid("()[]{}"));
//        System.out.println(isValid("(]"));
//        System.out.println(isValid("{[]}"));
//        System.out.println(isValid("([)]"));
//        String s = "0 9026315 -827&()";
//        System.out.println(isSumOfCubes(s));
        // "0 0 Lucky"
    }

    public static String isSumOfCubes(String s) {
        List<String> cubes = new ArrayList<>();
        String[] split = s.replaceAll("[^\\d]", " ").trim().split("\\s+");
        for (String num : split) {
            String[] split1 = num.split("(?<=\\G...)");
            for (String top3 : split1) {
                if (top3.equals(top3.chars().map(n -> (int) Math.pow(n - 48., 3)).sum() + "")) {
                    cubes.add(top3);
                }
            }
        }
        return cubes.isEmpty() ? "Unlucky" : String.join(" ", cubes) + " " + cubes.stream().mapToInt(Integer::parseInt).sum() + " Lucky";
    }
}
