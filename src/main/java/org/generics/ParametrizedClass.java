package org.generics;

public class ParametrizedClass {
    public static void main(String[] args) {
//        Info<String> info1 = new Info<>("sad");
//        System.out.println(info1);
//        String s = info1.getValue();
//        Info<Integer> info2 = new Info<>(1);
//        System.out.println(info2);
//        Integer d = info2.getValue();
//        Info<Double> info4 = new Info<>(3.14);
//        System.out.println(info4);
//        Double db1 = info4.getValue();
//        Info<Bus> info3 = new Info<>(new Bus());
//        System.out.println(info3);
//        Bus b1 = info3.getValue();
    }
//    public void abc(Info<String> info){
//        String s = info.getValue();
//    }
//    public void abc(Info<Integer> info){
//        Integer i = info.getValue();
//    }
}
class Info <T extends Number&I1&I2>{
    private T value;
    public Info(T value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue() {
        return value;
    }
}

//class Parent{
//    public void abc(Info<String> info){
//        String s = info.getValue();
//    }
//}
//class Child extends Parent{
//    public void abc(Info<Integer> info){
//        Integer i = info.getValue();
//    }
//}

interface I1{}
interface I2{}
class Bus{

}