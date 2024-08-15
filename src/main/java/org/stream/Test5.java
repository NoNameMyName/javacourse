package org.stream;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        int [] array = {3, 8, 1, 5, 9, 14, 2, 21, 81, 7, 18};
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));
    }
}
