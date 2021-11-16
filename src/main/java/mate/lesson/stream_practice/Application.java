package mate.lesson.stream_practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class Application {
    public static Optional<LocalDate> parseDate(String date) {
        return Optional.of(LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy.MM.dd")));
    }
    public static Optional<LocalDate> customParseDate(String date) {
        return Optional.of(LocalDate.parse(date, DateTimeFormatter.ofPattern("d MMM yyyy")));
    }

    public static void main(String[] args) {
        System.out.println(parseDate("2020.10.11").get());
        System.out.println(customParseDate("10 Jan 2020").get());
    }
}
