import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return id + " - " + name + " - " + salary;
    }
}


public class Main {


    public static void main(String[] args)
    {

        List<Employee> employees = List.of(
                new Employee(101, "Alice", 50000),
                new Employee(102, "Bob", 40000),
                new Employee(103, "Charlie", 60000),
                new Employee(104, "David", 40000)
        );

        System.out.println(employees.get(0).getId());

    }
}