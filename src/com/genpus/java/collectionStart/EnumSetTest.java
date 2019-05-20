package com.genpus.java.collectionStart;

import java.util.EnumSet;

public class EnumSetTest {
    public static void main(String[] args) {
        EnumSet es = EnumSet.allOf(Season.class);
        System.out.println(es);

        // null
        EnumSet es2 = EnumSet.noneOf(Season.class);
        System.out.println(es2);

        es2.add(Season.SPRING);
        es2.add(Season.SUMMER);

        System.out.println(es2);

        EnumSet es3 ;
        es3 = EnumSet.range(Season.SPRING, Season.FALL);

        System.out.println(es3);

        System.out.println(EnumSet.complementOf(es3));

    }
}

enum Season
{
    SPRING, SUMMER, FALL, WINTER
}
