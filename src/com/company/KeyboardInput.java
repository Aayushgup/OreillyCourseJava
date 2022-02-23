package com.company;

import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        System.out.println("enter your name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("enter your age :");
        int age = sc.nextInt();
        sc.nextLine();// to consume newline
        System.out.println("enter your city :");
        String city = sc.nextLine();
        System.out.println("name : " + name + " age :" + age + "city: " + city);
    }
}
