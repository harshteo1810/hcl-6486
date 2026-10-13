package streams;

import java.util.*;
public class Array {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(1, 23, 4, 6, 7));
        ArrayList<String> l2 = new ArrayList<>(Arrays.asList("raj","rahul","rat","cat","revolt"));
        Map<String,Integer> mp = new HashMap<>();
        mp.put("Raj", 24);
        mp.put("Rahul", 25);
        mp.put("Rishab", 22);
        mp.put("Akhil", 21);
        mp.put("Nikhil", 25);
        mp.put("Ajay", 23);
        mp.put("Sanjay", 26);
        mp.put("Lee", 24);
        l1.stream()
            .filter(n->n%2==0)
            .forEach(System.out::println);
        l2.stream()
            .filter(n-> n.startsWith("r") && n.endsWith("t"))
            .map(n-> "Mr "+ n)
            .sorted()
            .forEach(System.out::println);
        mp.entrySet().stream()
            .filter(n->  n.getKey().startsWith("R"))
            .sorted(
                Map.Entry.<String, Integer>comparingByKey()
                    .thenComparing(Map.Entry.comparingByValue())
                )
            .forEach(System.out::println);
    }
}
