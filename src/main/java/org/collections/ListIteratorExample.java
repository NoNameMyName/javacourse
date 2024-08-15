package org.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        String s = "Radar";
        s = s.toLowerCase();
        List<Character> list = new LinkedList<>();
        for (char ch: s.toCharArray()
             ) {
            list.add(ch);
        }
        System.out.println(list);
        ListIterator<Character> listIterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());
        boolean isPalindrome = true;
        while (listIterator.hasNext() && reverseIterator.hasPrevious()){
            if (listIterator.next() != reverseIterator.previous()){
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome)
            System.out.println(s + " is palindrome");
        else
            System.out.println(s + " isn`t palindrome");
    }
}
