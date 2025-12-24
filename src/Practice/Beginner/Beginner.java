package Practice.Beginner;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Beginner {
    public static void main(String[] args){
        // 1. Filter even numbers from a list
        //Stream.of(1,2,3,4,5,6,7,8,12).filter(integer -> integer %2==0).forEach(integer -> System.out.println("Even number "+integer));

        // 2. Filter odd numbers from a list
        //Stream.of(1,2,3,4,5,6,7,8,12).filter(integer -> integer %2!=0).forEach(integer -> System.out.println("Odd number "+integer));

        //3. Square all numbers in a list
        //Stream.of(1,2,3,4,5,6,7,8,12).map(integer -> integer *integer).forEach(System.out::println);

        //4. Convert all strings to uppercase
        //Stream.of("Kishore","Ram","Mani").map(String::toUpperCase).forEach(System.out::println);

        //5. Count strings starting with a given letter
        //long count = List.of("Apple", "Banana", "Avocado", "Apricot", "Berry", "Almond").stream().filter(s -> s.startsWith("A")).count();
        //System.out.println("Count of string starting with given letter: "+ count);

        //6. Remove duplicate elements from a list
        //numbers = [5, 10, 5, 20, 10, 30];
        //Set<Integer> collect = Stream.of(5, 10, 5, 20, 10, 30).collect(Collectors.toSet());
        //System.out.println(collect);

    }
}
