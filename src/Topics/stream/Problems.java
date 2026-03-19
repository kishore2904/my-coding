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
//
//        String collect = names.stream().collect(Collectors.joining(",")).toUpperCase();
//        System.out.println(collect);

//        List<String> list = names.stream().sorted(Comparator.comparing(String::length)).toList();
//        System.out.println(list);

//        List<String> list = names.stream().sorted().toList();
//        System.out.println(list);

//        List<String> list = names.stream().sorted(Comparator.reverseOrder()).toList();
//        System.out.println(list);

//        List<Integer> nums = List.of(10, 20, 5, 30, 25, 40);
//        List<Integer> list = nums.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
//        System.out.println(list);

//        List<Integer> list = nums.stream().sorted().skip(1).limit(1).toList();
//        System.out.println(list);

        String input = "programming";

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

        Character result = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        Collectors.counting()
                ))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())   // highest frequency
                .map(Map.Entry::getKey)
                .orElse(null);

        System.out.println(result);
    }

}
