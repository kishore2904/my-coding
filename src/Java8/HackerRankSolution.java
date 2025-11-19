package Java8;

import java.util.*;

public class HackerRankSolution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read initial size
        int n = sc.nextInt();

        // Read list elements
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // Number of queries
        int q = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        while (q-- > 0) {
            String query = sc.nextLine().trim();

            if (query.equals("Insert")) {
                String[] parts = sc.nextLine().split(" ");
                int index = Integer.parseInt(parts[0]);
                int value = Integer.parseInt(parts[1]);
                list.add(index, value);

            } else if (query.equals("Delete")) {
                int index = sc.nextInt();
                list.remove(index);
                sc.nextLine(); // clear leftover newline
            }
        }

        // Print final list
        for (Integer num : list) {
            System.out.print(num + " ");
        }
    }
}
