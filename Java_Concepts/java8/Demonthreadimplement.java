package Java_Concepts.java8;

public class Demonthreadimplement {
    public static void main(String[] args) {
        Thread demonThread = new Thread(() -> {
            while (true) {
                System.out.println("Demon thread is running...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        });
        demonThread.setDaemon(true);
        demonThread.start();

        try {
            Thread.sleep(5000); // Main thread sleeps for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread is exiting...");
    }
}

