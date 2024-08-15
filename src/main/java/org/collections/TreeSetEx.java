package org.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(10);

        treeSet.remove(2);
//        treeSet.add(null);
        System.out.println(treeSet);
        System.out.println(treeSet.contains(2));
    }
}
