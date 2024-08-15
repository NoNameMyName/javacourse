package org.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {
        String s =
                "Voldya Ivanov, Ukraine, Dnepr, Peshkow street, 52, Flat 54," +
                        "email: volodya72@gmail.com, Postcode: 49113, Phone number: +380988738471" +
                        "Sergay Mirochnichenko, Ukraine, Kyiv, Kreshatik street, 14, Flat 34," +
                        "email: sergayprs25@gmail.com, Postcode: 49302, Phone number: +380975568147";
//        Pattern pattern = Pattern.compile("\\w+");
//        Pattern pattern = Pattern.compile("\\b\\d{2}\\b");
//        Pattern pattern = Pattern.compile("\\+\\d{12}");
        Pattern pattern = Pattern.compile("\\w+@\\w+\\.com");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()){
            System.out.println("Position: " + matcher.start() + "\t" + matcher.group());
        }
    }
}
