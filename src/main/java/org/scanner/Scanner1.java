package org.scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite chislo");
        int i = scanner.nextInt();
        System.out.println("To samoe chislo: " + i);
    }

}
