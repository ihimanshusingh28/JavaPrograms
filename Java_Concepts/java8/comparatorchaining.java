package Java_Concepts.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + department + " | " + salary;
    }
}

public class comparatorchaining {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Rahul", "IT", 70000));
        employees.add(new Employee(102, "Aman", "HR", 50000));
        employees.add(new Employee(103, "Neha", "IT", 90000));
        employees.add(new Employee(104, "Vikas", "HR", 60000));
        employees.add(new Employee(105, "Priya", "IT", 90000));

        // Comparator chaining
        Comparator<Employee> employeeComparator =
                Comparator.comparing(Employee::getName)
                          .thenComparing(Employee::getSalary, Comparator.reverseOrder())
                          .thenComparing(Employee::getDepartment);

        Collections.sort(employees, employeeComparator);

        // Print sorted list
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}

