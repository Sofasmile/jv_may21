package mate.lesson.exam;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Given a String input with some random characters. Your task is to remove every letter having
 * an odd index and return the result in upper case. Note that input will contain only letters
 * without numbers or punctuation.
 */
public class FilterAndModifyLetters {
    public static void main(String[] args) {
        System.out.println(filterLetters("random")); // RNO
        System.out.println(filterLetters("a")); // A
    }

    public static String filterLetters(String input) {
        return IntStream.range(0, input.length())
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> String.valueOf(input.charAt(i)))
                .collect(Collectors.joining())
                .toUpperCase();
    }
}