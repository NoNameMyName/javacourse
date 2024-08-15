package org.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Privet");
        list.add("Kak dela");
        list.add("Ok");
        list.add("Poka");

        List<Integer> list2 = list.stream().map(element -> element.length()).collect(Collectors.toList());

        System.out.println(list2);

        int[] array = {5, 9, 3, 8, 1};

        array = Arrays.stream(array).map(element -> {
            if (element % 3 == 0){
                element = element / 3;
            }
            return element;
        }).toArray();
        System.out.println(Arrays.toString(array));
        Set<String> set = new TreeSet<>();
        set.add("Privet");
        set.add("Kak dela");
        set.add("Ok");
        set.add("Poka");
        System.out.println(set);
        Set<Integer> set2 = set.stream().map(e -> e.length()).collect(Collectors.toSet());
        System.out.println(set2);
    }
}
