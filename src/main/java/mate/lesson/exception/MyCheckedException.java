package mate.lesson.exception;


public class MyCheckedException extends Exception {
     // checked -> extends Exception or unchecked -> extends RuntimeException

    public MyCheckedException(String message) {
        super(message);
    }
}
