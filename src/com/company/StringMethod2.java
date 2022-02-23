package com.company;

import java.util.Locale;

public class StringMethod2 {
    public static void main(String[] args) {
        String name="Aayush Kasaudhan";
        String upper =name.toUpperCase();
        String lower= name.toLowerCase();
        System.out.println(lower);
        int index=name.indexOf(" ");
        System.out.println(name.substring(0,index));
        System.out.println(name.substring(index+1));
        System.out.println(name);

    }
}
