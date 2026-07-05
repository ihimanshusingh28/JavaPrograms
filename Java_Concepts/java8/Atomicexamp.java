// AtomicInteger is a class in Java that provides a way to perform atomic operations on integer values.
// It is part of the java.util.concurrent.atomic package and is designed to be used in multi-threaded environments where multiple threads may need to update a shared integer value concurrently.
// AtomicInteger provides methods for performing atomic operations such as incrementing, decrementing, and updating the integer value without the need
// for explicit synchronization, making it a useful tool for implementing thread-safe counters, flags, and other shared integer values in concurrent applications.
//




package Java_Concepts.java8;
import java.util.concurrent.atomic.AtomicInteger;
//This class demonstrates the use of AtomicInteger for thread-safe operations without explicit synchronization.
public class Atomicexamp {
    private AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet();
    }

    public int getCount() {
        return count.get();
    }
     
}
