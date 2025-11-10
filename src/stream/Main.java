package stream;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args)
    {

        List<Employee> employees = List.of(
                new Employee(101, "Alice", 600),
                new Employee(102, "Aob", 400540),
                new Employee(103, "Charlie", 600),
                new Employee(104, "David", 44000)
        );
        //Stream Filter
        System.out.println("Stream Filter");
        employees.stream().filter(salary-> salary.getId()%2==0).forEach(System.out::println);

        //Stream map
        System.out.println("Stream map");
        employees.stream().map(name -> name.getName().toUpperCase()).forEach(System.out::println);

        //Stream sort
        System.out.println("Stream sort");
        employees.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);

        //Stream sort reverse order
        System.out.println("Stream sort reverse order");
        employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);

        //Stream distinct( remove duplicate)
        System.out.println("Stream distinct( remove duplicate)");
        List<Integer> numbers = List.of(1,6,5,5,5);
        numbers.stream().distinct().forEach(System.out::println);

        //Stream distinct ( remove duplicate using helper method)
        System.out.println("Stream distinct (remove duplicate)");
        employees.stream().filter(distinctByKey(Employee::getSalary)).forEach(System.out::println);

        //Stream limit
        System.out.println("Stream Limit");
        employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(2).forEach(System.out::println);

        //Stream skip
        System.out.println("Stream skip");
        long num = employees.stream().skip(2).count();
        System.out.println("Count : "+num);

        //Stream peek
        System.out.println("Stream peek");
        employees.stream().peek(n-> System.out.println("Before transform\n"+n.getName())).map(n-> n.getName().toUpperCase()).forEach(System.out::println);

        List<Employee> employeesList = employees.stream().filter(employee -> employee.getName().startsWith("A")).toList();
        System.out.println(employeesList);

    }


    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    }
}