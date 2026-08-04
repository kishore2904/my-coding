package clientInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class HashMap_TreeMap_ConcurrentHashMap {

    public static void main(String[] args) {

        /*
         * HashMap allows one null key and multiple null values.
         *
         * The order of the elements in HashMap is not guaranteed, as it is based on the hash code of the keys.
         *
         * It is not thread safe.
         * */

        Map<Integer, String> exampleMap = new HashMap<>();

        exampleMap.put(30, "One");
        exampleMap.put(20, "Two");
        exampleMap.put(100, "Three");
        exampleMap.put(null, "empty");

        System.out.println("HashMap: " + exampleMap);

        /*
         * TreeMap will sort the data by default. And it is sorted by key.
         *
         * No null key is allowed But null values are allowed*/

        Map<Integer, String> treeMapExample = new TreeMap<>();

        treeMapExample.put(3, "One");
        treeMapExample.put(20, "Two");
        treeMapExample.put(100, "Three");
        treeMapExample.put(5, null);
        System.out.println(treeMapExample);

        /*
        * ConcurrentHashMap does not allow null key and null values.
        *
        * It is designed for multithread applications
        *
        * No ordering of data.*/
        Map<Integer, String> map = new ConcurrentHashMap<>();

        map.put(1,"BMW");
        map.put(2,"Audi");

        System.out.println(map);



        TreeMap<Employee, String> treeMap= new TreeMap<>();

        treeMap.put(new Employee(25, "John", 5000, "IT"), "Emp1");
        treeMap.put(new Employee(30, "Alice", 7000, "HR"), "Emp2");
        treeMap.put(new Employee(28, "Bob", 6000, "Finance"), "Emp3");




    }


}
