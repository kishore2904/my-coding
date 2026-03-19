package Topics.stream;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problems {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(101, "Alice", 60000, "ECE"),
                new Employee(102, "Aob", 400540, "ECE"),
                new Employee(103, "Charlie", 600, "MECH"),
                new Employee(104, "David", 44000, "CSE"),
                new Employee(105, "Felta", 6050, "MECH"),
                new Employee(106, "Eagle", 30000, "MECH")
        );


        Map<String, Double> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(collect);

        Map<String, Optional<Employee>> collects = employees.stream().
                collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
        System.out.println(collects);

        List<Double> sorted = employees.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).toList();
        System.out.println(sorted);

        long count = employees.stream().map(Employee::getSalary).filter(salary -> salary > 50000).count();
        System.out.println(count);
    }

}
