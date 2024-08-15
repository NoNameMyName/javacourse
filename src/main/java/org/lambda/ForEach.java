package org.lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = List.of("Privet", "Kak dela", "Normalno", "Poka");
        for (String s: list) {
            System.out.println(s);
        }
        list.forEach(s -> System.out.println(s));
        List<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(2);
        list2.add(8);
        list2.add(12);
        list2.add(3);
        list2.forEach(i -> {
            System.out.println(i);
            i++;
            System.out.println(i);
        });
    }
}
