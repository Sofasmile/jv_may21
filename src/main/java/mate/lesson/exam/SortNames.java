package mate.lesson.exam;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of names in format List<String>. Your task is to sort names alphabetically
 * and return the first three names after sorting.
 */
public class SortNames {
    public static void main(String[] args) {
        sortNames(List.of("Rick", "Jessie", "George", "Garold")).forEach(System.out::println); // "Garold", "George", "Jessie"
        sortNames(List.of("Rick")).forEach(System.out::println); // "Rick"
    }

    public static List<String> sortNames(List<String> names) {
        return names.stream()
                .sorted()
                .limit(3)
                .collect(Collectors.toList());
    }
}
