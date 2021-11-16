package mate.lesson.functional;

import java.time.*;
import java.time.format.*;
import java.util.Locale;

public class Test {
    public static void main(String[] args) {
        DateTimeFormatter dTF = DateTimeFormatter.ofPattern("dd MMM yyyy", Locale.UK);
        String anotherDate = "04 Вер 2019";
        LocalDate lds = LocalDate.parse(anotherDate, dTF);
        System.out.println(lds);
    }
}
