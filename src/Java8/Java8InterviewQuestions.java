package Java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8InterviewQuestions {

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

        // To get the unique element from string
        String uniqueElement = "kishorekannanjithu";
        List<String> uniqueList = Arrays.stream(uniqueElement.split(""))
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet()
                .stream().filter(x -> x.getValue() == 1)
                .map(Map.Entry::getKey).toList();
        System.out.println(list);

        // To get first non-repeating char
        String nonRepeatingElement = "kishorekannanjithu";
        String nonRepeating = Arrays.stream(nonRepeatingElement.split(""))
                .collect(Collectors.groupingBy(x -> x, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1)
                .findFirst().get().getKey();
        System.out.println(nonRepeating);

    }
}
