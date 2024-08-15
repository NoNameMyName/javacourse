package org.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(6);

//        int res = list.stream().reduce((accumulator, el) -> el = accumulator*el).get();
//        Optional<Integer> res2 = list.stream().reduce((accumulator, el) -> el = accumulator*el);
//        if (res2.isPresent()){
//            System.out.println(res2);
//        }
//        else {
//            System.out.println("Not present");
//        }

        List<String> list1 = new ArrayList<>();
        list1.add("Privet");
        list1.add("Poka");
        list1.add("Okey");
        list1.add("Ladno");
        String result = list1.stream().reduce((a, el) -> a+" "+el).get();
        System.out.println(result);

    }
}
