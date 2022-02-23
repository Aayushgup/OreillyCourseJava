package com.company;

public class MethodDemo {
    public static void main(String[] args) {
        double num=5;
        double result =square(num);
        System.out.println("square of num is "+result);
    }
    public static double square(double num) {
        return num * num;
    }
}
