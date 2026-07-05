// The volatile keyword in Java is used to indicate that a variable's value may be modified by multiple threads concurrently.
// When a variable is declared as volatile, it ensures that any read or write operation on that variable is directly performed on the main memory, rather than being cached in a thread's local memory.
// This guarantees that all threads see the most up-to-date value of the variable, preventing issues related to stale or inconsistent data in multi-threaded environments. 
// However, it's important to note that while volatile ensures visibility of changes across threads, it does not provide atomicity for compound operations (like incrementing a counter), so additional synchronization mechanisms may be needed for such cases.

//volatile example in java
package Java_Concepts.java8;
public class Volatileexamp {
    private static volatile boolean flag = false;

    public static void main(String[] args) {
        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            flag = true; // Update the volatile variable
            System.out.println("Writer thread updated flag to true.");
        });

        Thread readerThread = new Thread(() -> {
            while (!flag) {
                // Busy-wait until the flag is updated
            }
            System.out.println("Reader thread detected flag is true.");
        });

        writerThread.start();
        readerThread.start();
    }
}