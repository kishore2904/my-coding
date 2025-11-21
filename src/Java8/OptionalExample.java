package Java8;

import java.util.*;

public class OptionalExample {
    public static void main(String[] args){

        String name = null;
        Optional<String> optionalString = Optional.ofNullable(name);

//        String result = optionalString.orElse("NO Name");
//        System.out.println(result);

        List<String> stringList = new ArrayList<>();
        stringList.add("kish");
        stringList.add("kakak");


        List<Integer> result = List.of(1,2,3).stream()
                .peek(n -> System.out.println("Processing: " + n))
                .map(n -> n * 10)
                .toList();
        System.out.println(result);

        List<String> names = List.of("A", "B", "C");
        names.stream().unordered().forEach(System.out::println);

        int sum = List.of(1,2,3).stream().map(n->n*10)
                .reduce(10, Integer::sum);

        long cnt = List.of("a","b","c").stream().count();
        Optional<Integer> first = List.of(1,2,3).stream().findFirst();
        Optional<Integer> any = List.of(1,2,3).parallelStream().findAny();

        boolean resultBoolean = List.of(1,2,3).stream()
                .anyMatch(n -> n > 2);

        boolean resultAllMatch = List.of(1,2,3).stream()
                .allMatch(n -> n >1);

        boolean resultNonMatch = List.of(1,2,0,3).stream()
                .noneMatch(n -> n <= 0);



        System.out.println(resultNonMatch);

    }
}
