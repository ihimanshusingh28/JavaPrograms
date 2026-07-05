// Semaphore is a synchronization mechanism in Java that allows controlling access to a shared resource by multiple threads.
// It maintains a set of permits, and threads can acquire or release these permits to gain access
// to the shared resource. Semaphores are commonly used to limit the number of threads that can access a particular resource concurrently, preventing resource contention and ensuring thread safety.
// In this example, we demonstrate the use of Semaphore to control access to a shared resource by multiple threads, allowing only a limited number of threads to access the resource at a time and ensuring proper synchronization and coordination among threads.

package Java_Concepts.java8;
import java.util.concurrent.Semaphore;
public class Semaphoreexamp {
    public static void main(String[] args) {
        
        Semaphore semaphore = new Semaphore(2);

        for (int i = 1; i <= 5; i++) {
            final int threadId = i;
            new Thread(() -> {
                try {
                    System.out.println("Thread " + threadId + " is waiting for a permit.");
                    semaphore.acquire();
                    System.out.println("Thread " + threadId + " has acquired a permit.");
                    Thread.sleep(2000);
                    System.out.println("Thread " + threadId + " is releasing the permit.");
                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
