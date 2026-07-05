// ExecutorService is a framework in Java that provides a higher-level replacement for working with threads directly.
// It allows you to manage a pool of threads and submit tasks for execution, making it easier to handle concurrent programming and improve performance in multi-threaded applications.
// ExecutorService provides methods for submitting tasks, managing thread pools, and controlling the lifecycle of threads, allowing developers to focus on the logic of
// their applications rather than the complexities of thread management. It is part of the java.util.concurrent package and is commonly used in scenarios where you need to execute multiple tasks concurrently,
//  such as in server applications, parallel processing, or background task execution.
// 




package Java_Concepts.java8;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Executorserviceexamp {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(() -> {
            System.out.println("Task 1 executed");
        });
        executorService.submit(() -> {
            System.out.println("Task 2 executed");
        });
        executorService.shutdown();

        //Threadpoolexecutor example
        ExecutorService threadPoolExecutor = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            threadPoolExecutor.submit(() -> {
                System.out.println("Task " + taskId + " executed by " + Thread.currentThread().getName());
            });
        }
        threadPoolExecutor.shutdown();  

    }
}
