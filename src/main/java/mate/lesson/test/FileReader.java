package mate.lesson.test;

import java.io.FileNotFoundException;
import java.sql.SQLDataException;

public class FileReader implements Reader {
    @Override
    public void read() {
        System.out.println("Hello");
    }
}
