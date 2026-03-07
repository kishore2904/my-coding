package Practice;

import java.util.List;

public class StandardCharted {
    public static void main(String[] args){

        List<Integer> numbers = List.of(100,99,50,87,75,67,68,71,159);

        Integer minValue = Integer.MAX_VALUE;
        Integer maxValue = 0;

        Integer buy = 0;
        Integer sell = 0;

        for (Integer price : numbers) {
            if (price < minValue) {
                minValue = price;
                buy = price;
            } else if (price - minValue > maxValue) {
                maxValue = price - minValue;
                sell = price;
            }
        }

        System.out.println("Buy at: " + buy);
        System.out.println("Sell at: " + sell);
        System.out.println("Max Profit: " + maxValue);
    }
}
