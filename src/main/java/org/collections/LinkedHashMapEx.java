package org.collections;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<Double, Studentt> linkedHashMap =
                new LinkedHashMap<>(16, 0.72f, false);
        Studentt student1 = new Studentt("Oleg", "Tatarov" , 2);
        Studentt student2 = new Studentt("Tanya", "Mongolka" ,3);
        Studentt student3 = new Studentt("Ira", "Akavivna", 5);
        Studentt student4 = new Studentt("Max", "ADFsd" , 4);
        linkedHashMap.put(7.2, student3);
        linkedHashMap.put(7.5, student4);
        linkedHashMap.put(5.8, student1);
        linkedHashMap.put(6.4, student2);
        System.out.println(linkedHashMap);

        System.out.println(linkedHashMap.get(5.8));
        System.out.println(linkedHashMap.get(7.5));
        System.out.println(linkedHashMap);
    }
}
