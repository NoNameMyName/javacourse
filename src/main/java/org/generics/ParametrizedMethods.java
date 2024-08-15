package org.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class ParametrizedMethods {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(10);
        arrayList1.add(5);
        arrayList1.add(12);
        int a = GenMethod.getSecondElement(arrayList1);
        System.out.println(a);
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("sadf");
        arrayList2.add("saffg");
        arrayList2.add("ertsd");
        String s = GenMethod.getSecondElement(arrayList2);
        System.out.println(s);
    }

}

class GenMethod{
    public static <T> T getSecondElement(ArrayList<T> el){
        return el.get(1);
    }
}