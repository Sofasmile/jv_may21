package mate.lesson.multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newScheduledThreadPool(3);
            for (int i = 0; i < 20; i++) {
                Future<String> result = executorService.submit(new MyThread());
                try {
                    System.out.println(result.get());
                } catch (InterruptedException | ExecutionException e) {
                    throw new RuntimeException("Something went wrong!", e);
                }
        }
        executorService.shutdown();
    }
}