package Java_Concepts.java8;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threadlocal {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

        executorService.submit(() -> {
            threadLocal.set(1);
            System.out.println("Task 1: " + threadLocal.get());
        });

        executorService.submit(() -> {
            threadLocal.set(2);
            System.out.println("Task 2: " + threadLocal.get());
        });

        executorService.shutdown();
    }

}
