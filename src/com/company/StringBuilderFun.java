package com.company;

public class StringBuilderFun {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Aayush kasaudhan");
        sb.append(" is awesome");
        System.out.println(sb);
        sb.insert(6," hello");
        System.out.println(sb);
        sb.replace(6,8,"sjjjjs");
        sb.delete(6,8);
        System.out.println(sb);


    }
}
