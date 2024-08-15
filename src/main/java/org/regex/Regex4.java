package org.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex4 {
    public static void main(String[] args) {
        String s1 = "35312424645336451793456;" +
                    "13451254632675636543535;" +
                    "12334387664765856345464";
        Pattern pattern =
                Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        Matcher matcher = pattern.matcher(s1);
        String myNewString = matcher.replaceAll("");

    }
}
