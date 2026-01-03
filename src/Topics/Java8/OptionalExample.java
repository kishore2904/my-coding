package Topics.Java8;

import java.util.*;

public class OptionalExample {
    public static void main(String[] args){

        //String name = null;
        //Optional<String> optionalString = Optional.ofNullable(name);

//        String result = optionalString.orElse("NO Name");
//        System.out.println(result);

        Integer sum = List.of(1,2,3,4,5).stream().reduce((integer, integer2) -> integer2-integer).get();
        System.out.println(sum);



    }
}
