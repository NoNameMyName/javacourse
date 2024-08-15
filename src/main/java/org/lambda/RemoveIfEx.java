package org.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIfEx {
    public static void main(String[] args) {
        ArrayList<String> arl = new ArrayList<>();
        arl.add("Hello");
        arl.add("Privet");
        arl.add("Poka");
        arl.add("Oke");
        arl.add("Java");
        arl.removeIf(s -> s.length() < 5);
        Predicate<String> pr = element -> element.length() < 5;
        System.out.println(arl);
    }
}
