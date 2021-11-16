package mate.lesson.junit;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Application {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 6, 0, 2, 66, 1, 3);
        List<Integer> reversedNumbers = IntStream.range(0, numbers.size())
                .mapToObj(i -> numbers.get(numbers.size() - i - 1))
                .collect(Collectors.toList());
        reversedNumbers.forEach(System.out::println);



//        List<Integer> collect = someListOfIntegers.stream().sorted((a, b) -> a.compareTo(b)).collect(Collectors.toList());
//
//        collect.forEach(System.out::println);
        /*Dictionary dictionary = new Dictionary(new String[]{"javascript", "java", "ruby", "php", "python", "coffeescript"});
        String result = dictionary.findMostSimilar("heaven");
        System.out.println(result);*/
    }
}
