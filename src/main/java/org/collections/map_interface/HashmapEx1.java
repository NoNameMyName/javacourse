package org.collections.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashmapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Zaur");
        map1.put(120, "Ivan");
        map1.put(15, "Oleg");
        map1.put(32, "Maha");
        map1.put(522, "Petr");
//        map1.put(1000, "Mamble");
//        map1.put(null, "Sergey");
//        map1.put(84564, null);
//        map1.put(null, null);
        map1.putIfAbsent(1000, "aleja");
        System.out.println(map1);
    }
}
