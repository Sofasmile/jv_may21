package mate.lesson.exam;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Given a String input with random characters, convert it to a new string where each character
 * in the new string is "(" if that character appears only once in the original string, or ")"
 * if that character appears more than once in the original string. Ignore capitalization when
 * determining if a character is a duplicate.
 */
public class StringEncoder {
    public static void main(String[] args) {
        System.out.println(encode("din")); // "((("
        System.out.println(encode("recede")); // "()()()"
        System.out.println(encode("Success")); // ")())())"
        System.out.println(encode("(( @")); // "))(("
    }

    public static String encode(String word) {
        // recede
        // r - 1
        // e - 3
        // c - 1
        // d - 1

        return Arrays.stream(word.toLowerCase().split("")) // r e c e d e
                // "recede".indexOf("r") -> 0    "recede".lastIndexOf("r") -> 0 (
                // "recede".indexOf("e") -> 1    "recede".lastIndexOf("e") -> 5  )
                .map(s -> word.toLowerCase().indexOf(s) == word.toLowerCase().lastIndexOf(s) ? "(" : ")" )
                .collect(Collectors.joining());

//        Map<String, Long> collect = Arrays.stream(word.toLowerCase().split(""))
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//        return Arrays.stream(word.toLowerCase().split(""))
//                .map(s -> collect.get(s) == 1 ? "(" : ")")
//                .collect(Collectors.joining());
    }
}