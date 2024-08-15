package org.collections;

import java.util.Hashtable;

public class HashTableEx {
    public static void main(String[] args) {
        Hashtable<Double, Studentt> ht = new Hashtable<>();
        Studentt student1 = new Studentt("Oleg", "Tatarov" , 2);
        Studentt student2 = new Studentt("Tanya", "Mongolka" ,3);
        Studentt student3 = new Studentt("Ira", "Akavivna", 5);
        Studentt student4 = new Studentt("Max", "ADFsd" , 4);
        ht.put(7.8, student1);
        ht.put(9.3, student2);
        ht.put(5.8, student3);
        ht.put(6.0, student4);
        System.out.println(ht);
    }
}
