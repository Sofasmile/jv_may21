package mate.lesson.streampractice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<String> words1 = List.of("hello", "sunny", "What", "How", "FYI", "apple");
        System.out.println(getThreeBiggestNumbers(words1)); // "apple-how-sunny"

        List<String> words2 = List.of("Monday", "Yuriy", "mood", "banana", "test", "cut", "cream", "Apricot");
        System.out.println(getThreeBiggestNumbers(words2)); // apricot-banana-cut-yuriy
    }

    /**
     * На вхід приходить список будь-яких слів: "hello", "sunny", "What", "How", "FYI", "apple".
     * Потрібно відкинути всі слова, які стоять на парній позиції в списку. // 0, 2, 4,...
     * Відсортувати слова що залишились в алфавітному порядку а також привести їх до нижнього регістру.
     * І повернути строку зі словами в наступному вигляді: "apple-how-sunny"
     */
    private static String getThreeBiggestNumbers(List<String> words) {
        return IntStream.range(0, words.size())
                .filter(i -> i % 2 != 0)// 1, 3, 5, 7
                .mapToObj(index -> words.get(index).toLowerCase()) // sunny, How, apple
                .sorted()
                .collect(Collectors.joining("-"));
    }
}
