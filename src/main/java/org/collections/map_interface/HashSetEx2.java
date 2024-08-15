package org.collections.map_interface;

import java.util.HashSet;

public class HashSetEx2 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(1);
        set.add(3);
        set.add(8);
        set.add(2);
        System.out.println(set);
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(7);
        set2.add(4);
        set2.add(3);
        set2.add(8);
        set2.add(5);
        System.out.println(set2);
        HashSet<Integer> union = new HashSet<>(set);
        union.addAll(set2);
        System.out.println(union);

        HashSet<Integer> intersect = new HashSet<>(set);
        intersect.retainAll(set2);
        System.out.println(intersect);

        HashSet<Integer> subtract = new HashSet<>(set);
        subtract.removeAll(set2);
        System.out.println(subtract);
    }
}
