// import java.util.concurrent.ExecutorService;
// import java.util.concurrent.Executors;
// import java.util.concurrent.Semaphore;
// public class test2 {
//     private static final Semaphore semaphore1 = new Semaphore(1);
//     private static final Semaphore semaphore2 = new Semaphore(0);
//     public static void main(String[] args) {
//         ExecutorService executor = Executors.newFixedThreadPool(2);
//         executor.submit(() -> {
//             for (int i = 1; i <= 5; i++) {
//                 try {
//                     semaphore1.acquire();
//                     System.out.println("T1: " + i);
//                     semaphore2.release();
//                 } catch (InterruptedException e) {
//                     Thread.currentThread().interrupt();
//                 }
//             }
//         });
//         executor.submit(() -> {
//             for (int i = 1; i <= 5; i++) {
//                 try {
//                     semaphore2.acquire();
//                     System.out.println("T2: " + i);
//                     semaphore1.release();
//                 } catch (InterruptedException e) {
//                     Thread.currentThread().interrupt();
//                 }
//             }
//         });
//         executor.shutdown();    

//     }
// }
//can I do this using cyclicbarrier
//Yes, you can achieve similar synchronization between two threads using a CyclicBarrier. A CyclicBarrier allows a set of threads to wait for each other to reach a common barrier point. Here's how you can modify your code to use a CyclicBarrier instead of Semaphores:
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class test2 {
    private static final CyclicBarrier barrier = new CyclicBarrier(2);
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("T1: " + i);
                try {
                    barrier.await(); // Wait for T2 to reach the barrier
                } catch (Exception e) {
                    Thread.currentThread().interrupt();
                }
            }
        });
        executor.submit(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    barrier.await(); // Wait for T1 to reach the barrier
                } catch (Exception e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("T2: " + i);
            }
        });
        executor.shutdown();
    }
}  