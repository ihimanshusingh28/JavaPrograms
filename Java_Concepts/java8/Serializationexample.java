package Java_Concepts.java8;
import java.io.Serializable;

public class Serializationexample implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    
    public Serializationexample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
} 



