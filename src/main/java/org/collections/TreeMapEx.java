package org.collections;


import javax.swing.text.Style;
import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<Studentt, Double> treeMap = new TreeMap<>();
        TreeMap<Double, Studentt> treeMap3 = new TreeMap<>();
        TreeMap<Studentt, Double> treeMap2 = new TreeMap<>(new Comparator<Studentt>() {
            @Override
            public int compare(Studentt o1, Studentt o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        Studentt student1 = new Studentt("Oleg", "Tatarov" , 2);
        Studentt student2 = new Studentt("Tanya", "Mongolka" ,3);
        Studentt student3 = new Studentt("Ira", "Akavivna", 5);
        Studentt student4 = new Studentt("Max", "ADFsd" , 4);
        Studentt student5 = new Studentt("Vova", "dfghfg", 3);
        Studentt student6 = new Studentt("Zaur", "Tregulov",  1);
        Studentt student7 = new Studentt("Sanya", "Alfredov",  2);
        treeMap.put(student4, 7.5);
        treeMap.put(student6, 8.2);
        treeMap.put(student2, 6.4);
        treeMap.put(student3, 7.2);
        treeMap.put(student7, 9.1);
        treeMap.put(student5, 7.9);
        treeMap.put(student1, 5.8);
        treeMap3.put(5.8, student1);
        treeMap3.put(6.4, student2);
        treeMap3.put(7.2, student3);
        treeMap3.put(7.5, student4);
        treeMap3.put(7.9, student5);
        treeMap3.put(8.2, student6);
        treeMap3.put(9.1, student7);
        System.out.println(treeMap3);
    }
}
