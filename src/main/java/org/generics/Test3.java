package org.generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {

//        List<?> list = new ArrayList<Integer>();
//        list.add("Hello");
        List<? extends Number> list30 = new ArrayList<Integer>();
        List<? extends Number> list = new ArrayList<Integer>();
        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        showListInfo(list1);
        List<String> list2 = new ArrayList<>();
        list2.add("Q");
        list2.add("BB");
        list2.add("OK");
        showListInfo(list2);

        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(3.14);
        doubleArrayList.add(3.15);
        doubleArrayList.add(3.16);
        System.out.println(summ(doubleArrayList));
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(30);
        integerArrayList.add(3);
        integerArrayList.add(33);
        System.out.println(summ(integerArrayList));
    }
    static void showListInfo(List<?> list){
        System.out.println("My list have this el:\n"+ list);
    }
    static double summ(ArrayList<? extends Number> arrayList){
        double summ = 0;
        for (Number n: arrayList
             ) {
            summ+=n.doubleValue();
        }
        return summ;
    }
}
