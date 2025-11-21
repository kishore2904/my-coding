package Java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8InterviewQuestionsStream {

    public static void main(String[] args) {

        // 1. To count the occurrence of the string
        String input = "kishorekannanjithu";
        Map<String, Long> collect = Arrays.stream(input.split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.groupingBy(Function.identity(), TreeMap::new, Collectors.counting()));
        System.out.println(collect);

        // 2. To find all duplicate number from string

        String inputData = "kishorekannanjithu";
        List<String> list = Arrays.stream(inputData.split("")).
                collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() > 1).map(Map.Entry::getKey).toList();

        // 3. To get the unique element from string
        String uniqueElement = "kishorekannanjithu";
        List<String> uniqueList = Arrays.stream(uniqueElement.split(""))
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet()
                .stream().filter(x -> x.getValue() == 1)
                .map(Map.Entry::getKey).toList();
        System.out.println(list);

        // 4. To get first non-repeating char
        String nonRepeatingElement = "kishorekannanjithu";
        String nonRepeating = Arrays.stream(nonRepeatingElement.split(""))
                .collect(Collectors.groupingBy(x -> x, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1)
                .findFirst().get().getKey();
        System.out.println(nonRepeating);

        // 5. Second-Highest number from array

        int[] numbers = {5, 9, 11, 2, 8, 21, 1};
        Integer secondHighest = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("Second Highest number: " + secondHighest);

        // 6. Find the longest string in given array

        String[] arrayList = {"Java", "Springboot", "Python"};

        String s = Arrays.stream(arrayList).reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
        System.out.println("Longest String: " + s);

        // 7. Find the values that start with 1

        List<Integer> integerList = List.of(1, 5, 6, 7, 11, 21, 16, 111);
        List<String> valueStartsWith1 = integerList.stream().map(Object::toString).filter(x -> x.startsWith("1")).toList();
        System.out.println("Value starts with 1: " + valueStartsWith1);

        //infosys-test,nscc-last,dtcc-next change to infosys nscc dtcc
        String inputString = "infosys-test,nscc-last,dtcc-next";
        List<String> stringList = Arrays.stream(inputString.split(","))
                .map(x -> x.split("-")[0]).toList();
        System.out.println(stringList);

        // Split the input by non-alphabet
        String name = "He is a very very good boy, isn't he?";

        // [^A-Za-z]+ => this will split by non-alphabet.
        // \\d+ => this will split by numbers.
        // \\s+ => split by space.


        List<String> inputArray = Arrays.stream(name.split("[^A-Za-z]+")).toList();
        System.out.println(inputArray.size());
        for (String S : inputArray){
            System.out.println(S);
        }

        List<Integer> result = Stream.of(1,2,3)
                .peek(n -> System.out.println("Processing: " + n))
                .map(n -> n * 10)
                .toList();
        System.out.println(result);

        List<String> names = List.of("A", "B", "C");
        names.stream().unordered().forEach(System.out::println);

        int sum = Stream.of(1,2,3).map(n->n*10)
                .reduce(10, Integer::sum);

        long cnt = Stream.of("a","b","c").count();
        Optional<Integer> first = Stream.of(1,2,3).findFirst();
        Optional<Integer> any = List.of(1,2,3).parallelStream().findAny();

        Stream.of(1, 2, 3)
                .anyMatch(n -> n > 2);
        boolean resultBoolean = true;

        Stream.of(1, 2, 3)
                .allMatch(n -> n > 1);
        boolean resultAllMatch = false;

        boolean resultNonMatch = Stream.of(1,2,0,3)
                .noneMatch(n -> n <= 0);



        System.out.println(resultNonMatch);

    }
}
