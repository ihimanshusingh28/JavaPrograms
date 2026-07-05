//To find sum of first 100 numbers using callable and exxecutor service
package Java_Concepts.java8;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class Questionone {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Callable<Integer> callableTask = () -> {
            int sum = 0;
            for (int i = 1; i <= 100; i++) {
                sum += i;
            }
            return sum;
        };

        Future<Integer> futureResult = executorService.submit(callableTask);

        try {
            Integer result = futureResult.get(); 
            System.out.println("Sum of first 100 numbers: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown(); 
        }
    }
}
 
