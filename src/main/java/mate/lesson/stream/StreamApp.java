package mate.lesson.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApp {
    public Map<Character, List<String>> groupWordsByLastChar(List<String> words) {
        return words.stream()
                .filter(w -> Character.isAlphabetic(w.charAt(w.length() - 1)))
                .collect(Collectors.groupingBy(w -> w.charAt(w.length() - 1)));
    }

    public static Map<Integer, List<Animal>> convertListAfterJava8(List<Animal> list) {

        Map<Integer, List<Animal>> postsPerType = list.stream()
                .collect(Collectors.groupingBy(Animal::getId));

        return postsPerType;
    }


//    public Map<Integer, List<Person>> groupByAge(List<Person> people) {
//        return people.stream()
//                .filter(p -> p.getSex() == Person.Sex.WOMAN && p.getAge() >= 18
//                        && !p.getCatList().isEmpty())
//                .collect(Collectors.groupingBy(person -> person.getAge()));
//    }

    public static void main(String[] args) {
        Map<Integer, List<Animal>> integerAnimalMap = convertListAfterJava8(List.of(new Animal(1, "cat"),
                new Animal(1, "dog"),
                new Animal(3, "pet")));
        integerAnimalMap.entrySet().forEach(System.out::println);


//        List<String> names = List.of("Anna", "Bob", "Alice", "Steven", "Ben", "Stella");
//
//        Stream<String> streamNames = names.stream()
//                .filter(name -> name.startsWith("A"))
//                .sorted();
//
//        boolean flag = false;
//        if (flag) {
//            List<String> sortedList = streamNames
//                    .collect(Collectors.toList());
//            sortedList.forEach(System.out::println);
//        } else {
//            long count = streamNames.count();
//            System.out.println(count);
//        }
    }
}
