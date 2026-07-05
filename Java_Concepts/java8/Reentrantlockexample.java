//ReentrantLock is a synchronization mechanism in Java that allows multiple threads to access a shared resource in a controlled manner.
// It provides more flexibility than the synchronized keyword, allowing for features like fairness policies and interruptible locks. 
// ReentrantLock is part of the java.util.concurrent.locks package and is commonly used in scenarios where you need to manage concurrent access to shared resources, such as in multi-threaded applications or when implementing custom synchronization logic.
//  It is called "reentrant" because the same thread can acquire the lock multiple times without causing a deadlock, as long as it releases the lock the same number of times it was acquired. 
// This makes it suitable for scenarios where a thread may need to re-enter a synchronized block of code that it already holds the lock for, allowing for more complex synchronization patterns and avoiding potential deadlocks in certain situations. 
// ReentrantLock also provides additional features like tryLock() for non-blocking lock acquisition and the ability to specify a fairness policy, which can help prevent thread starvation in scenarios where multiple threads are competing for the same lock. Overall,
//  ReentrantLock is a powerful tool for managing concurrent access to shared resources in Java, providing more control and flexibility than traditional synchronization mechanisms. 
// In this example, we demonstrate the use of ReentrantLock to synchronize access to a shared resource between two threads, ensuring that only one thread can access the critical section at a time while allowing for reentrant behavior and proper lock management.


package Java_Concepts.java8;
import java.util.concurrent.locks.ReentrantLock;

public class Reentrantlockexample {
    private static final ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            lock.lock();
            try {
                System.out.println("Thread 1 acquired the lock.");
                
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
                System.out.println("Thread 1 released the lock.");
            }
        });

        Thread thread2 = new Thread(() -> {
            lock.lock();
            try {
                System.out.println("Thread 2 acquired the lock.");
                
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
                System.out.println("Thread 2 released the lock.");
            }
        });

        thread1.start();
        thread2.start();
    }



}
