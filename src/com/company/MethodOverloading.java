package com.company;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(getResult(1));
        System.out.println(getResult(1,4));
        System.out.println(getResult("aayush","gupta"));
    }
    public static int getResult(int num){
        return num;
    }
    public static int getResult(int num1, int num2){
        return num1+num2;
    }
    public static String getResult(String num1, String num2){
        return num1+num2;
    }
}
