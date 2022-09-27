package Ngay_11.Bai_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class bai_4 {
    public static void main(String[] args) {
        String ax = "Anh Sy xấu trai xấu trai";
        String[] x = ax.split(" ");
        String key ="";
        Integer value;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < x.length; i++) {
            key = x[i];
            if(map.containsKey(key)){
                value = map.get(key);
                map.remove(key);
                map.put(key, ++value);
            } else{
                map.put(key, 1);
            }
        }
        Set<String> set = map.keySet();
        for (String keyX : set) {
            System.out.println(keyX + " " + map.get(keyX));
        }
    }
}
