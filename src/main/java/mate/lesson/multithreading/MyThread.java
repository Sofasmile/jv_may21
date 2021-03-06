package mate.lesson.multithreading;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.concurrent.Callable;

public class MyThread implements Callable<String> {
    @Override
    public String call() throws InterruptedException {
        int duration = (new Random().nextInt(10) + 1) * 100;
        Thread.sleep(duration);
        return String.format("Task " + Thread.currentThread().toString() +  " duration was %d ms, execution finished at %s",
                duration, LocalTime.now().format(DateTimeFormatter.ISO_TIME));
    }
}