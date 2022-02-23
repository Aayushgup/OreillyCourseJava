package com.company;

import java.util.ArrayList;

public class WrapperFun {
    public static void main(String[] args) {
        ArrayList<Integer> myList=new ArrayList<>();
        myList.add(10);
        myList.add(20);
        myList.add(202);
        for(int num:myList)
            System.out.println(num);
        String s="3.14272";
        double num =Double.parseDouble(s);
        System.out.println(num);
    }
}
