package org.generics;

public class ParametrizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Asd", 2);
        System.out.println("znach pairi: \nvalue1: " + pair1.getValue1() + "\nvalue2: " + pair1.getValue2());
        Pair<String, Double> pair2 = new Pair<>("asdffds", 3.14);
        System.out.println("znach pair2: \nvalue1: " + pair2.getValue1() + "\nvalue2: " + pair2.getValue2());
        OtherPair<String> otherPair1 = new OtherPair<>("sdfg", "fsdfg");
        System.out.println("znach otherpair1: \nvalue1: " + otherPair1.getValue1() + "\nvalue2: " + otherPair1.getValue2());
    }
}
class Pair<V1, V2>{
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getValue1() {
        return value1;
    }

    public V2 getValue2() {
        return value2;
    }
}
class OtherPair<V>{
    private V value1;
    private V value2;

    public OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getValue1() {
        return value1;
    }

    public V getValue2() {
        return value2;
    }
}