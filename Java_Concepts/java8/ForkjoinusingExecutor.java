//ForkJoinPool is a framework in Java that allows you to parallelize tasks by breaking them into smaller subtasks and executing them concurrently. 
// It is particularly useful for tasks that can be divided into smaller, independent parts, such as recursive algorithms or divide-and-conquer problems. 
// The ForkJoinPool uses a work-stealing algorithm to efficiently manage threads and balance the workload among available threads.



package Java_Concepts.java8;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ForkjoinusingExecutor {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        SumTask sumTask = new SumTask(numbers, 0, numbers.length);
        int result = forkJoinPool.invoke(sumTask);
        System.out.println("Sum: " + result);

        // Using ExecutorService to execute tasks
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(() -> {
            System.out.println("Task 1 executed");
        });
        executorService.submit(() -> {
            System.out.println("Task 2 executed");
        });
        executorService.shutdown();
    }

    static class SumTask extends RecursiveTask<Integer> {
        private final int[] numbers;
        private final int start;
        private final int end;

        public SumTask(int[] numbers, int start, int end) {
            this.numbers = numbers;
            this.start = start;
            this.end = end;
        }

        @Override
        protected Integer compute() {
            if (end - start <= 2) { // Base case: sum directly if small enough
                int sum = 0;
                for (int i = start; i < end; i++) {
                    sum += numbers[i];
                }
                return sum;
            } else { // Recursive case: split the task
                int mid = (start + end) / 2;
                SumTask leftTask = new SumTask(numbers, start, mid);
                SumTask rightTask = new SumTask(numbers, mid, end);
                leftTask.fork(); // Asynchronously execute the left task
                int rightResult = rightTask.compute(); // Compute the right task synchronously
                int leftResult = leftTask.join(); // Wait for the left task to complete
                return leftResult + rightResult; // Combine results
            }
        }
    }
}