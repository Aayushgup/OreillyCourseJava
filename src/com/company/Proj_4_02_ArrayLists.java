package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj_4_02_ArrayLists {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String>names=new ArrayList<>();
        ArrayList<Integer>ages=new ArrayList<>();
        String name;
        int age;
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter your name and age: ");
            name=sc.next();
            age=sc.nextInt();
            sc.nextLine();
            names.add(name);
            ages.add(age);
        }
        for(int i=0;i<5;i++)
            System.out.println(names.get(i)+" is "+ages.get(i)+" years old.");
    }
}
