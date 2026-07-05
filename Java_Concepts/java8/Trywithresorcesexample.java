//Try-with-resources is a Java feature that automatically closes resources (like files, streams, or database connections) 
// when the try block finishes, eliminating the need for a manual finally block.
//try-with-resources is particularly useful for managing resources that implement the AutoCloseable interface, ensuring that they are properly closed even if an exception occurs.
//In this example, we use try-with-resources to read a file named "example.txt" using a BufferedReader.





package Java_Concepts.java8;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Trywithresorcesexample {
     
    public static void main(String[] args) {
        String filePath = "example.txt"; 
 try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            

}

    }
}

