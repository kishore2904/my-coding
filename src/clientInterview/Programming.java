package clientInterview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Programming {

    public static void main(String[] args) {
        List<Integer> list = List.of(2, 5, 8, 9, 10, 5, 8, 13, 16);
        List<String> names = List.of("John", "Alice", "Bob", "Eve");

        List<Employee> employeeList = Arrays.asList(
                new Employee(25, "Vihan", 50000, "ECE"),
                new Employee(30, "Alice", 50000,"MECH"),
                new Employee(28, "Bob", 55000,"CSE"),
                new Employee(44, "kumar", 4500,"EEE"),
                new Employee(29, "David", 62000,"CSE"),
                new Employee(31, "Eva", 70000,"MECH"),
                new Employee(26, "Frank", 52000,"ECE"),
                new Employee(35, "Grace", 85000,"EEE"),
                new Employee(27, "Henry", 58000,"CSE"),
                new Employee(32, "Ivy", 75000,"MECH"),
                new Employee(23, "Jack", 45000,"ECE"),
                new Employee(34, "Karen", 90000,"MECH"),
                new Employee(28, "Leo", 61000,"CSE"),
                new Employee(30, "Mia", 67000,"MECH"),
                new Employee(33, "Nathan", 78000,"CSE"),
                new Employee(26, "Olivia", 53000,"ECE"),
                new Employee(29, "Peter", 60000,"CSE"),
                new Employee(31, "Quinn", 72000,"MECH"),
                new Employee(27, "Rachel", 56000,"CSE"),
                new Employee(36, "Sam", 95000,"EEE"),
                new Employee(25, "Tina", 51000,"IT"),
                new Employee(32, "Uma", 74000,"CIVIl"),
                new Employee(28, "Victor", 59000,"FOOD"),
                new Employee(34, "Wendy", 88000,"EEE")
        );

        /* Find all even numbers from the list*/

        List<Integer> even_number = list.stream().filter(x -> x % 2 == 0).toList();

        System.out.println("Even Numbers: " + even_number);

        /* Find all odd numbers*/
        List<Integer> odd_number = list.stream().filter(y -> y % 2 != 0).toList();

        System.out.println("Odd Numbers: " + odd_number);

        /* Square every number in a list */

        List<Integer> square_numbers = list.stream().map(x -> x * x).toList();

        System.out.println("Square of Numbers: " + square_numbers);

        /* Convert all names to uppercase. */

        List<String> uppercase_Names = names.stream().map(x -> x.toUpperCase()).toList();

        System.out.println("Uppercase names : " + uppercase_Names);

        /*Count how many numbers are greater than 50.*/

        long count = list.stream().filter(x -> x > 50).count();

        System.out.println("Count of numbers greater than 50 : " + count);

        /* Reverse the name*/

        List<String> reversed_names = names.stream().map(name -> new StringBuilder(name).reverse().toString()).toList();

        System.out.println("Reversed names : " + reversed_names);

        /* Sort the numbers*/
        List<Integer> sorted_numbers = list.stream().sorted().toList();

        System.out.println("Sorted numbers : " + sorted_numbers);

        List<Integer> reversed_sorted_numbers = list.stream().sorted(Comparator.reverseOrder()).toList();

        System.out.println("Reversed sorted numbers : " + reversed_sorted_numbers);

        List<String> sort_names = names.stream().sorted().toList();


        List<String> sort_Reverse_Name = names.stream().sorted(Comparator.reverseOrder()).toList();

       employeeList.stream()
               .sorted(Comparator.comparing(Employee::getAge).thenComparing(Employee::getName))
               .forEach(x-> System.out.println(x.getAge() + ", " + x.getName()));

        /* Remove duplicate numbers.*/

        names.stream().distinct().forEach(System.out::println);
        
        /* Find tha max number*/

        Integer max = list.stream().max(Integer::compareTo).orElse(null);

        Employee minEmployee = employeeList.stream().min(Comparator.comparing(Employee::getSalary)).orElse(null);
        System.out.println("Max number: " + max);
        System.out.println("Min employee: " + minEmployee.getSalary());

        /*Find the min number*/

        Integer min = list.stream().min(Integer::compareTo).orElse(null);
        System.out.println("Min number: " + min);


        /*Second-largest number / salary*/

        Integer second_largest = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
        System.out.println("Second-largest number: " + second_largest);

        employeeList
                .stream()
                .sorted(
                        Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .findFirst()
                .ifPresent(employee -> System.out.println("Second-largest salary: " + employee.getSalary()));

    }
}
