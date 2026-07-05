// Synchronized blocks in Java are used to control access to a shared resource by multiple threads. 
// When a thread enters a synchronized block, it acquires a lock on the specified object, preventing other threads from entering any synchronized block 
// that locks on the same object until the first thread exits the block and releases the lock.
//  This mechanism helps to prevent race conditions and ensures that only one thread can access the critical section of code at a time, maintaining data consistency and thread safety. 
// In this example, we demonstrate the use of synchronized blocks to safely increment a shared counter variable from multiple threads, ensuring that the final count is accurate and consistent.


package Java_Concepts.java8;

public class SynchronizedBlockExamp {
     
    private int count = 0;

    public void increment() {
        synchronized (this) {
            count++;
        }
    }

    public int getCount() {
        synchronized (this) {
            return count;
        }
    }

}
