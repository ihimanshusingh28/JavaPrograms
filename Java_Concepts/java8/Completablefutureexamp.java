//CompletableFuture<User> user =
//         supplyAsync(() -> userService.get());

// CompletableFuture<Order> order =
//         supplyAsync(() -> orderService.get());

// CompletableFuture<Notification> notif =
//         supplyAsync(() -> notificationService.get());

// CompletableFuture.allOf(
//         user,
//         order,
//         notif
// ).join();
// 1 second execution time
//Use thenApply when your next processing step is a regular, fast, or data-transforming function that returns a standard object.
// Use thenCompose when your next processing step is an asynchronous operation that returns a CompletableFuture, allowing you to chain multiple asynchronous tasks together.    
// Use applyToEitherAsync when you want to proceed with the result of the first completed CompletableFuture among multiple asynchronous tasks, allowing you to handle whichever task finishes first.
//CompletableFuture is a Java 8 class used for asynchronous and non-blocking programming. It extends the capabilities of Future by supporting callback chaining, task composition, exception handling, and combining multiple asynchronous operations. 
// Methods like supplyAsync(), thenApply(), thenCompose(), allOf(), and exceptionally() make it easy to build scalable concurrent applications. In microservices,
// CompletableFuture is commonly used to execute independent service calls in parallel, reducing overall response time and improving throughput.

package Java_Concepts.java8;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Completablefutureexamp {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> {
            
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello, World!";
        }).thenAccept(result -> {
            System.out.println("Result: " + result);
        }).exceptionally(ex -> {
            System.out.println("Error: " + ex.getMessage());
            return null;
        });
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        CompletableFuture<String> user =
        CompletableFuture.supplyAsync(() -> "Himanshu");

CompletableFuture<String> order =
        CompletableFuture.supplyAsync(() -> "Order123");

CompletableFuture<String> result =
        user.thenCombine(order,
                (u, o) -> u + " " + o);

try {
    System.out.println(result.get());
} catch (InterruptedException | ExecutionException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
//examples of thenAccept and thenApply
CompletableFuture<String> future =
        CompletableFuture.supplyAsync(() -> "Hello");
        result = future.thenApply(s -> s + " World");
        result.thenAccept(System.out::println); 
// examples of thencompose
CompletableFuture<String> future1 =
        CompletableFuture.supplyAsync(() -> "Hello");
CompletableFuture<String> result1 =
        future1.thenCompose(s -> CompletableFuture.supplyAsync(() -> s + " World"));
result1.thenAccept(System.out::println);
//example of applyToEitherAsync
CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
    try {
        Thread.sleep(2000); 
    } catch (InterruptedException e) {
        e.printStackTrace();    
        return null;    

 
    }
    return "Result from Future 1";
});
CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> {
    try {
        Thread.sleep(1000); 
    } catch (InterruptedException e) {
        e.printStackTrace();
        return null;
    }
    return "Result from Future 2";
});
CompletableFuture<String> result2 = future2.applyToEitherAsync(future3, s -> s);
result2.thenAccept(System.out::println);

}

}
