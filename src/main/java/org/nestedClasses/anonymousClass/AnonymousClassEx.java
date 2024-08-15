package org.nestedClasses.anonymousClass;

public class AnonymousClassEx {
    public static void main(String[] args) {
        Math math = new Math() {
            int c = 10;
            void abc(){}
            @Override
            public int doOperation(int a, int b) {
                return a*b;
            }
        };

        Math math2 = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a+b;
            }
        };
        System.out.println(math.doOperation(5, 4));
        System.out.println(math2.doOperation(4, 4));
    }
}

interface Math{
    int doOperation(int a, int b);
}