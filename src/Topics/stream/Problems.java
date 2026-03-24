package Topics.stream;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problems {
    public static void main(String[] args) {
//        List<Employee> employees = List.of(
//                new Employee(101, "Alice", 60000, "ECE"),
//                new Employee(102, "Aob", 400540, "ECE"),
//                new Employee(103, "Charlie", 600, "MECH"),
//                new Employee(104, "David", 44000, "CSE"),
//                new Employee(105, "Felta", 6050, "MECH"),
//                new Employee(106, "Eagle", 30000, "MECH")
//        );

        /*Names in descending order*/
//        List<String> reverseOrderedNames = employees.stream().map(Employee::getName).sorted(Comparator.reverseOrder()).toList();
//        System.out.println(reverseOrderedNames);

// Second largest salary

//        Double secondLargestSalary = employees.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
//        System.out.println("Second Largest Salary = "+secondLargestSalary);
//
//
//        Map<String, Double> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
//        System.out.println(collect);
//
//        Map<String, Optional<Employee>> collects = employees.stream().
//                collect(Collectors.groupingBy(
//                        Employee::getDepartment,
//                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
//        System.out.println(collects);
//
//        List<Double> sorted = employees.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).toList();
//        System.out.println(sorted);
//
//        long count = employees.stream().map(Employee::getSalary).filter(salary -> salary > 50000).count();
//        System.out.println(count);


//        List<Integer> numbers = List.of(1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1);


//        Set<Integer> seen = new HashSet<>();
//        List<Integer> list = numbers.stream().filter(num -> !seen.add(num)).toList();
//        System.out.println(list);

//        List<Integer> collect = numbers.stream().
//                collect(Collectors.groupingBy(
//                        Function.identity(),
//                        Collectors.counting())).
//                entrySet().
//                stream().
//                filter(integerLongEntry -> integerLongEntry.getValue()==1).map(Map.Entry::getKey).toList();
//        System.out.println(collect);

//        Map<Boolean, List<Integer>> collect = numbers.stream().collect(Collectors.partitioningBy(number -> number % 2 == 0));
//        System.out.println(collect);

//        int sum = numbers.stream().filter(number -> number % 2 != 0).mapToInt(Integer::intValue).sum();
//        System.out.println(sum);

//        OptionalInt sum = numbers.stream().filter(number -> number % 2 != 0).mapToInt(Integer::intValue).max();
//        System.out.println(sum);

//        List<String> words = List.of("hi", "hello", "world", "java", "stream");

//        Map<Integer, List<String>> collect = words.stream().collect(Collectors.groupingBy(s -> s.length()));
//        System.out.println(collect);
//
//        Map<Integer, Long> collect = words.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
//        System.out.println(collect);
//
//        words.stream().collect(Collectors.groupingBy(String::length)).
//                entrySet().stream().max(Map.Entry.comparingByKey()).
//                map(integerListEntry -> integerListEntry.getValue().get(0));

//        String max = words.stream().max(Comparator.comparing(String::length)).orElse(null);
//        System.out.println(max);

//        List<String> names = List.of("Kishore", "Ram", "Anu", "Christopher");
//        Map<Integer, List<String>> collect = names.stream().collect(Collectors.groupingBy(s -> s.length()));
//        System.out.println(collect);
//        String collect = names.stream().collect(Collectors.joining(",")).toUpperCase();
//        System.out.println(collect);

//        List<String> list = names.stream().sorted(Comparator.comparing(String::length)).toList();
//        System.out.println(list);

//        List<String> list = names.stream().sorted().toList();
//        System.out.println(list);

//        List<String> list = names.stream().sorted(Comparator.reverseOrder()).toList();
//        System.out.println(list);

//        List<Integer> nums = List.of(10, 20, 5, 30, 25, 40);
//        Find the square root of number
//        nums.stream().forEach(n-> System.out.println("The square root of "+n+" is "+Math.sqrt(n)));
//        List<Integer> list = nums.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
//        System.out.println(list);

//        List<Integer> list = nums.stream().sorted().skip(1).limit(1).toList();
//        System.out.println(list);

//        String input = "programming";

//        Map<Character, Long> collect = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(collect);

//        Character c1 = input.chars().mapToObj(c -> (char) c).
//                collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).
//                entrySet().stream().filter(e -> e.getValue() == 1).
//                map(Map.Entry::getKey).findFirst().orElse(null);
//        System.out.println(c1);

//        Character c1 = input.chars().mapToObj(c -> (char) c).
//                collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).
//                entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).map(Map.Entry::getKey).orElse(null);

//        Character result = input.chars()
//                .mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(
//                        c -> c,
//                        Collectors.counting()
//                ))
//                .entrySet().stream()
//                .max(Map.Entry.comparingByValue())   // highest frequency
//                .map(Map.Entry::getKey)
//                .orElse(null);
//
//        System.out.println(result);

//        List<List<Integer>> list = List.of(
//                List.of(1,2,3),
//                List.of(4,5,6),
//                List.of(7,8,9)
//        );
//
//        List<Integer> list1 = list.stream().flatMap(List::stream).filter(n->n%2==0).toList();
//        System.out.println(list1);

//        List<String> sentences = List.of(
//                "Java is powerful",
//                "Streams are useful"
//        );
//
//        List<String> list = sentences.stream().map(s -> s.split(" ")).flatMap(Arrays::stream).filter(words->words.length()>4).toList();
//        System.out.println(list);

//        Map<String, List<String>> data = Map.of(
//                "fruits", List.of("apple", "banana"),
//                "vegetables", List.of("carrot", "beans")
//        );
//
//        List<String> list = data.entrySet().stream().flatMap(v -> v.getValue().stream()).toList();
//        System.out.println(list);

//        List<String> list = data.entrySet().stream().flatMap(v -> v.getValue().stream()).map(String::toUpperCase).toList();
//        System.out.println(list);

//        long count = data.entrySet().stream().flatMap(v -> v.getValue().stream()).count();
//        System.out.println(count);

        Department d1 = new Department("IT", List.of(50000.0, 60000.0));
        Department d2 = new Department("HR", List.of(30000.0));
        Department d3 = new Department("Finance", List.of(70000.0, 80000.0));
        Department d4 = new Department("Sales", List.of(40000.0, 45000.0));

        Employee e1 = new Employee(1, "Arun", 55000, null);
        e1.setDepartment(List.of(d1, d2));

        Employee e2 = new Employee(2, "Divya", 75000, null);
        e2.setDepartment(List.of(d3, d1));

        Employee e3 = new Employee(3, "Kiran", 42000, null);
        e3.setDepartment(List.of(d4));

        List<Employee> employees = List.of(e1, e2, e3);


//    /*Using flat map display salary based on department*/
//        Map<String, List<Double>> department_based_salary = employees.stream().
//                flatMap(employee -> employee.getDepartment().stream()).
//                collect(
//                        Collectors.groupingBy(
//                                Department::getName,
//                                Collectors.flatMapping(
//                                        department -> department.getSalaries().stream(),
//                                        Collectors.toList())));
//
//        System.out.println(department_based_salary);
//
//        /* Using flat map display average of department*/
//
//        Map<String, Double> average_of_each_department = employees.stream().
//                flatMap(department -> department.getDepartment().stream()).
//                collect(
//                        Collectors.groupingBy(
//                                Department::getName,
//                                Collectors.averagingDouble(
//                                        department -> department.getSalaries().stream().
//                                                mapToDouble(Double::doubleValue).
//                                                average().orElse(0.0))));
//
//        System.out.println(average_of_each_department);

    }

}
