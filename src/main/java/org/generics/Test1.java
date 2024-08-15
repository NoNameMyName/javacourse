package org.generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
//        list.add("asd");
//        list.add(5);
//        list.add(new StringBuilder("sfd"));
//        list.add(new Car());
        list.add("Privet");
        list.add("Poka");
        list.add("ok");
        list.add("sadfa");

        for (String el: list) {
            System.out.println(el + " dlinna " + el.length());
        }
    }
}
class Car {
}
