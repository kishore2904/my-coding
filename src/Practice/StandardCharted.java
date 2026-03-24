package Practice;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StandardCharted {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(100, 99, 99, 50, 87, 87, 75, 67, 68, 71, 159);
        /* To find when to buy and sell stock, what is the profit */
//        Integer minValue = Integer.MAX_VALUE;
//        Integer maxValue = 0;
//
//        Integer buy = 0;
//        Integer sell = 0;
//
//        for (Integer price : numbers) {
//            if (price < minValue) {
//                minValue = price;
//                buy = price;
//            } else if (price - minValue > maxValue) {
//                maxValue = price - minValue;
//                sell = price;
//            }
//        }
//
//        System.out.println("Buy at: " + buy);
//        System.out.println("Sell at: " + sell);
//        System.out.println("Max Profit: " + maxValue);


//        /* Display duplicate elements of list */
//
//        Set<Integer> seen_elements = new HashSet<>();
//
//        List<Integer> duplicate_number = numbers.stream().
//                filter(number -> !seen_elements.add(number)).toList();
//
//        System.out.println("The duplicate numbers in an list are: "+duplicate_number);
    }
}
