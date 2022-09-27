package Ngay_12.Bai_1;

import java.util.*;

public class Bai_1 {
    public static void main(String[] args) {
        Map<Integer,String > hashMap = new HashMap<>();
        hashMap.put(30,"Smith");
        hashMap.put(0,"Anderson");
        hashMap.put(29,"Anderson");
        hashMap.put(2,"Cook");
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        Map<Integer,String> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);

        Set<String> keys = linkedHashMap.keySet();
        for (String s: keys) {
            System.out.println( s + " - " + linkedHashMap.get(s));
        }
    }
}
