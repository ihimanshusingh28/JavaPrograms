
// Anonymous classes in Java are a way to define and instantiate a class at the same time, without explicitly naming the class. 
// They are often used to provide a concise implementation of an interface or an abstract class, especially when the implementation is only
//  needed in a specific context and does not require a separate named class. 
// Anonymous classes can be useful for creating event listeners, callbacks, or simple implementations of functional interfaces in a more compact and readable manner.
package Java_Concepts.java8;

public class Anonymousclassexamp {
  public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous class implementation of Runnable");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
//example 2 of anonymous class
// package Java_Concepts.java8;

// public class AnonymousClassExample2 {
//     public static void main(String[] args) {
//         // Creating an anonymous class that implements the Greeting interface
//         Greeting greeting = new Greeting() {
//             @Override
//             public void sayHello() {
//                 System.out.println("Hello from the anonymous class!");
//             }
//         };
//         greeting.sayHello();
//     }
// }
