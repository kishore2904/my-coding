package Java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

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

        int[] numbers = {5,9,11,2,8,21,1};
        Integer secondHighest = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("Second Highest number: "+secondHighest);

        // 6. Find the longest string in given array

        String[] arrayList = {"Java", "Springboot","Python"};

        String s = Arrays.stream(arrayList).reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
        System.out.println("Longest String: "+ s);

        // 7. Find the values that start with 1

        List<Integer> integerList = List.of(1,5,6,7,11,21,16,111);
        List<String> valueStartsWith1 = integerList.stream().map(x -> x.toString()).filter(x -> x.startsWith("1")).toList();
        System.out.println("Value starts with 1: "+valueStartsWith1);


    }
}
