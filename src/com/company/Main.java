package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String a1 = "jkDS@jn_545";
        String a2 = "hjLb_15kjn1";
        String a3 = "j";
        String a4 = "hLjb_1";
        String a5 = "hhgOhbb_151";

        Pattern b = Pattern.compile("^[a-z0-9A-Z_]{3,15}$" );
        Matcher c1 = b.matcher(a1);
        Matcher c2 = b.matcher(a2);
        Matcher c3 = b.matcher(a3);
        Matcher c4 = b.matcher(a4);
        Matcher c5 = b.matcher(a5);

        System.out.println(c1.matches());
        System.out.println(c2.matches());
        System.out.println(c3.matches());
        System.out.println(c4.matches());
        System.out.println(c5.matches());

    }
}
