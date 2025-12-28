package Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Intermediate {
    public static void main(String[] args){
        //11. Find the second-highest number in a list.
        //List<Integer> numbers = List.of(5, 10, 5, 20, 10, 30);
        //Integer first = numbers.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().orElseThrow();
        //System.out.println("second-highest number in a list: "+first);

        //12. Find the second-lowest number in a list.
        //List<Integer> numbers = List.of(5, 10, 5, 20, 10, 30);
        //Integer first = numbers.stream().sorted().distinct().skip(1).findFirst().orElseThrow();
        //System.out.println("second-lowest number in a list: "+first);

        //13. Group strings by their length
        //List<String> stringList = List.of("java","spring","boot","api");
        //Map<Integer, List<String>> collect = stringList.stream().collect(Collectors.groupingBy(String::length));
        //System.out.println(collect);

        //14. Count frequency of each character in a string
        String input = "testing";
        Map<String, Long> collect = Arrays.stream(input.split("")).collect(Collectors.groupingBy(s -> s,Collectors.counting()));
        System.out.println(collect);

    }
}
