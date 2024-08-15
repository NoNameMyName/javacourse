package org.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Roma");
        arrayList1.add("Lena");
        arrayList1.add("Kolya");
        arrayList1.add("olya");
        Iterator<String> iterator = arrayList1.iterator();
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        System.out.println(arrayList1);
    }
}
