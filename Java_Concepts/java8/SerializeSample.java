package Java_Concepts.java8;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeSample {
    public static void main(String[] args) {
        Serializationexample obj = new Serializationexample("Himanshu", 18);
        
        
        try (FileOutputStream fileOut = new FileOutputStream("object.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(obj);
            System.out.println("Object serialized: " + obj.getName() + ", " + obj.getAge());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fileIn = new FileInputStream("object.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            Serializationexample deserializedObj = (Serializationexample) in.readObject();
            System.out.println("Object deserialized: " + deserializedObj.getName() + ", " + deserializedObj.getAge());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace(); 
        }
    
}
    }

